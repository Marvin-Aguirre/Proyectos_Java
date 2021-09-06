
public abstract class AbstractFigura {
    public IColor icolor;

    public AbstractFigura(IColor icolor) {
        this.icolor = icolor;
    }
    public abstract void Dibujar();
        
}
