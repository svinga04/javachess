import java.awt.*;

public abstract class Pion {
    Image img;
    String couleur;
   
    public Pion(String c){
        couleur = c;
        img = skin();
    }

    public Image getImage(){return img;}
    public String getColor(){return couleur;}

    public abstract Image skin();

}
