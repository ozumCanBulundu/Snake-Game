import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener,ActionListener{

    private Food food;
    private Snake snake;

    public Graphics g;

    private Timer t = new Timer(100,this);

    GamePanel(){
        t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        int keycode = e.getKeyCode();

        if (keycode == KeyEvent.VK_W || keycode == KeyEvent.VK_UP){

        }
        else if (keycode == KeyEvent.VK_S || keycode == KeyEvent.VK_DOWN){

        }
        else if (keycode == KeyEvent.VK_D || keycode == KeyEvent.VK_RIGHT){

        }
        else if (keycode == KeyEvent.VK_A || keycode == KeyEvent.VK_LEFT){

        }
    }

    public void paintComponent(Graphics g){

    }

    public void draw(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
