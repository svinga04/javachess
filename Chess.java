import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Chess extends JFrame implements MouseListener{
    Image plat;

    public Chess(){
        super("Chess");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(800, 100, 600, 600);

        plat =Toolkit.getDefaultToolkit().getImage("plateau.png");

        addMouseListener(this);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent ae){}
    public void mousePressed(MouseEvent ae){}
    public void mouseReleased(MouseEvent ae){}
    public void mouseEntered(MouseEvent ae){}
    public void mouseExited(MouseEvent ae){}

    public void paint(Graphics g){
        g.drawImage(plat, 100, 100, this);
    }

    public static void main(String[] args){
        new Chess();
    }
    
}