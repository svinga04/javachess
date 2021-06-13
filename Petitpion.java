import java.awt.*;

public class Petitpion extends Pion {

    public Petitpion(String c){
        super(c);
    }

    public Image skin(){
        return Toolkit.getDefaultToolkit().getImage("./img/"+couleur+"/pion.png");
    }
}