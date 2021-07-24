
public class Aldeano extends Personaje {

    @Override
    public void Nombre() {
        System.out.println("ALDEANO");
    }

    @Override
    public void Vida() {
        System.out.println("100 PUNTOS");
    }

    @Override
    public void Modificar_Vida() {
        System.out.println("LA VIDA NO ES MODIFICABLE");
        System.out.println("--------------------------");
    }
}
