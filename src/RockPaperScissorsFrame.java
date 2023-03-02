import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RockPaperScissorsFrame {
    public static void main(String[] args)
    {
        //Declaring Scanners//
        JFrame Frame = new JFrame();
        JPanel Panel = new JPanel();

        //Regular JFrame//
        Frame.setSize(700,700);
        Frame.setTitle("Rock Paper Scissors Game");
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Picture and Header//
        ImageIcon RPSicon = new ImageIcon("src/RPS_Game.png");

        //Scaling//
        Image ScaledImage = RPSicon.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(ScaledImage);

        //header//
        JLabel RPSLabel = new JLabel("ROCK PAPER SCISSORS GAME",ScaledIcon,JLabel.CENTER);

        //Position the Header//
        RPSLabel.setVerticalTextPosition(JLabel.BOTTOM);
        RPSLabel.setFont(new Font("Arial",Font.BOLD,25));

        //Adding to Frame//
        Panel.add(RPSLabel);
        Frame.add(Panel);
        Frame.setVisible(true);







//RPS_Game.png
    }
}
