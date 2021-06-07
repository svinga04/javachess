import java.awt.*;
import javax.swing.*;

public class Case {
    int x, y;   //Position sur l'échiquier
    Pion cont;
    boolean iselect;

    public Case(int px, int py){
        x = px; y = py;
        cont = null;
        iselect = false;
    }

    public void setContent(Pion p){cont = p;}
    public Pion getContent(){return cont;}

    public boolean pion_In(){return cont != null;}

    public void select(){
        iselect = !iselect;
    }

    public void draw(Graphics g, Component t, int pX, int pY){
        if(pion_In()) {
            //g.fillOval(pX+15+x*50, pY+15+y*50, 20, 20);

            g.drawImage(cont.getImage(), pX+5+x*50, pY+5+y*50, t);

            if(iselect) g.drawRect(pX+5+x*50, pY+5+y*50, 40, 40);
        }
    }

}