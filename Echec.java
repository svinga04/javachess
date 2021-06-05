
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Echec extends JFrame implements ActionListener, MouseListener {
    Rectangle plateau[][];
    Disc pions[][];
    public Echec() {
        super("Jeu d'échecs");
        setLocation(200,200);
        setSize(700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        plateau = new Rectangle[8][8];
        pions = new Disc[2][16];
        int ind = 0 , ind2 = 0;
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++){  
                plateau[i][j] = new Rectangle(new Point(j*60, i*60+30), 60, 60);
                if(i>1){
                    ind=1;
                }
                if(i==0 || i==1 || i==6 || i==7){
                    pions[ind][ind2] = new Disc(new Point(j*60+30, i*60+30+30), 15);
                    ind2 = (ind2+1)%16;
                }
                
            }
        }
        addMouseListener(this);
        setVisible(true);
    }


    public void changeColor(ObjetGraphique o){
        Color[] couleur = {Color.gray, Color.cyan,Color.red, Color.green, Color.magenta, Color.orange,
                            Color.yellow, Color.blue};
        int i;
        for(i=0; i<couleur.length; i++){
            if(couleur[i] == o.getColor())break;
        }
        i = (i+1)%8;
        o.setColor(couleur[i]);
    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
       
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++){   
                if((i%2==0 && j%2!=0)||(j%2==0 && i%2!=0))g.setColor(Color.YELLOW);
                else g.setColor(Color.WHITE); 
                plateau[i][j].draw(g);
            }
        }

        for(int i=0; i<2;i++){
            for(int j=0;j<16;j++){   
                if (i==1) g.setColor(Color.pink);
                else g.setColor(Color.blue);

                pions[i][j].draw(g);
            }
        }
        
    }


    public static void main(String[] args) {
        new Echec();
    }


   

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
        for(int i=0; i<2;i++){
            for(int j=0;j<16;j++){   
                if(pions[i][j].contain(e.getX(), e.getY())){
                    pions[i][j].setBorderC(Color.GREEN);
                    pions[i][j].setRayon(20);       
                }
                else{
                    pions[i][j].setBorderC(Color.BLACK);
                    pions[i][j].setRayon(15);
                    
                }
            }
        }
        repaint();
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
