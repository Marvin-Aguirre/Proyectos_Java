
public class  Elfo extends Personaje {

    @Override
    public void Nombre() {
        System.out.println("ELFO");
    }

    @Override
    public void Vida() {
        System.out.println("200 PUNTOS");
    }

    @Override
    public void Modificar_Vida() {
        System.out.println("LA VIDA NO ES MODIFICABLE");
        System.out.println("--------------------------");
    }
    
}
