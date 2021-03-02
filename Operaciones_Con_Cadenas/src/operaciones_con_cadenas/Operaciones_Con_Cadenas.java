
package operaciones_con_cadenas;

import java.util.Scanner;

public class Operaciones_Con_Cadenas {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Selecciona la operacion\n"
                + "1.Tamaño de la cadena \n"
                + "2.Subcadena\n"
                + "3.Comparacion de palabras\n"
                + "4.Comparacion de tamaño");
        int op=sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingresa una cadena");
                String tamcadena=sc.next();
                System.out.println("El tamaño de la cadena es: "+tamcadena.length());
                break;
                
            case 2:
                System.out.println("Ingresa una cadena");
                String subcadena=sc.next();
                System.out.println("Ingrese el indice inicial");
                int IndiceInicial=sc.nextInt();
                System.out.println("Ingrese el indice final");
                int IndiceFinal=sc.nextInt();
                if(subcadena.length()>=IndiceFinal){
                    String Subcadena= subcadena.substring(IndiceInicial, IndiceFinal);
                    System.out.println("La cadena resultante es: "+Subcadena);
                }else{
                    System.out.println("El indice final ingresado supera al tamaño de la cadena");
                }
                break;
                
            case 3:
                System.out.print("Ingresa dos palabras \nPalabra 1: ");
                String palabra1=sc.next();
                System.out.print("Palabra 2: ");
                String palabra2=sc.next();
                System.out.println("Desea ignorar mayusculas?\n1. SI  2.NO");
                int opc1=sc.nextInt();
                
                switch (opc1){
                    case 1:
                        if (palabra1.equalsIgnoreCase(palabra2)){
                            System.out.println("Las palabras son iguales");
                        }
                        else{
                            System.out.println("Las palabras no son iguales");
                        }
                        break;
                    case 2:
                        if(palabra1.equals(palabra2)){
                            System.out.println("Las palabras son iguales");
                        }else{
                            System.out.println("No son iguales");
                        }
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                        break;
                }
                
                break;
            case 4:
                String frase1="", frase2="";
                System.out.println("Ingresa tus frases o palabra");
                System.out.print("No1: ");
                sc.nextLine();
                frase1=sc.nextLine();
               
                System.out.print("No. 2: ");
                frase2=sc.nextLine();
                System.out.println("Desea ignorar los espacios en blanco?");
                System.out.println("1. Si   2.No");
                int opc2=sc.nextInt();
                switch (opc2){
                    case 1:
                        String x=frase1.replaceAll("\\s","");
                        String x1=frase2.replaceAll("\\s","");
                        int tamx=x.length();
                        int tamx1=x1.length();
                        if(tamx==tamx1){
                            System.out.println("El tamaño de la primera cadena es: "+tamx+"\nEl tamaño de la "
                                    + "segunda cadena es de: "+tamx1);
                            System.out.println("Las cadenas son del mismo tamaño");
                        }else{
                            System.out.println("El tamaño de la primera cadena es: "+tamx+"\nEl tamaño de la "
                                    + "segunda cadena es de: "+tamx1);
                            System.out.println("Las cadenas no tienen el mismo tamaño");
                        }
                        break;
                    case 2:
                        int j=frase1.length();
                        int i=frase2.length();
                        
                        if(j==i){
                            System.out.println("Las cadenas son del mismo tamaño");
                        }else{
                            System.out.println("Las cadenas no tienen el mismo tamaño");
                        }
                        
                        
                        break;
                    default:
                        break;
                }
                break;
        }
        
        
    }
    
}
