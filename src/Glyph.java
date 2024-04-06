// OOP DESIGN PATTERNS:
// Decorator
// Composite
public interface Glyph {
    void draw(Window window);
    void insert(Glyph newGlyph,int index);
    int remove(Glyph glyph);
    void startCompose();
    void compose();
    Glyph getChild(int index);
    Glyph getParent();
    void setParent(Glyph parent);
    void setPosition(Bounds cursor);
    void setSize();
    Bounds getBounds();
    void setCursor(Bounds cursor);
}
