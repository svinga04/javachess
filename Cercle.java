import java.awt.*;

public class Cercle extends ObjetGraphique {
    Point center;
    int rayon;

    public Cercle(Point c, int r){
        center = c;
        rayon = r;
    }

    public void setLocation(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public void setRayon(int r){
        rayon = r;
    }

    public int getRayon(){ return(rayon); }
    public Point getLocation(){ 
        return(center);
    }

    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawOval(center.getX()-rayon, 
                center.getY()-rayon,
                rayon*2, rayon*2);
    }

    public boolean contain(int vx, int vy){
        int difX = center.getX()-vx;
        int difY = center.getY()-vy;
        int d = difX*difX+difY*difY;    
        int r2 = rayon*rayon;
        return( d <= r2);
    }
}