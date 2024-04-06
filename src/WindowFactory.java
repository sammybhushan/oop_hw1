// Singleton, Abstract Factory
public abstract class WindowFactory {
    private static WindowFactory singleFactory;

    public static WindowFactory getFactory(){
        if (singleFactory == null){
            String windowType = System.getenv("LEXI_WINDOW_TYPE");
            /// DEBUG

            if (windowType == null){
                try {
                    throw new Exception("Look_Feel_Env");
                }catch(Exception E){
                    System.out.println("WARNING: Look and feel window type env variable undefined "+
                            "setting Swing Window by default");
                    singleFactory = SwingWindowFactory.makeFactory();

                    //System.exit(1);
                }
            }
            else if(windowType.equals("AWT")){
                singleFactory = AwtWindowFactory.makeFactory();
            }
            else if(windowType.equals("SWING")){
                singleFactory = SwingWindowFactory.makeFactory();
            }
            else {
                try {
                    throw new Exception("Look_Feel_Env");
                }catch(Exception E){
                    System.out.println("ERR: Look and feel LEXI_WINDOW_TYPE env variable invalid: " + windowType);
                    System.exit(1);
                }
            }
        }
        return singleFactory;
    }
    abstract Window createMainWindow();
//    abstract Label createLabel();

}
