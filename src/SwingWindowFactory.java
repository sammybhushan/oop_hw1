public class SwingWindowFactory extends WindowFactory{
    private static WindowFactory SwingWindowFactory;
    @Override
    Window createMainWindow() {
        return null;
    }
    WindowFactory makeFactory(){
        return new SwingWindowFactory();
    }
}
