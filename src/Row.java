public class Row extends Composition{
    public Row(Compositor compositor) {
        super(compositor);
    }

    @Override
    public void draw(Window window){
        for(int i=0; i < this.numChild(); i++){
            this.getChild(i).draw(window);
        }
    }

    @Override
    public void setCursor(Bounds cursor) {
        // row is complete, update the cursor for the bounds
        cursor.xS = bounds.xS;
        cursor.yS = bounds.yE;
        cursor.yE = bounds.yE;
        cursor.xE = bounds.xS;
    }
}