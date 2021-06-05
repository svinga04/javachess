import java.awt.*;
//Exo 6
public class Box extends Rectangle {
    Color borderC; //couleur de la bordure
    boolean transparent; //non remplie si true

    public Box(Point pos, int w, int h){
        super(pos, w, h);
        setName("Box");
        borderC = Color.BLACK;
        transparent= false;
    }
    public Color getBorderC(){ return(borderC); }
    public boolean isTransparent(){ return(transparent); }

    public void setBorderC(Color bc){
        borderC = bc;
    }
    public void setTransparent(boolean t){
        transparent = t;
    }

    public void draw(Graphics g){
        if(!transparent){ //on doit remplir la figure
            g.setColor(getColor()); //couleur principale
            g.fillRect(ssg.getX(), ssg.getY(), width, height);
        }
        //on dessine la bordure
        g.setColor(borderC);
        g.drawRect(ssg.getX(), ssg.getY(), width, height);
    }
}   