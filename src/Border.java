// OOP DESIGN PATTERNS:
// Decorator
// Composite


public class Border extends Embellishment{
    int width;
    public Border(Compositor compositor) {
        super(compositor);
        width = 2;
    }
    @Override
    public void draw(Window window){

        window.addBorder(this.bounds.xS,this.bounds.yS,this.bounds.xE,this.bounds.yE,this.width);
        this.getChild(0).draw(window);
    }

    @Override
    public void setPosition(Bounds cursor) {
        // x
        this.bounds.xS = cursor.xS;
        this.bounds.xE = cursor.xS + this.width*2;
        cursor.xS = this.bounds.xS + this.width;
        // y
        this.bounds.yS = cursor.yS;
        this.bounds.yE = cursor.yS + this.width*2;
        cursor.yS = this.bounds.yS + this.width;
    }

    @Override
    public void updateBounds(Bounds cursor, Bounds child) {
        // passing the current cursor, and the new bounds of the child

        // if row got longer, update bounds and cursor
        if (this.bounds.xE > child.xE){
            this.bounds.xE = child.xE + this.width;
            cursor.xS = child.xE;
        }
        // if row got taller, update bounds but keep cursor the same
        if (this.bounds.yE > child.yE){
            this.bounds.yE = child.yE+this.width;
        }
    }

    @Override
    public void setCursor(Bounds cursor) {
        // row is complete, update the cursor for the bounds
        bounds.yE = cursor.yE+width;
        bounds.xE = cursor.xE+width;
        cursor.xS = bounds.xS;
        cursor.yS = bounds.yE;
    }
}