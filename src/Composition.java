public abstract class Composition extends CompositeGlyph{
    // This is a group of glyphs (composite) that can be composed (call composer)
    Compositor compositor;
    @Override
    public void insert(Glyph newGlyph,int index){
        newGlyph.setParent(this);
        this.children.add(index,newGlyph);
        this.compositor.compose();
    }

    @Override
    public Bounds applyBounds(Bounds cursor) {
        this.bounds.xS = cursor.xS;
        this.bounds.yS = cursor.yS;
        this.bounds.xE = cursor.xE; // cursor will send size of children
        this.bounds.yE = cursor.yE; // cursor will send size of children
        return this.bounds;
    }
}
