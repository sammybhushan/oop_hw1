public interface Glyph {
    void draw(Window window);
    void insert(Glyph newGlyph,int index);
    void remove(Glyph glyph);
    void startCompose();
    void compose();
    Glyph getChild(int index);
    Glyph getParent();
    void setParent(Glyph parent);
    void setPosition(Bounds cursor);
    Bounds getBounds();
}
