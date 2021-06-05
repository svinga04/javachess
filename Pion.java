import java.awt.*;

public class Pion {
    int x, y;   //Position sur l'échiquier
    Color c;
    public Pion(int px, int py){
        x = px;
        y = py;
        c = Color.BLACK;
    }

    public int getX(){return x;}
    public int getY(){return y;}

    public void setPos(int px, int py){
        x = px; y = py;
    }

    public void select(){
        c = Color.BLUE;
    }

    public void draw(Graphics g, Component t, int pX, int pY){
        g.setColor(c);
        g.fillOval(pX+15+x*50, pY+15+y*50, 20, 20);
    }
}
