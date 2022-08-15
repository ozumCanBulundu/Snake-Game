import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Rectangle> body ;

    private String move;

    public Snake(){
        body = new ArrayList<Rectangle>();

        Rectangle rectangle1 = new Rectangle(GameFrame.dimension, GameFrame.dimension);
        rectangle1.setLocation(GameFrame.width * GameFrame.dimension / 2,GameFrame.height * GameFrame.dimension / 2);
        body.add(rectangle1);

        Rectangle rectangle2 =new Rectangle(GameFrame.width,GameFrame.height);
        rectangle2.setLocation((GameFrame.width - 1 )* GameFrame.dimension / 2,
                GameFrame.height * GameFrame.dimension / 2);
        body.add(rectangle2);

        Rectangle rectangle3 =new Rectangle(GameFrame.width,GameFrame.height);
        rectangle3.setLocation((GameFrame.width - 2) * GameFrame.dimension / 2,
                GameFrame.height * GameFrame.dimension / 2);
        body.add(rectangle3);

        move = "nothing";
    }


    public ArrayList<Rectangle> getBody() {
        return body;
    }

    public void setBody(ArrayList<Rectangle> body) {
        this.body = body;
    }



    public void up(){
        move = "up";
    }
    public void down(){
        move = "down";
    }
    public void left(){
        move = "left";
    }
    public void right(){
        move = "right";
    }

}
