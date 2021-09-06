
public class Circulo extends AbstractFigura{

    public Circulo(IColor icolor) {
        super(icolor);
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando circulo...");
        icolor.pintar();
    }
    
}
