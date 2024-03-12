public class Column extends Composition{
    public Column(Compositor compositor) {
        super(compositor);
    }

    @Override
    public void draw(Window window){
        for(int i=0; i < this.numChild(); i++){
            this.getChild(i).draw(window);
        }
    }
    public Bounds applyBounds(Bounds cursor) {
        this.bounds.xS = cursor.xS;
        this.bounds.yS = cursor.yS;
        this.bounds.xE = cursor.xE; // cursor will send size of children
        this.bounds.yE = cursor.yE; // cursor will send size of children
        return cursor;
    }

}