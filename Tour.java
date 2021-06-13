import java.awt.*;

public class Tour extends Pion {

    public Tour(String c){
        super(c);
    }

    public Image skin(){
        return Toolkit.getDefaultToolkit().getImage("./img/"+couleur+"/tour.png");
    }

}