package listasdoblementeenlazadas;

import java.util.Scanner;

public class ListasDoblementeEnlazadas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ListaDoble list = new ListaDoble();
        int op = 0, elemento;

        do {
            System.out.println("\n----------Lista doblemente enlazada----------\n"
                    + "1. Insertar al inicio.\n"
                    + "2. Insertar al final\n"
                    + "3. Recorrer hacia delante\n"
                    + "4. Recorrer hacia atras\n"
                    + "5. Mostrar tamaño de la lista\n"
                    + "6. Mostrar si la lista esta vacia\n"
                    + "7. Buscar elemento por valor\n"
                    + "8. Buscar elemento por indice\n"
                    + "9. Borrar un elemento\n"
                    + "10.Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nIngresa el elemento que deseas agregar");
                    elemento = sc.nextInt();
                    list.agregarAlInicio(elemento);
                    System.out.println("---------------------------------------------------------"
                            + "\nElemento: " + elemento + " fue agregado al inicio de la lista\n"
                            + "---------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("Ingresa el elemento que deseas agregar");
                    elemento = sc.nextInt();
                    list.agregarAlFnal(elemento);
                    System.out.println("\n---------------------------------------------------------"
                            + "\nElemento: " + elemento + " fue agregado al final de la lista\n"
                            + "---------------------------------------------------------");
                    break;

                case 3:
                    if (!list.estaVacia()) {
                        list.mostrarListaIF();
                    } else {
                        System.out.println("La lista se encuentra vacia...\n"
                                + "No hay nodos por mostrar");
                    }
                    break;

                case 4:
                    if (!list.estaVacia()) {
                        list.mostrarListaFI();
                    } else {
                        System.out.println("La lista se encuentra vacia...\n"
                                + "No hay nodos por mostrar");
                    }
                    break;

                case 5:
                    list.tamList();
                    break;

                case 6:
                    if (list.estaVacia()) {
                        System.out.println("La lista se encuentra vacia...aun no se han agregado nodos.\n");
                    } else {
                        System.out.println("\n<<<Lista no vacia>>>");
                        list.tamList();
                    }
                    break;

                case 7:
                    if (list.estaVacia()) {
                        System.out.println("--------------------------\n"
                                + "La lista se encuentra vacia...\n"
                                + "No hay nodos por buscar\n"
                                + "--------------------------");
                    } else {
                        System.out.println("Ingresa el valor del elemento que deseas buscar:");
                        elemento = sc.nextInt();;
                        if (list.buscarElementoPorValor(elemento)) {
                            System.out.println("------------------------------------------------\n"
                                    + "El elemento: " + elemento + " si esta en la lista\n"
                                    + "------------------------------------------------");
                        } else {
                            System.out.println("-------------------------\n"
                                    + "Valor no encontrado...\n"
                                    + "-------------------------");
                        }
                    }

                    break;

                case 8:
                    if (list.estaVacia()) {
                        System.out.println("--------------------------\n"
                                + "La lista se encuentra vacia...\n"
                                + "No hay nodos por buscar\n"
                                + "--------------------------");
                    } else {
                        System.out.println("Ingresa el indice [] del elemento que deseas buscar:");
                        elemento = sc.nextInt();
                        list.mostrarListaIF();
                        list.buscarElemntoPorIndice(elemento);
                    }

                    break;

                case 9:
                    if (list.estaVacia()) {
                        System.out.println("--------------------------\n"
                                + "La lista se encuentra vacia...\n"
                                + "No hay nodos por borrar\n"
                                + "--------------------------");
                    } else {
                        list.mostrarListaIF();
                        System.out.println("\nIngresa el valor del nodo que deseas eliminar:");
                        elemento = sc.nextInt();
                        list.borrarElemento(elemento);
                        System.out.println("\nNueva lista:");
                        list.mostrarListaIF();
                    }

                    break;

                case 10:
                    System.out.println("Finalizando programa!!");
                    break;

                default:
                    System.out.println("Error");

            }

        } while (op != 10);

    }

}
