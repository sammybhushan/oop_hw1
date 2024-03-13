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
        super.setPosition(cursor);
        cursor.xS=bounds.xS+width;
        cursor.yS=bounds.yS+width;
        cursor.xE=cursor.xE;
        cursor.yE=cursor.yS;
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