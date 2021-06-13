import java.awt.*;

public class Roi extends Pion {

    public Roi(String c){
        super(c);
    }

    public Image skin(){
        return Toolkit.getDefaultToolkit().getImage("./img/"+couleur+"/roi.png");
    }

}