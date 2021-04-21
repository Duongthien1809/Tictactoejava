package Game_Tutor.TicTacToe;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    //private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // ab hier kann man zeichen
        g.setColor(new Color(250, 230, 204));
        g.fillRect(0, 0, 1050, 1050);
        g.setColor(Color.BLACK);
        
        //Vertical
        g.drawLine(175, 50, 175, 950);
        g.drawLine(325, 50, 325, 950);
        g.drawLine(475, 50, 475, 950);
        g.drawLine(625, 50, 625, 950);
        g.drawLine(775, 50, 775, 950);
        g.drawLine(925, 50, 925, 950);
        //Horizontal
        g.drawLine(175, 50, 925, 50);
        g.drawLine(175, 200, 925, 200);
        g.drawLine(175, 350, 925, 350);
        g.drawLine(175, 500, 925, 500);
        g.drawLine(175, 650, 925, 650);
        g.drawLine(175, 800, 925, 800);
        g.drawLine(175, 950, 925, 950);

        // Spieler Anzeigen
        g.setColor(Color.BLACK);
        if (GUI.player == 0) {
            g.drawString("Player X", 25, 50);
        } else if (GUI.player == 1) {
            g.drawString("Player 0", 25, 50);
        }
        //draw gewinner
        if (GUI.gewinner == 1) {
            g.drawString("Gewinne: X", 25, 100);
        } else if (GUI.gewinner == 2) {
            g.drawString("Gewinne: 0", 25, 100);
        }
        //Reihe 1
        if (GUI.state[0] == 1) {
            g.drawImage(ImagerLoader.imgX, 175, 50, 150, 150, null);
        } else if (GUI.state[0] == 2) {
            g.drawImage(ImagerLoader.imgO, 175, 50, 150, 150, null);
        }
        if (GUI.state[1] == 1) {
            g.drawImage(ImagerLoader.imgX, 325, 50, 150, 150, null);
        } else if (GUI.state[1] == 2) {
            g.drawImage(ImagerLoader.imgO, 325, 50, 150, 150, null);
        }
        if (GUI.state[2] == 1) {
            g.drawImage(ImagerLoader.imgX, 475, 50, 150, 150, null);
        } else if (GUI.state[2] == 2) {
            g.drawImage(ImagerLoader.imgO, 475, 50, 150, 150, null);
        }
        if (GUI.state[3] == 1) {
            g.drawImage(ImagerLoader.imgX, 625, 50, 150, 150, null);
        } else if (GUI.state[3] == 2) {
            g.drawImage(ImagerLoader.imgO, 625, 50, 150, 150, null);
        }
        if (GUI.state[4] == 1) {
            g.drawImage(ImagerLoader.imgX, 775, 50, 150, 150, null);
        } else if (GUI.state[4] == 2) {
            g.drawImage(ImagerLoader.imgO, 775, 50, 150, 150, null);
        }

        //Reihe 2
        if (GUI.state[5] == 1) {
            g.drawImage(ImagerLoader.imgX, 175, 200, 150, 150, null);
        } else if (GUI.state[5] == 2) {
            g.drawImage(ImagerLoader.imgO, 175, 200, 150, 150, null);
        }
        if (GUI.state[6] == 1) {
            g.drawImage(ImagerLoader.imgX, 325, 200, 150, 150, null);
        } else if (GUI.state[6] == 2) {
            g.drawImage(ImagerLoader.imgO, 325, 200, 150, 150, null);
        }
        if (GUI.state[7] == 1) {
            g.drawImage(ImagerLoader.imgX, 475, 200, 150, 150, null);
        } else if (GUI.state[7] == 2) {
            g.drawImage(ImagerLoader.imgO, 475, 200, 150, 150, null);
        }
        if (GUI.state[8] == 1) {
            g.drawImage(ImagerLoader.imgX, 625, 200, 150, 150, null);
        } else if (GUI.state[8] == 2) {
            g.drawImage(ImagerLoader.imgO, 625, 200, 150, 150, null);
        }
        if (GUI.state[9] == 1) {
            g.drawImage(ImagerLoader.imgX, 775, 200, 150, 150, null);
        } else if (GUI.state[9] == 2) {
            g.drawImage(ImagerLoader.imgO, 775, 200, 150, 150, null);
        }

        //Reihe 3
        if (GUI.state[10] == 1) {
            g.drawImage(ImagerLoader.imgX, 175, 350, 150, 150, null);
        } else if (GUI.state[10] == 2) {
            g.drawImage(ImagerLoader.imgO, 175, 350, 150, 150, null);
        }
        if (GUI.state[11] == 1) {
            g.drawImage(ImagerLoader.imgX, 325, 350, 150, 150, null);
        } else if (GUI.state[11] == 2) {
            g.drawImage(ImagerLoader.imgO, 325, 350, 150, 150, null);
        }
        if (GUI.state[12] == 1) {
            g.drawImage(ImagerLoader.imgX, 475, 350, 150, 150, null);
        } else if (GUI.state[12] == 2) {
            g.drawImage(ImagerLoader.imgO, 475, 350, 150, 150, null);
        }
        if (GUI.state[13] == 1) {
            g.drawImage(ImagerLoader.imgX, 625, 350, 150, 150, null);
        } else if (GUI.state[13] == 2) {
            g.drawImage(ImagerLoader.imgO, 625, 350, 150, 150, null);
        }
        if (GUI.state[14] == 1) {
            g.drawImage(ImagerLoader.imgX, 775, 350, 150, 150, null);
        } else if (GUI.state[14] == 2) {
            g.drawImage(ImagerLoader.imgO, 775, 350, 150, 150, null);
        }

        //Reihe 4
        if (GUI.state[15] == 1) {
            g.drawImage(ImagerLoader.imgX, 175, 500, 150, 150, null);
        } else if (GUI.state[15] == 2) {
            g.drawImage(ImagerLoader.imgO, 175, 500, 150, 150, null);
        }
        if (GUI.state[16] == 1) {
            g.drawImage(ImagerLoader.imgX, 325, 500, 150, 150, null);
        } else if (GUI.state[16] == 2) {
            g.drawImage(ImagerLoader.imgO, 325, 500, 150, 150, null);
        }
        if (GUI.state[17] == 1) {
            g.drawImage(ImagerLoader.imgX, 475, 500, 150, 150, null);
        } else if (GUI.state[17] == 2) {
            g.drawImage(ImagerLoader.imgO, 475, 500, 150, 150, null);
        }
        if (GUI.state[18] == 1) {
            g.drawImage(ImagerLoader.imgX, 625, 500, 150, 150, null);
        } else if (GUI.state[18] == 2) {
            g.drawImage(ImagerLoader.imgO, 625, 500, 150, 150, null);
        }
        if (GUI.state[19] == 1) {
            g.drawImage(ImagerLoader.imgX, 775, 500, 150, 150, null);
        } else if (GUI.state[19] == 2) {
            g.drawImage(ImagerLoader.imgO, 775, 500, 150, 150, null);
        }

        //Reihe 5
        if (GUI.state[20] == 1) {
            g.drawImage(ImagerLoader.imgX, 175, 650, 150, 150, null);
        } else if (GUI.state[20] == 2) {
            g.drawImage(ImagerLoader.imgO, 175, 650, 150, 150, null);
        }
        if (GUI.state[21] == 1) {
            g.drawImage(ImagerLoader.imgX, 325, 650, 150, 150, null);
        } else if (GUI.state[21] == 2) {
            g.drawImage(ImagerLoader.imgO, 325, 650, 150, 150, null);
        }
        if (GUI.state[22] == 1) {
            g.drawImage(ImagerLoader.imgX, 475, 650, 150, 150, null);
        } else if (GUI.state[22] == 2) {
            g.drawImage(ImagerLoader.imgO, 475, 650, 150, 150, null);
        }
        if (GUI.state[23] == 1) {
            g.drawImage(ImagerLoader.imgX, 625, 650, 150, 150, null);
        } else if (GUI.state[23] == 2) {
            g.drawImage(ImagerLoader.imgO, 625, 650, 150, 150, null);
        }
        if (GUI.state[24] == 1) {
            g.drawImage(ImagerLoader.imgX, 775, 650, 150, 150, null);
        } else if (GUI.state[24] == 2) {
            g.drawImage(ImagerLoader.imgO, 775, 650, 150, 150, null);
        }
        //Reihe 6
        if (GUI.state[25] == 1) {
            g.drawImage(ImagerLoader.imgX, 175, 800, 150, 150, null);
        } else if (GUI.state[25] == 2) {
            g.drawImage(ImagerLoader.imgO, 175, 800, 150, 150, null);
        }
        if (GUI.state[26] == 1) {
            g.drawImage(ImagerLoader.imgX, 325, 800, 150, 150, null);
        } else if (GUI.state[26] == 2) {
            g.drawImage(ImagerLoader.imgO, 325, 800, 150, 150, null);
        }
        if (GUI.state[27] == 1) {
            g.drawImage(ImagerLoader.imgX, 475, 800, 150, 150, null);
        } else if (GUI.state[27] == 2) {
            g.drawImage(ImagerLoader.imgO, 475, 800, 150, 150, null);
        }
        if (GUI.state[28] == 1) {
            g.drawImage(ImagerLoader.imgX, 625, 800, 150, 150, null);
        } else if (GUI.state[28] == 2) {
            g.drawImage(ImagerLoader.imgO, 625, 800, 150, 150, null);
        }
        if (GUI.state[29] == 1) {
            g.drawImage(ImagerLoader.imgX, 775, 800, 150, 150, null);
        } else if (GUI.state[29] == 2) {
            g.drawImage(ImagerLoader.imgO, 775, 800, 150, 150, null);
        }
        repaint();
    }
}
