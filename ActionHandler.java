package Game_Tutor.TicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

 /*
erstellung einen Wert für den Button, dass state[i] 1 oder 2 ist.
  */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (GUI.gewinner == 0) {
            for (int i = 0; i < 30 ; i++) {
                if (e.getSource() == GUI.btn[i]) {
                    if (GUI.state[i] == 0 && GUI.player == 0) {
                        GUI.state[i] = 1;
                        GUI.player = 1;
                    } else if (GUI.state[i] == 0 && GUI.player == 1) {
                        GUI.state[i] = 2;
                        GUI.player = 0;
                    }
                }
            }
        }
        System.out.println(e.getSource());
        System.out.println(GUI.gewinner);
    }
}
