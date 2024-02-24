import java.util.ArrayList;

// This is simply a collection of glyphs (may or may not be composable)
public abstract class CompositeGlyph implements Glyph{
    ArrayList<Glyph> children;
    Glyph parent;
    Bounds bounds;


    public CompositeGlyph(){
        parent = null;
        children = new ArrayList<>();
    }
    @Override
    public void draw(Window window){

    }
    @Override
    public void remove(Glyph glyph){
        this.children.remove(glyph);
    }
    @Override
    public Glyph getChild(int index){
        return this.children.get(index);
    }
    @Override
    public Glyph getParent(){
        return parent;
    }
    @Override
    public void setParent(Glyph parent){
        this.parent = parent;
    }

}
