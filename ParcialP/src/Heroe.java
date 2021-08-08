
import java.util.Scanner;


public class Heroe extends Personaje{
 
    
    public Heroe (int x, int y,int nivel_Energia, int no_Vidas, int cap_Ofensiva){
        super (x,y,nivel_Energia,no_Vidas, cap_Ofensiva);
        
    }
    public void mochila (){
      //PARA TRES ESPACIOS EN MOCHILA  
    }
    public void mostrarDados(){
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.println("\nHEROE");
        System.out.println("Coordenadas (X,Y): ("+getX()+", "+getY()+")");
        System.out.println("Nivel de Energia: "+ getNivelEnergia()+"\n"
                + "Numero de vidas: "+getNoVidas()+" Vidas"+"\n"
                        + "Capacidad ofensiva: "+getCapOfensiva()+"%");
        
    }
}
