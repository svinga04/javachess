import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test extends JFrame implements MouseListener{
    Image plat;
    Case[][] plateau = new Case[8][8];
    Pion[] p = new Pion[8];
    int X_plateau, Y_plateau;
    boolean isSelected; 
    int temp_i, temp_j;
    
    public test(){
        super("Chess");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(800, 100, 600, 600);
        X_plateau = 100; Y_plateau = 100; isSelected = false;
        plat =Toolkit.getDefaultToolkit().getImage("plateau.png");

        // Construction du plateau
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                plateau[i][j] = new Case(i,j);
            }
        }

        for(int i=0; i<8; i++){
            p[i] = new Pion(i,1);
            plateau[i][1].setContent(p[i]);
        }

        //

        addMouseListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent ae){
        int i = (ae.getX()-X_plateau)/50;
        int j = (ae.getY()-Y_plateau)/50;
        System.out.println("Debut:"+isSelected);

        if(!isSelected){
            if(plateau[i][j].pion_In()){
                isSelected = true;
                temp_i = i; temp_j = j;
                plateau[i][j].getContent().select();
                repaint();
            }
        }
        else{
            plateau[temp_i][temp_j].getContent().setPos(i, j);
            plateau[i][j].setContent(plateau[temp_i][temp_j].getContent());
            plateau[temp_i][temp_j].setContent(null);
            isSelected = false;
            repaint();
        }

        System.out.println("Fin:"+isSelected);
    }

    public void mousePressed(MouseEvent ae){}
    public void mouseReleased(MouseEvent ae){}
    public void mouseEntered(MouseEvent ae){}
    public void mouseExited(MouseEvent ae){}

    public void paint(Graphics g){
        g.drawImage(plat, X_plateau, Y_plateau, this);
        
        for(int i=0; i<8; i++){
            p[i].draw(g, this, X_plateau, Y_plateau);
        }
    }

    public static void main(String[] args){
        new test();
    }
}