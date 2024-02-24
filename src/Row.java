public class Row extends Composition{
    public Row(Compositor compositor){
        this.compositor = compositor;
        compositor.setComposition(this);
    }
    @Override
    public void draw(Window window){

    }

}