public class Case {
    int x, y;   //Position sur l'échiquier
    Pion cont;

    public Case(int px, int py){
        x = px; y = py;
        cont = null;
    }

    public boolean pion_In(){return cont != null;}

    public void setContent(Pion p){
        cont = p;
    }
    public Pion getContent(){
        return cont;
    }

}