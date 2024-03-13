abstract class Embellishment extends Composition{
    public Embellishment(Compositor compositor) {
        super(compositor);
    }
    @Override
    public void insert(Glyph newGlyph, int index){
        if(index != 0){
//            TODO: throw exception
            System.out.println("WARNING: Attempted to insert multiple glyphs into embellishment");
        }

    }
}
