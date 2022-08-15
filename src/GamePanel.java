import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel
        extends JPanel
        implements KeyListener,ActionListener{

    private Food food;
    private Snake player;
    private boolean state;
    private GameFrame game;

    private Timer t = new Timer(100,this);

    GamePanel(GameFrame g){
        t.start();
        state = true;
        game = g;
        player = getPlayer();
        food = getFood();

        this.addKeyListener(this);
        this.setVisible(true);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);


    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();

        if (keycode == KeyEvent.VK_W || keycode == KeyEvent.VK_UP){
            player.up();
        }
        else if (keycode == KeyEvent.VK_S || keycode == KeyEvent.VK_DOWN){
            player.down();
        }
        else if (keycode == KeyEvent.VK_D || keycode == KeyEvent.VK_RIGHT){
            player.right();
        }
        else if (keycode == KeyEvent.VK_A || keycode == KeyEvent.VK_LEFT){
            player.left();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Snake getPlayer() {
        return player;
    }

    public void setPlayer(Snake player) {
        this.player = player;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
