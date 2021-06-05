import java.awt.*;

public class Rectangle extends ObjetGraphique {

    Point ssg; //Sommet Supèrieur Gauche
    int width, height;

    public Rectangle(Point pos, int w, int h){
        setName("Rectangle");
        ssg = pos;
        width = w;
        height = h;
    }
    public void setLocation(Point pos){
        ssg=pos;
    }
    public void setDimension(int w, int h){
        width = w; 
        height = h;
    }
    public int getWidth(){ return(width);}
    public int getHeight(){ return(height);};

    public void draw(Graphics g){
        //g.setColor(getColor()); //couleur principale
        //g.drawRect(ssg.getX(), ssg.getY(), width, height);
        g.fillRect(ssg.getX(), ssg.getY(), width, height);
    }
    public boolean contain(int x, int y){
        return( x>=ssg.getX() && x<(ssg.getX()+width)
               && y>=ssg.getY() && y<(ssg.getY()+height) );
    }
}   