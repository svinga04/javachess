import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawComponent extends JComponent {

    //Liste des objets à dessiner
    Vector<ObjetGraphique> dessins;

    public DrawComponent(){
        dessins = new Vector<ObjetGraphique>();
    }

    public void add(ObjetGraphique og){
        dessins.add(og);
    }

    public void paint(Graphics g){
        for(int i=0; i<dessins.size(); i++){
            ObjetGraphique og = dessins.get(i);
            if(og.isVisible()) og.draw(g);
        }
    }
}