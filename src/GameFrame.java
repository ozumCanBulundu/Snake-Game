import javax.swing.*;

public class GameFrame extends JFrame {

    public static int width = 30;
    public static int height = 30;
    public static int  dimension = 20;

    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(width * dimension, height * dimension);
        this.setLocationRelativeTo(null);

    }
}
