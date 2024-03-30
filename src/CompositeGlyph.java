import java.util.ArrayList;

// This is simply a collection of glyphs (may or may not be composable)
public abstract class CompositeGlyph implements Glyph{
    ArrayList<Glyph> children;
    Glyph parent;
    Bounds bounds;


    public CompositeGlyph(){
        parent = null;
        children = new ArrayList<>();
        this.bounds=new Bounds();
    }
    @Override
    public int remove(Glyph glyph){
        int value = this.children.indexOf(glyph);
        this.children.remove(glyph);
        return value;
    }
    @Override
    public Glyph getChild(int index){
        return this.children.get(index);
    }
    public int numChild(){return this.children.size();}
    @Override
    public Glyph getParent(){
        return parent;
    }
    @Override
    public void setParent(Glyph parent){
        this.parent = parent;
    }

    @Override
    public Bounds getBounds() {
        return bounds;
    }
}
