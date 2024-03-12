import java.awt.*;
import java.io.Console;

public class Main {
    public static void main(String[] args ){
//        Window my_window = new SwingWindow("FIRST WINDOW");
//        Compositor my_simplecompositor = new SimpleCompositor();
//        Row myRow = new Row(my_simplecompositor);
//        Character my_char = new Character('H', my_window);
//        Character my_char2 = new Character('O',my_window);
//
//        myRow.insert(my_char,0);
////        myRow.compose();
//        myRow.insert(my_char2,1);
//        //
////        my_window.setContents(my_char2);
//        my_window.setContents(my_char);
//        my_window.setContents(my_char2);
//        System.out.println("Testing");

        Window myWindow = new SwingWindow("First Window");
        Compositor mySimpleCompositor = new SimpleCompositor();
        Row myRow = new Row(mySimpleCompositor);
        //Row myRow2 = new Row(mySimpleCompositor);

        Character a = new Character('A',myWindow);
        Character b = new Character('B',myWindow);
        Character c = new Character('C',myWindow);
        Character d = new Character('D',myWindow);
        Character e = new Character('E',myWindow);
        Character f = new Character('F',myWindow);

        myRow.insert(a,0);
        myRow.insert(b,1);
        myRow.insert(c,2);
        myRow.insert(d,3);
        myRow.insert(e,4);
        myRow.insert(f,5);

        myWindow.setContents(myRow);

    }
}
