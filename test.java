import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test extends JFrame implements MouseListener{
    Image plat;
    Case[][] plateau = new Case[8][8];
    int X_plateau, Y_plateau;

    boolean isSelected; 
    int temp_i, temp_j;
    
    public test(){
        super("Chess");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 100, 600, 600);
        X_plateau = 100; Y_plateau = 100; isSelected = false;
        plat =Toolkit.getDefaultToolkit().getImage("./img/plateau.png");

        // Construction du plateau
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                plateau[i][j] = new Case(i,j);
            }
        }

        for(int i=0; i<8; i++){     //pions blancs et noirs
            plateau[i][1].setContent(new Petitpion("blanc"));
            plateau[i][6].setContent(new Petitpion("noir"));
        }

        //Blanc
        plateau[0][0].setContent(new Tour("blanc")); plateau[7][0].setContent(new Tour("blanc"));
        plateau[1][0].setContent(new Cavalier("blanc")); plateau[6][0].setContent(new Cavalier("blanc"));
        plateau[2][0].setContent(new Fou("blanc")); plateau[5][0].setContent(new Fou("blanc"));
        plateau[3][0].setContent(new Roi("blanc"));     //Roi blanc
        plateau[4][0].setContent(new Dame("blanc"));      //Dame blanc

        //Noir
        plateau[0][7].setContent(new Tour("noir")); plateau[7][7].setContent(new Tour("noir"));
        plateau[1][7].setContent(new Cavalier("noir")); plateau[6][7].setContent(new Cavalier("noir"));
        plateau[2][7].setContent(new Fou("noir")); plateau[5][7].setContent(new Fou("noir"));
        plateau[3][7].setContent(new Roi("noir"));     //Roi blanc
        plateau[4][7].setContent(new Dame("noir"));

        //

        addMouseListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent ae){
        if(ae.getX()<X_plateau || ae.getX()>X_plateau+400) return;  //Clic en dehors du plateau
        if(ae.getY()<Y_plateau || ae.getY()>Y_plateau+400) return;

        int i = (ae.getX()-X_plateau)/50;
        int j = (ae.getY()-Y_plateau)/50;

        System.out.println("Debut:"+isSelected);

        if(!isSelected){
            if(plateau[i][j].pion_In()){
                isSelected = true;
                temp_i = i; temp_j = j;
                plateau[i][j].select();
                repaint();
            }
        }
        else{
            plateau[i][j].setContent(plateau[temp_i][temp_j].getContent());
            plateau[temp_i][temp_j].setContent(null);

            isSelected = false;
            plateau[temp_i][temp_j].select();
            repaint();
        }

        System.out.println("Fin:"+isSelected);
    }

    public void mousePressed(MouseEvent ae){}
    public void mouseReleased(MouseEvent ae){}
    public void mouseEntered(MouseEvent ae){}
    public void mouseExited(MouseEvent ae){}

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawImage(plat, X_plateau, Y_plateau, this);

        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                plateau[i][j].draw(g, this, X_plateau, Y_plateau);
            }
        }
    }

    public static void main(String[] args){
        new test();
    }
}
