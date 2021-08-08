
import java.util.Scanner;


public class Principal {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("HEORE\n"
                + "Ingresa coordenada X: ");
        int x=sc.nextInt();
       
        System.out.print("Ingrese coordenada Y: ");
        int y=sc.nextInt();
        
        System.out.print("Ingrese nivel de energia:");
        int nivelEnergia=sc.nextInt();
        
        System.out.print("Ingrese numero de vidas: ");
        int noVidas=sc.nextInt();
        
        System.out.print("Ingrese capacidad ofensiva: ");
        int capO=sc.nextInt();
        
        Heroe heroe = new Heroe(x,y,nivelEnergia,noVidas,capO);
        Enemigo enemigo =new Enemigo(x,y,nivelEnergia,noVidas,capO);
        heroe.mostrarDados();;
    }
}
