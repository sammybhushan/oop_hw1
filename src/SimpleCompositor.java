public class SimpleCompositor implements Compositor{

    private Composition rootComposition;
    Bounds cursor;

    public SimpleCompositor() {
        cursor = new Bounds();
    }
    @Override
    public void setComposition(Composition compositionGlyph) {
        this.rootComposition = compositionGlyph;
        // not sure if we need this anymore
    }

    @Override
    public void compose() {

        // create cursor based on parent
        Bounds result;
        result = rootComposition.applyBounds(cursor);
        for (int i =0;i< rootComposition.children.size();i++){
            result = rootComposition.applyBounds(result);
        }
        //for (... child= ...) {
            // ask (leaf) child to set size, based on window
            // ask child to set position, based on cursor
            // ask child to compose itself, recursively
            // ask parent to adjust itself and cursor, based on child
        }
        // ask parent to adjust itself, based on cursor

    }
