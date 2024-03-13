// OOP DESIGN PATTERNS:
// Composite
public class Character implements Glyph{
    private char character;
    private Glyph parent;
    private Bounds bounds;
    private int height;
    private int width;
    public Character(char newChar,Window window)
    {
        character = newChar;
        height = window.charHeight(newChar);
        width = window.charWidth(newChar);
        bounds = new Bounds();
    }
    @Override
    public void draw(Window window) {
//        window.setContents(this);
        window.drawCharacter(this.character, bounds.xS, bounds.yS);
        System.out.println("DRAWING CHAR " + this.character);
    }
    @Override
    public void insert(Glyph newGlyph,int index){
        try {
            throw new Exception("Invalid Insert");
        }catch(Exception E){
            System.out.println("Cannot insert into char glyph");
        }
    }
    @Override
    public void remove(Glyph glyph){
        try {
            throw new Exception("Invalid Remove");
        }catch(Exception E){
            System.out.println("Cannot remove from char glyph");
        }
    }
    @Override
    public Glyph getChild(int index){
        try {
            throw new Exception("Invalid");
        }catch(Exception E){
            System.out.println("Cannot get child from char glyph");
        }
        return null;
    }

    @Override
    public void startCompose() {
        this.getParent().startCompose();
    }

    @Override
    public void compose(){
        // this doesn't do anything
        // However, it will be called by the compositor as the end of the recursion
//        try {
//            throw new Exception("Invalid");
//        }catch(Exception E){
//            System.out.println("Cannot get child from char glyph");
//        }
    }
    @Override
    public Glyph getParent(){
        return this.parent;
    }
    @Override
    public void setParent(Glyph parent){
        this.parent = parent;
    }
    @Override
    public void setPosition(Bounds cursor) {
        // take the starting x,y location and set bounds accordingly
        this.bounds.xS = cursor.xS;
        this.bounds.yS = cursor.yS;
        this.bounds.xE = cursor.xS + this.height;
        this.bounds.yE = cursor.yS + this.width;

        cursor.xS = this.bounds.xE; // update cursor to xS
//        cursor.xE (un needed???)
        //cursor.yS =
        if(cursor.yE < this.bounds.yE){
            cursor.yE = this.bounds.yE;
        }
//        cursor.xE = ;
//        cursor.yS = ;
//        cursor.yE = ;
    }

    @Override
    public Bounds getBounds() {
        return bounds;
    }
}
