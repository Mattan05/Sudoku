error id: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java:local1
file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol local1
empty definition using fallback
non-local guesses:

offset: 325
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
        JFrame frame@@ = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();

        
        
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 