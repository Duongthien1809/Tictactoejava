package Game_Tutor.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
     public static int[] state = new int[30];
    static int player = 0;
    static int gewinner = 0;
    JFrame jf;
    Draw draw;
    JButton btnReset;

    static JButton btn[] = new JButton[30];

    public GUI() {
        jf = new JFrame();
        jf.setSize(1050, 1050);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setTitle("TIC TAC TOE");
        // Button erstellen
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            btn[i].setVisible(true);
            btn[i].addActionListener(new ActionHandler());
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            btn[i].setBorder(null);
            jf.add(btn[i]);
        }
        ButtonPlacement.place();

        btnReset = new JButton("RESET");
        btnReset.setBounds(25, 150, 100, 40);
        btnReset.setVisible(true);
        btnReset.setBackground(new Color(51, 102, 153));
        btnReset.setForeground(Color.WHITE);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new ActionListener() {
            // Reset Action
            @Override
            public void actionPerformed(ActionEvent e) {
                Funktion.reset();
            }
        });
        jf.add(btnReset);

        draw = new Draw();
        draw.setBounds(0, 0, 800, 600);
        draw.setVisible(true);
        jf.add(draw);

        jf.setVisible(true);



    }
}
