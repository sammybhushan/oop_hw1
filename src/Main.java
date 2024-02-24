import java.awt.*;
import java.io.Console;

public class Main {
    public static void main(String[] args ){
        Window my_window = new SwingWindow("FIRST WINDOW");
        Compositor my_simplecompositor = new SimpleCompositor();
        Row myRow = new Row(my_simplecompositor);
        Character my_char = new Character('H', my_window);
        Character my_char2 = new Character('O',my_window);

        myRow.insert(my_char,0);
//        myRow.compose();
        myRow.insert(my_char2,1);
        //
        my_window.setContents(myRow);
//        my_window.setContents(my_char2);
//        my_char.draw(my_window);
        System.out.println("Testing");
    }
}
