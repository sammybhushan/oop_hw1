public interface Glyph {
    void draw(Window window);
    void insert(Glyph newGlyph,int index);
    void remove(Glyph glyph);
    Glyph getChild(int index);
    Glyph getParent();
    void setParent(Glyph parent);
    Bounds applyBounds(Bounds cursor);
}
