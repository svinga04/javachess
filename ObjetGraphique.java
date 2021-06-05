import java.awt.*; //Color, Graphics, etc ...

public abstract class ObjetGraphique {
    String name; //nom de l'objet graphique (peu utilisé)
    Color color; //couleur principale (noir par défaut)

    //exo 5
    boolean visible;

    public ObjetGraphique(){
        name = "unknow";
        color = Color.BLACK;
        visible = true; //exo 5
    }

    public String getName(){ return(name);}
    public Color getColor(){ return(color);}
    public void setName(String n){ name = n;}
    public void setColor(Color c){ color=c;}
    public abstract void draw(Graphics g); 
    public abstract boolean contain(int x, int y); 
    //exo 5
    public boolean isVisible(){ return(visible);}
    public void setVisible(boolean v){ visible=v;}
    
}