public class SimpleCompositor implements Compositor{

    private Composition composition;
    Bounds cursor;

    public SimpleCompositor() {
        cursor = new Bounds();
    }
    @Override
    public void setComposition(Composition compositionGlyph) {
        this.composition = compositionGlyph;
    }

    @Override
    public void compose() {

        // create cursor based on parent
        cursor.set(this.composition.getBounds());
        for(int i=0; i < this.composition.numChild(); i++){
            this.composition.getChild(i).setPosition(cursor);
            cursor.print();

        }

        //for (... child= ...) {
            // ask (leaf) child to set size, based on window
            // ask child to set position, based on cursor
            // ask child to compose itself, recursively
            // ask parent to adjust itself and cursor, based on child
    }
        // ask parent to adjust itself, based on cursor

}
