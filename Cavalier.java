import java.awt.*;

public class Cavalier extends Pion {

    public Cavalier(String c){
        super(c);
    }

    public Image skin(){
        return Toolkit.getDefaultToolkit().getImage("./img/"+couleur+"/caval.png");
    }

}