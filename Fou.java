import java.awt.*;

public class Fou extends Pion {

    public Fou(String c){
        super(c);
    }

    public Image skin(){
        return Toolkit.getDefaultToolkit().getImage("./img/"+couleur+"/fou.png");
    }

}