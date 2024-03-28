// OOP DESIGN PATTERNS:
// Strategy

public abstract class Composition extends CompositeGlyph{
    // This is a group of glyphs (composite) that can be composed (call composer)
    Compositor compositor;

    public Composition(Compositor compositor){
        this.compositor = compositor;
        compositor.setComposition(this);
    }
    public void startCompose(){
        if(this.getParent() == null){
            // we are at the root, begin composition
            this.compositor.compose();
        }
        else{
            // somewhere in the tree, go up
            this.getParent().startCompose();
        }
    }
    public void compose(){
        this.compositor.compose();
    }
    @Override
    public void insert(Glyph newGlyph,int index){
        newGlyph.setParent(this);
        this.children.add(index,newGlyph);
        compose();
    }
    @Override
    public abstract void setPosition(Bounds cursor);
    public abstract void updateBounds(Bounds cursor, Bounds child);

    abstract public void setCursor(Bounds cursor);

}
