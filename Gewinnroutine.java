package Game_Tutor.TicTacToe;

import java.util.Timer;
import java.util.TimerTask;

public class Gewinnroutine {
    Timer time;

    public Gewinnroutine() {
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (GUI.gewinner == 0) {
                    /*
                    X Gewinner
                     */
                    /*
                    Horizontal
                     */
                    // Reihe 1
                    if ((GUI.state[0] == 1 && GUI.state[1] == 1 && GUI.state[2] == 1) || (GUI.state[1] == 1 && GUI.state[2] == 1 && GUI.state[3] == 1) || (GUI.state[2] == 1 && GUI.state[3] == 1 && GUI.state[4] == 1)) {
                        GUI.gewinner = 1;
                    }
                    // Reihe 2
                    if ((GUI.state[5] == 1 && GUI.state[6] == 1 && GUI.state[7] == 1) || (GUI.state[6] == 1 && GUI.state[7] == 1 && GUI.state[8] == 1) || (GUI.state[7] == 1 && GUI.state[8] == 1 && GUI.state[9] == 1)) {
                        GUI.gewinner = 1;
                    }
                    // Reihe 3
                    if ((GUI.state[10] == 1 && GUI.state[11] == 1 && GUI.state[12] == 1) || (GUI.state[11] == 1 && GUI.state[12] == 1 && GUI.state[13] == 1) || (GUI.state[12] == 1 && GUI.state[13] == 1 && GUI.state[14] == 1)) {
                        GUI.gewinner = 1;
                    }
                    //Reihe 4
                    if ((GUI.state[15] == 1 && GUI.state[1] == 1 && GUI.state[17] == 1) || (GUI.state[16] == 1 && GUI.state[17] == 1 && GUI.state[18] == 1) || (GUI.state[17] == 1 && GUI.state[18] == 1 && GUI.state[19] == 1)) {
                        GUI.gewinner = 1;
                    }
                    //Reihe 5
                    if ((GUI.state[20] == 1 && GUI.state[21] == 1 && GUI.state[22] == 1) || (GUI.state[21] == 1 && GUI.state[22] == 1 && GUI.state[23] == 1) || (GUI.state[22] == 1 && GUI.state[23] == 1 && GUI.state[24] == 1)) {
                        GUI.gewinner = 1;
                    }
                    //Reihe 6
                    if ((GUI.state[25] == 1 && GUI.state[26] == 1 && GUI.state[27] == 1)||(GUI.state[26] == 1 && GUI.state[27] == 1 && GUI.state[28] == 1)||(GUI.state[27] == 1 && GUI.state[28] == 1 && GUI.state[29] == 1)) {
                        GUI.gewinner = 1;
                    }

                    /*
                    Vertical
                     */
                    // Reihe 1
                    if ((GUI.state[0] == 1 && GUI.state[5] == 1 && GUI.state[10] == 1)||(GUI.state[5] == 1 && GUI.state[10] == 1 && GUI.state[15] == 1)||(GUI.state[10] == 1 && GUI.state[15] == 1 && GUI.state[20] == 1)||(GUI.state[15] == 1 && GUI.state[20] == 1 && GUI.state[25] == 1)) {
                        GUI.gewinner = 1;
                    }
                    // Reihe 2
                    if ((GUI.state[1] == 1 && GUI.state[6] == 1 && GUI.state[11] == 1)||(GUI.state[6] == 1 && GUI.state[11] == 1 && GUI.state[16] == 1)||(GUI.state[11] == 1 && GUI.state[16] == 1 && GUI.state[21] == 1)||(GUI.state[16] == 1 && GUI.state[21] == 1 && GUI.state[26] == 1)) {
                        GUI.gewinner = 1;
                    }
                    // Reihe 3
                    if ((GUI.state[2] == 1 && GUI.state[7] == 1 && GUI.state[12] == 1)||(GUI.state[7] == 1 && GUI.state[12] == 1 && GUI.state[17] == 1)||(GUI.state[12] == 1 && GUI.state[17] == 1 && GUI.state[22] == 1)||(GUI.state[17] == 1 && GUI.state[22] == 1 && GUI.state[27] == 1)) {
                        GUI.gewinner = 1;
                    }
                    //Reihe 4
                    if ((GUI.state[3] == 1 && GUI.state[8] == 1 && GUI.state[13] == 1)||(GUI.state[8] == 1 && GUI.state[13] == 1 && GUI.state[18] == 1)||(GUI.state[13] == 1 && GUI.state[18] == 1 && GUI.state[23] == 1)||(GUI.state[18] == 1 && GUI.state[23] == 1 && GUI.state[28] == 1)) {
                        GUI.gewinner = 1;
                    }
                    //Reihe 5
                    if ((GUI.state[4] == 1 && GUI.state[9] == 1 && GUI.state[14] == 1)||(GUI.state[9] == 1 && GUI.state[14] == 1 && GUI.state[19] == 1)||(GUI.state[14] == 1 && GUI.state[19] == 1 && GUI.state[24] == 1)||(GUI.state[19] == 1 && GUI.state[24] == 1 && GUI.state[29] == 1)) {
                        GUI.gewinner = 1;
                    }

                    /*
                    fallende Linial Steigung
                     */
                    if ((GUI.state[2] == 1 && GUI.state[8] == 1 && GUI.state[14] == 1)||(GUI.state[1] == 1 && GUI.state[7] == 1 && GUI.state[13] == 1)||(GUI.state[7] == 1 && GUI.state[13] == 1 && GUI.state[19] == 1)||(GUI.state[0] == 1 && GUI.state[6] == 1 && GUI.state[12] == 1)||(GUI.state[6] == 1 && GUI.state[12] == 1 && GUI.state[18] == 1)||(GUI.state[12] == 1 && GUI.state[18] == 1 && GUI.state[24] == 1)||(GUI.state[5] == 1 && GUI.state[11] == 1 && GUI.state[17] == 1)||(GUI.state[11] == 1 && GUI.state[17] == 1 && GUI.state[23] == 1)||(GUI.state[17] == 1 && GUI.state[23] == 1 && GUI.state[29] == 1)||(GUI.state[10] == 1 && GUI.state[16] == 1 && GUI.state[22] == 1)||(GUI.state[16] == 1 && GUI.state[22] == 1 && GUI.state[28] == 1)||(GUI.state[15] == 1 && GUI.state[21] == 1 && GUI.state[27] == 1)) {
                        GUI.gewinner = 1;
                    }
                    /*
                    Steigende Linial Steigung
                     */
                    if ((GUI.state[26] == 1 && GUI.state[22] == 1 && GUI.state[18] == 1)||(GUI.state[22] == 1 && GUI.state[18] == 1 && GUI.state[14] == 1)||(GUI.state[27] == 1 && GUI.state[23] == 1 && GUI.state[14] == 1)||(GUI.state[10] == 1 && GUI.state[6] == 1 && GUI.state[2] == 1)||(GUI.state[15] == 1 && GUI.state[11] == 1 && GUI.state[7] == 1)||(GUI.state[11] == 1 && GUI.state[7] == 1 && GUI.state[3] == 1)||(GUI.state[20] == 1 && GUI.state[16] == 1 && GUI.state[12] == 1)||(GUI.state[16] == 1 && GUI.state[12] == 1 && GUI.state[8] == 1)||(GUI.state[12] == 1 && GUI.state[8] == 1 && GUI.state[3] == 1)||(GUI.state[25] == 1 && GUI.state[21] == 1 && GUI.state[17] == 1)||(GUI.state[21] == 1 && GUI.state[17] == 1 && GUI.state[13] == 1)||(GUI.state[17] == 1 && GUI.state[13] == 1 && GUI.state[9] == 1)) {
                        GUI.gewinner = 1;
                    }


                    /*
                    O Gewinner
                     */
                    /*
                    Horizontal
                     */
                    // Reihe 1
                    if ((GUI.state[0] == 2 && GUI.state[1] == 2 && GUI.state[2] == 2) || (GUI.state[1] == 2 && GUI.state[2] == 2 && GUI.state[3] == 2) || (GUI.state[2] == 2 && GUI.state[3] == 2 && GUI.state[4] == 2)) {
                        GUI.gewinner = 2;
                    }
                    // Reihe 2
                    if ((GUI.state[5] == 2 && GUI.state[6] == 2 && GUI.state[7] == 2) || (GUI.state[6] == 2 && GUI.state[7] == 2 && GUI.state[8] == 2) || (GUI.state[7] == 2 && GUI.state[8] == 2 && GUI.state[9] == 2)) {
                        GUI.gewinner = 2;
                    }
                    // Reihe 3
                    if ((GUI.state[10] == 2 && GUI.state[11] == 2 && GUI.state[12] == 2) || (GUI.state[11] == 2 && GUI.state[12] == 2 && GUI.state[13] == 2) || (GUI.state[12] == 2 && GUI.state[13] == 2 && GUI.state[14] == 2)) {
                        GUI.gewinner = 2;
                    }
                    //Reihe 4
                    if ((GUI.state[15] == 2 && GUI.state[1] == 2 && GUI.state[17] == 2) || (GUI.state[16] == 2 && GUI.state[17] == 2 && GUI.state[18] == 2) || (GUI.state[17] == 2 && GUI.state[18] == 2 && GUI.state[19] == 2)) {
                        GUI.gewinner = 2;
                    }
                    //Reihe 5
                    if ((GUI.state[20] == 2 && GUI.state[21] == 2 && GUI.state[22] == 2) || (GUI.state[21] == 2 && GUI.state[22] == 2 && GUI.state[23] == 2) || (GUI.state[22] == 2 && GUI.state[23] == 2 && GUI.state[24] == 2)) {
                        GUI.gewinner = 2;
                    }
                    //Reihe 6
                    if ((GUI.state[25] == 2 && GUI.state[26] == 2 && GUI.state[27] == 2)||(GUI.state[26] == 2 && GUI.state[27] == 2 && GUI.state[28] == 2)||(GUI.state[27] == 2 && GUI.state[28] == 2 && GUI.state[29] == 2)) {
                        GUI.gewinner = 2;
                    }

                    /*
                    Vertical
                     */
                    // Reihe 1
                    if ((GUI.state[0] == 2 && GUI.state[5] == 2 && GUI.state[10] == 2)||(GUI.state[5] == 2 && GUI.state[10] == 2 && GUI.state[15] == 2)||(GUI.state[10] == 2 && GUI.state[15] == 2 && GUI.state[20] == 2)||(GUI.state[15] == 2 && GUI.state[20] == 2 && GUI.state[25] == 2)) {
                        GUI.gewinner = 2;
                    }
                    // Reihe 2
                    if ((GUI.state[1] == 2 && GUI.state[6] == 2 && GUI.state[11] == 2)||(GUI.state[6] == 2 && GUI.state[11] == 2 && GUI.state[16] == 2)||(GUI.state[11] == 2 && GUI.state[16] == 2 && GUI.state[21] == 2)||(GUI.state[16] == 2 && GUI.state[21] == 2 && GUI.state[26] == 2)) {
                        GUI.gewinner = 2;
                    }
                    // Reihe 3
                    if ((GUI.state[2] == 2 && GUI.state[7] == 2 && GUI.state[12] == 2)||(GUI.state[7] == 2 && GUI.state[12] == 2 && GUI.state[17] == 2)||(GUI.state[12] == 2 && GUI.state[17] == 2 && GUI.state[22] == 2)||(GUI.state[17] == 2 && GUI.state[22] == 2 && GUI.state[27] == 2)) {
                        GUI.gewinner = 2;
                    }
                    //Reihe 4
                    if ((GUI.state[3] == 2 && GUI.state[8] == 2 && GUI.state[13] == 2)||(GUI.state[8] == 2 && GUI.state[13] == 2 && GUI.state[18] == 2)||(GUI.state[13] == 2 && GUI.state[18] == 2 && GUI.state[23] == 2)||(GUI.state[18] == 2 && GUI.state[23] == 2 && GUI.state[28] == 2)) {
                        GUI.gewinner = 2;
                    }
                    //Reihe 5
                    if ((GUI.state[4] == 2 && GUI.state[9] == 2 && GUI.state[14] == 2)||(GUI.state[9] == 2 && GUI.state[14] == 2 && GUI.state[19] == 2)||(GUI.state[14] == 2 && GUI.state[19] == 2 && GUI.state[24] == 2)||(GUI.state[19] == 2 && GUI.state[24] == 2 && GUI.state[29] == 2)) {
                        GUI.gewinner = 2;
                    }

                    /*
                    fallende Linial Steigung
                     */
                    if ((GUI.state[2] == 2 && GUI.state[8] == 2 && GUI.state[14] == 2)||(GUI.state[1] == 2 && GUI.state[7] == 2 && GUI.state[13] == 2)||(GUI.state[7] == 2 && GUI.state[13] == 2 && GUI.state[19] == 2)||(GUI.state[0] == 2 && GUI.state[6] == 2 && GUI.state[12] == 2)||(GUI.state[6] == 2 && GUI.state[12] == 2 && GUI.state[18] == 2)||(GUI.state[12] == 2 && GUI.state[18] == 2 && GUI.state[24] == 2)||(GUI.state[5] == 2 && GUI.state[11] == 2 && GUI.state[17] == 2)||(GUI.state[11] == 2 && GUI.state[17] == 2 && GUI.state[23] == 2)||(GUI.state[17] == 2 && GUI.state[23] == 2 && GUI.state[29] == 2)||(GUI.state[10] == 2 && GUI.state[16] == 2 && GUI.state[22] == 2)||(GUI.state[16] == 2 && GUI.state[22] == 2 && GUI.state[28] == 2)||(GUI.state[15] == 2 && GUI.state[21] == 2 && GUI.state[27] == 2)) {
                        GUI.gewinner = 2;
                    }
                    /*
                    Steigende Linial Steigung
                     */
                    if ((GUI.state[26] == 2 && GUI.state[22] == 2 && GUI.state[18] == 2)||(GUI.state[22] == 2 && GUI.state[18] == 2 && GUI.state[14] == 2)||(GUI.state[27] == 2 && GUI.state[23] == 2 && GUI.state[14] == 2)||(GUI.state[10] == 2 && GUI.state[6] == 2 && GUI.state[2] == 2)||(GUI.state[15] == 2 && GUI.state[11] == 2 && GUI.state[7] == 2)||(GUI.state[11] == 2 && GUI.state[7] == 2 && GUI.state[3] == 2)||(GUI.state[20] == 2 && GUI.state[16] == 2 && GUI.state[12] == 2)||(GUI.state[16] == 2 && GUI.state[12] == 2 && GUI.state[8] == 2)||(GUI.state[12] == 2 && GUI.state[8] == 2 && GUI.state[3] == 2)||(GUI.state[25] == 2 && GUI.state[21] == 2 && GUI.state[17] == 2)||(GUI.state[21] == 2 && GUI.state[17] == 2 && GUI.state[13] == 2)||(GUI.state[17] == 2 && GUI.state[13] == 2 && GUI.state[9] == 2)) {
                        GUI.gewinner = 2;
                    }

                }

            }
        }, 0, 150);
    }
}
