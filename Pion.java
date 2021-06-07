import java.awt.*;

public class Pion {
    Image img;
   
    public Pion(){
        img =Toolkit.getDefaultToolkit().getImage("pion.png");
    }

    public Image getImage(){return img;}

}
