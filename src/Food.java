import java.awt.*;

public class Food {
    private int x;
    private int y;

    public Food(){

    }

    public void random(Snake player){
        x = (int)(Math.random() * GameFrame.width);
        y = (int)(Math.random() * GameFrame.height);

        while(true){
            x = (int)(Math.random() * GameFrame.width);
            y = (int)(Math.random() * GameFrame.height);

            for (Rectangle r : player.getBody())
                if (r.x == x && r.y == y){
                    x = (int)(Math.random() * GameFrame.width);
                    y = (int)(Math.random() * GameFrame.height);
                }
        }
    }
}
