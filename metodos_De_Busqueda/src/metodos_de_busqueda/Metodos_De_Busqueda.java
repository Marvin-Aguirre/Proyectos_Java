package metodos_de_busqueda;

import java.util.Random;
import java.util.Scanner;

public class Metodos_De_Busqueda {

    public static void main(String[] args) {

        //Creamos un objeto de la clase Scanner para leer los datos de entreda
        Scanner sc = new Scanner(System.in);
        /*Creamos un objeto de clase Random para generar los numeros aleatorios
         con que se llenara nuestro arreglo*/
        Random rnd = new Random();
        //Creamos nuestro arreglo 
        int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        //Generamos un numero Aleatorio entre 0 y 20, este sera el nuumero que buscaremos dentro del arreglo
        int numeroBuscado = rnd.nextInt(16);

        int posNumeroBuscado = 0;
        int resultado = 0;
        int min = 0;
        int max = arreglo.length;

        System.out.println("                    ------Encuentra el numero---------\n"
                + "La maquina eligira un numero aleatorio del siguiente vector: \n"
                + "[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16], y encontrara el numero y la posicion\n"
                + "dentro del arreglo  ");

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Elige el metodo de busqueda: \n"
                + "1. Binaria. \n"
                + "2. Secuencial o lineal");
        int op = sc.nextInt();

        switch (op) {

            case 1:

                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Numero por buscar:" + numeroBuscado);
                System.out.println("--------------------------------------------------------------------------");

                for (int i = 0; i < arreglo.length; i++) {

                    posNumeroBuscado = (min + max) / 2;

                    if (arreglo[posNumeroBuscado] == numeroBuscado) {

                        resultado = posNumeroBuscado;
                        System.out.println("Numero encontrado!!" + numeroBuscado);
                        break;

                    } else if (arreglo[posNumeroBuscado] < numeroBuscado) {
                        min = posNumeroBuscado + 1;
                        System.out.println("Numero elegido:  " + arreglo[posNumeroBuscado] + "  (el numero es mas grande)");
                    } else {
                        System.out.println("Numero elegido:  " + arreglo[posNumeroBuscado] + "(el numero es mas pequeño)");
                        max = posNumeroBuscado - 1;
                    }

                }

                System.out.println("el numero " + numeroBuscado + " fue encontrado en la posicion " + resultado);

                break;
                
            case 2:
                
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Numero por buscar:" + numeroBuscado);
                System.out.println("--------------------------------------------------------------------------");
                
                for (int i = 0; i < arreglo.length; i++) {
                    if (arreglo[i] == numeroBuscado) {
                        System.out.println("Numero encontrado!! " + numeroBuscado);
                        break;

                    }else{
                        System.out.println("No encontrado"+" (Posicion: arreglo[ "+i +" ]");
                    }
                }
                break;
                
            default:
                System.out.println("ERROR. Vueleve a intentarlo");
                
        }

    }

}
