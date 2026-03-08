error id: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java:javax/swing/JFrame#
file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
empty definition using pc, found symbol in pc: javax/swing/JFrame#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 389
uri: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
text:
```scala
package view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SudokuGUIController {
    public SudokuGUIController(){
        SwingUtilities.invokeLater(()-> createWindow("Sudoku"));
    }

    private void createWindow(String title){
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JF@@rame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();

        
        
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: javax/swing/JFrame#