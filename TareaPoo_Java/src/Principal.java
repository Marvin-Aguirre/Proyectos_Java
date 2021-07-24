
public class Principal {
    public static void main(String[] args){
        Aldeano A = new Aldeano();
        A.Nombre();
        A.Vida();
        A.Modificar_Vida();
        
        Heroe H = new Heroe();
        H.Nombre(); 
        H.Vida();
        H.Modificar_Vida();
        
        Elfo E = new Elfo();
        E.Nombre();
        E.Vida();
        E.Modificar_Vida();
        
        Guerrero Guerrero = new Guerrero1();
        Guerrero.Nombre();
        Guerrero.Vida();
        Guerrero.Atacar();
    }
}
