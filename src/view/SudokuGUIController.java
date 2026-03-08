package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import solver.MySudokuSolver;

public class SudokuGUIController {
    JTextField[][] cells = new JTextField[9][9];

    public SudokuGUIController(MySudokuSolver solver){
        SwingUtilities.invokeLater(()-> createWindow("Sudoku", solver));
    }

    private void createWindow(String title, MySudokuSolver solver){
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();

        JPanel gridPanel = new JPanel(new GridLayout(9,9));

        for(int r = 0; r < 9; r++){
            for(int c= 0; c < 9; c++){
                JTextField textField = new JTextField(1);
                Font newFont = new Font("Arial", Font.BOLD, 25);
                textField.setFont(newFont);
                textField.setHorizontalAlignment(JTextField.CENTER); 
                cells[r][c] = textField;

                if((r/3 + c/3) % 2 == 0) cells[r][c].setBackground(Color.RED);
                
                gridPanel.add(cells[r][c]);
            }
        }

        JButton solve = new JButton("Solve");
        JButton clear = new JButton("Clear");

        clear.addActionListener(e -> {
            solver.clearAll();
            updateGrid(solver.getGrid()); 
            JOptionPane.showMessageDialog(frame, "Rutorna är tömda");
        });

        solve.addActionListener(e -> {
            boolean res = readGrid(solver, frame);

            if(res){
                 boolean isSolved = solver.solve();

                if(isSolved){
                    int[][] gridCopy = solver.getGrid();
                    updateGrid(gridCopy);
                    JOptionPane.showMessageDialog(frame, "Sudokut är löst!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(frame, "Ingen lösning finns", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                clear.doClick();
            }
        });

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(solve);
        buttonPanel.add(clear);

        pane.add(gridPanel, BorderLayout.CENTER);
        pane.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(600,600);
        frame.setVisible(true);
    }

    private boolean readGrid(MySudokuSolver solver, JFrame frame){
        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                String text = cells[r][c].getText();

                if(!text.isEmpty()){ 
                   try{
                        int digit = Integer.parseInt(text);

                        if(digit < 1 || digit > 9){
                            JOptionPane.showMessageDialog(frame, "Fel: Siffror måste vara mellan 1 och 9!", "Error", JOptionPane.ERROR_MESSAGE);
                            return false;
                        }

                        solver.set(r, c, digit);
                   }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(frame, "Fel: Ogiltig inmatning i rutan!", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                   }
                }else{
                    solver.set(r, c, 0);
                }
            }
        }
        return true;
    }

    private void updateGrid(int[][] grid){
        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if(grid[r][c] == 0) {
                    cells[r][c].setText("");   
                } else {
                    cells[r][c].setText(String.valueOf(grid[r][c]));
                }
            }
        }
    }


}