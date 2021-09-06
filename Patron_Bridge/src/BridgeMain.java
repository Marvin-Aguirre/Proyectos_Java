
public class BridgeMain {
    public static void main (String args[]){
        AbstractFigura af=new Circulo(new Rojo());
        af.Dibujar();;
        af.icolor=new Negro();
        af.Dibujar();
        
        AbstractFigura af2=new Rectangulo(new Rojo());
        af2.Dibujar();;
        
         AbstractFigura af3=new Rectangulo(new Naranja());
         af3.Dibujar();
    }
}
