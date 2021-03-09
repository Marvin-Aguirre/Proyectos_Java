
package rueda_de_lafortuna;

import java.util.Scanner;
import java.util.Random;



public class Rueda_De_laFortuna {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd=new Random();
        int date= rnd.nextInt(5);
        int a;
        
        String[] palabras={"TELEFONO","MOTOCICLETA","AUTOMOVIL DEL AÑO","COMPUTADORA","Q. 10,000.00"};
        do{
            System.out.println("\nBIENVENIDO A LA RULETA DE LA FORTUNA!!! \n1-Dar vuelta a la ruleta  \n2. Retirarme del juego"
                    + "\nSelecciona tu opcion:");
            a=sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("TU PREMIO ES:  "+palabras[date]+" FELICIDADES!!!");
                    break;
                case 2:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("ERROR 404 xD");
                    break;
            }
            
        }while(a!=2);     
    }
    
}
