import java.awt.*;
//Exo 6
public class Disc extends Cercle {
    Color borderC; //couleur de la bordure
    boolean transparent; //non remplie si true

    public Disc(Point c, int r){
        super(c, r);
        setName("Disc");
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
            //g.setColor(getColor());
            g.fillOval(center.getX()-rayon, 
                    center.getY()-rayon,
                    rayon*2, rayon*2);
        }
        //on dessine la bordure
        g.setColor(borderC);
        g.drawOval(center.getX()-rayon, 
                center.getY()-rayon,
                rayon*2, rayon*2);
    }
}   