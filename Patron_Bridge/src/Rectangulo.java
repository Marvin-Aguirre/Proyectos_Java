
public class Rectangulo extends AbstractFigura{

    public Rectangulo(IColor icolor) {
        super(icolor);
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando Rectangulo");
        icolor.pintar();
    }
    
}
