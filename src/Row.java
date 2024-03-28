public class Row extends Composition{
    public Row(Compositor compositor) {
        super(compositor);
    }

    @Override
    public void setPosition(Bounds cursor) {
        this.bounds.xS = cursor.xS;
        this.bounds.xE = cursor.xS;
        this.bounds.yS = cursor.yS;
        this.bounds.yE = cursor.yS;
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
    public void updateBounds(Bounds cursor, Bounds child){
        // passing the current cursor, and the new bounds of the child

        // if row got longer, update bounds and cursor
        if (this.bounds.xE > child.xE){
            this.bounds.xE = child.xE;
            cursor.xS = child.xE;
        }
        // if row got taller, update bounds but keep cursor the same
        if (this.bounds.yE > child.yE){
            this.bounds.yE = child.yE;
        }
    }
}