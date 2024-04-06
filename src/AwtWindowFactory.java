public class AwtWindowFactory extends WindowFactory{
    private static WindowFactory AwtWindowFactory;
    @Override
    Window createMainWindow() {
        return null;
    }
    WindowFactory makeFactory(){
        if(AwtWindowFactory == null){
            AwtWindowFactory = new AwtWindowFactory();
        }
        return AwtWindowFactory;
    }
}
