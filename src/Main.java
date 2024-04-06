import java.awt.*;
import java.io.Console;

public class Main {
    public static void main(String[] args ){

        Window myWindow = new SwingWindow("First Window");

        // Initial Glyphs & Compositors
        // Composition and
        Column myCol = new Column(new SimpleCompositor());
        Row myRow = new Row(new SimpleCompositor());
        Row myRow2 = new Row(new SimpleCompositor());
        Character a = new Character('A',myWindow);
        Character b = new Character('B',myWindow);
        Character c = new Character('C',myWindow);
        Character d = new Character('D',myWindow);
        Character e = new Character('E',myWindow);
        Character f = new Character('F',myWindow);

        Border myBorder = new Border(new SimpleCompositor());



        // Factory Singleton & Factory designs
        GUIFactory myGUIFactory = GUIFactory.getFactory();
        Button myButton = myGUIFactory.createButton();
        Label myLabel = myGUIFactory.createLabel();

        boolean defaultTest = true;
        boolean debugTest = false;

        if (debugTest){
            myRow.insert(a,0);
            myRow.insert(b,1);
            myBorder.insert(myRow,0);
            myBorder.insert(c,2);
            myCol.insert(myBorder,0);
            myWindow.setContents(myCol);

//            myBorder.insert(myRow,0);
////
//            myButton.insert(myRow2,0);
//            myCol.insert(myButton,1);
////        myWindow.setContents(myRow);
//            myCol.insert(myBorder,0);
////        myB.insert(myBorder,0);
////        myWindow.setContents(myRow);
////        myWindow.setContents(myRow);
////        myWindow.setContents(myRow2);
////        myWindow.setContents(myRow2);
////        myWindow.setContents(myRow2);
//            myWindow.setContents(myCol);
        }


        if(defaultTest){
            // row ABC
            myRow.insert(a,0);
            myRow.insert(b,1);
            myRow.insert(c,2);
            // row2 DEF
            myRow2.insert(d,0);
            myRow2.insert(e,1);
            myRow2.insert(f,2);
            // add rows to column
            myCol.insert(myRow,0);
            myCol.insert(myRow2,1);
            // add border to row2
            myBorder.insert(myRow2,0);
//            // add button to row1
            myButton.insert(myRow,0);
//            // add label to character a
//            myLabel.insert(c,0);

            // draw
            myWindow.setContents(myCol);
        }

    }
}
