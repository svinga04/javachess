import java.awt.*;

public class Point extends ObjetGraphique {

    int x, y;

    public Point(int vx, int vy){
        setName("Point"); //facultatif
        x = vx;
        y = vy;
    }   
    public int getX(){ return(x);}
    public int getY(){ return(y);}
    public void setX(int vx){ x=vx; }
    public void setY(int vy){ y=vy; }
    
    public void draw(Graphics g){
        g.setColor(getColor()); //on fixe la couleur principal
        g.drawLine(x,y,x,y); //pas de dessin de point :(( dans Graphics
    }

    public  boolean contain(int vx, int vy){
        return(x==vx && y==vy);
    }
}