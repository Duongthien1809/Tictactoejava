package Game_Tutor.TicTacToe;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class ImagerLoader {
    static Image imgX, imgO;
    public ImagerLoader(){
        try {
             imgX = ImageIO.read(new File("D:\\Programme\\Java_Intelij IDEA_tutorials\\src\\Game_Tutor\\TicTacToe\\res\\x.png"));
             imgO = ImageIO.read(new File("D:\\Programme\\Java_Intelij IDEA_tutorials\\src\\Game_Tutor\\TicTacToe\\res\\o.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
