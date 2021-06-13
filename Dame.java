import java.awt.*;

public class Dame extends Pion {

    public Dame(String c){
        super(c);
    }

    public Image skin(){
        return Toolkit.getDefaultToolkit().getImage("./img/"+couleur+"/dame.png");
    }

}
