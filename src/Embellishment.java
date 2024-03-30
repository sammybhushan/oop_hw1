// OOP DESIGN PATTERNS:
// Decorator
// Composite
abstract class Embellishment extends Composition{
    public Embellishment(Compositor compositor) {
        super(compositor);
    }
    @Override
    public void insert(Glyph glyph, int index){
        // the glyph here is already part of the document structure
        // the key here is to quietly nest this decorator in here
        if(index != 0){
            // forward this call to the child; embellishment is already embellishing
            this.getChild(0).insert(glyph,index);
        }
        else{
            int previndex = glyph.getParent().remove(glyph);
//             System.out.println("Removed from idx:" + previndex);
            this.setParent(glyph.getParent());
            this.children.add(0,glyph);
            glyph.setParent(this);
//            this.setParent();
            this.getParent().insert(this,previndex);
//            startCompose();
        }
    }
}
