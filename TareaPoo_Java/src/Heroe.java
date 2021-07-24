
public class Heroe extends Personaje {

    @Override
    public void Nombre() {
        System.out.println("HEROE");
    }

    @Override
    public void Vida() {
        System.out.println("200 PUNTOS");
    }

    @Override
    public void Modificar_Vida() {
        System.out.println("LA VIDA ES MODIFICABLE");
        System.out.println("----------------------");
    }
    
}
