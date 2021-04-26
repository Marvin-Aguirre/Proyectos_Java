package necflis_progra1;

import java.util.ArrayList;
import java.util.Scanner;

public class NecFlis_Progra1 {

    public static int selectToPeli;
    public static int dato;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList nombreArray = new ArrayList();
        ArrayList direccionArray = new ArrayList();
        ArrayList edadArray = new ArrayList();
        ArrayList nombrePeliculaArray = new ArrayList();
        ArrayList tipoPeliculaArray = new ArrayList();
        ArrayList generoPeliculaArray = new ArrayList();
        ArrayList sinopsisPeliculaArray = new ArrayList();
        int Opcion_Usuario, Opcion_Cliente, Opcion_SeleccionCliente, Opcion_Peliculas;
        int selectToClient = 0, selectToPeli, cli = 0, contadorPeli = 0;
        String cancion1 = "";

        try {
            do {

                System.out.print("    |    Bienvenidos A NecFlis   | \n\n"
                        + "1. Clientes \n2. Peliculas  \n3. Salir \n"
                        + " Selecciona una de las opciones: ");
                Opcion_Usuario = Integer.parseInt(sc.nextLine());

                switch (Opcion_Usuario) {
                    case 1:

                        System.out.println("\n1. Ver listado de clientes\n2. Crear nuevo cliente\n"
                                + "3. Seleccionar cliente\n4. Atras");
                        Opcion_Cliente = Integer.parseInt(sc.nextLine());

                        switch (Opcion_Cliente) {
                            case 1:

                                if (cli == 0) {
                                    System.out.println("");
                                    System.out.println("---------------------------");
                                    System.out.println("No hay clientes en la lista");
                                    System.out.println("---------------------------");
                                    break;
                                } else {
                                    System.out.println("Listado de clientes:");
                                    System.out.println("------------------------------------------------------------");
                                    for (int j = 0; j < nombreArray.size(); j++) {
                                        String cancion = (String) nombreArray.get(j);
                                        String dir = (String) direccionArray.get(j);
                                        int l = (int) edadArray.get(j);
                                        System.out.println("NOMBRE: " + cancion + " DIRECCION: " + dir + " EDAD: " + l);
                                        System.out.println("-----------------------------------------------------------");
                                    }
                                }

                                break;
                            case 2:

                                cli++;
                                System.out.println("CREAR NUEVO CLIENTE");
                                int op;
                                do {
                                    System.out.println("Desea agregar cliente");
                                    System.out.println("1. SI   2. NO");
                                    op = Integer.parseInt(sc.nextLine());
                                    int a = 0;
                                    if (op == 1) {
                                        a++;
                                        Date[] listaEstudiantes = new Date[a];
                                        int cont = 0;
                                        while (cont < a) {
                                            System.out.println("");
                                            System.out.print("Ingresar el nombre: ");
                                            String Nombre_Cliente = sc.nextLine();
                                            System.out.print("Ingresar direccion: ");
                                            String Direccion_Cliente = sc.nextLine();
                                            System.out.print("Ingresar edad: ");
                                            int Edad_Cliente = Integer.parseInt(sc.nextLine());
                                            Date estudiante = new Date(Nombre_Cliente, Direccion_Cliente, Edad_Cliente);
                                            listaEstudiantes[cont] = estudiante;
                                            cont++;
                                            System.out.println("Cliente almacenado exitosamente\n");
                                        }
                                        System.out.println("Listado de clientes:");
                                        System.out.println("------------------------------------------------------------");
                                        for (int i = 0; i < a; i++) {
                                            Date estudiante = listaEstudiantes[i];
                                            //System.out.println("NOMBRE CLIENTE: "+estudiante.Nombre_Cliente+" DIRECCION CLIENTE: "+estudiante.Direccion_Cliente+"EDAD:"+estudiante.Edad_Cliente);
                                            nombreArray.add(estudiante.Nombre_Cliente);
                                            direccionArray.add(estudiante.Direccion_Cliente);
                                            edadArray.add(estudiante.Edad_Cliente);
                                            for (int j = 0; j < nombreArray.size(); j++) {
                                                String cancion = (String) nombreArray.get(j);
                                                String dir = (String) direccionArray.get(j);
                                                int l = (int) edadArray.get(j);
                                                System.out.println("Nombre: " + cancion + " Direccion: " + dir + " Edad: " + l);
                                                System.out.println("--------------------------------------------------------");
                                            }
                                        }

                                    }

                                } while (op != 2);

                                break;
                            case 3:

                                System.out.println("SELECCIONAR UN CLIENTE:");

                                //do {
                                System.out.println("Listado de clientes:");
                                System.out.println("------------------------------------------------------------");

                                for (int j = 0; j < nombreArray.size(); j++) {
                                    String cancion = (String) nombreArray.get(j);
                                    System.out.println((j + 1) + "." + "  NOMBRE: " + cancion);
                                }

                                if (cli == 0) {
                                    System.out.println("");
                                    System.out.println("-------------------------------------------");
                                    System.out.println("La lista de los clientes se encuentra vacia");
                                    System.out.println("-------------------------------------------");
                                    System.out.println("");
                                } else {
                                    System.out.println("Elegir el cliente deseado");
                                    selectToClient = Integer.parseInt(sc.nextLine());

                                    for (int j = 0; j < nombreArray.size(); j++) {
                                        cancion1 = (String) nombreArray.get(selectToClient - 1);

                                    }
                                    System.out.println("Nombre: " + cancion1);
                                }

                                do {
                                    System.out.print("1. PlayList\n2. Agregar pelicula\n3. Atras\n"
                                            + "Selecciona una de las opciones: ");
                                    Opcion_SeleccionCliente = Integer.parseInt(sc.nextLine());

                                    switch (Opcion_SeleccionCliente) {
                                        case 1:
                                            System.out.println("PlayList de: " + cancion1);
                                            System.out.println("No. " + (dato - 1) + " Nombre de la pelicula " + nombrePeliculaArray.get(dato - 1) + " genero " + generoPeliculaArray.get(dato - 1) + " tipo " + tipoPeliculaArray.get(dato - 1) + " sinopsis " + sinopsisPeliculaArray.get(dato - 1));
                                            System.out.println("");

                                            break;
                                        case 2:
                                            System.out.println("LISTADO DE PELICULAS");
                                            for (int j = 0; j < nombrePeliculaArray.size(); j++) {
                                                String nomPel = (String) nombrePeliculaArray.get(j);
                                                String tipoPel = (String) tipoPeliculaArray.get(j);
                                                String generoPel = (String) generoPeliculaArray.get(j);
                                                String sinopsisPel = (String) sinopsisPeliculaArray.get(j);

                                                System.out.println("-----------------------------------------------");
                                                System.out.println((j + 1) + ".");
                                                System.out.println("Nombre: " + nomPel);
                                                System.out.println("Tipo: " + tipoPel);
                                                System.out.println("Genero: " + generoPel);
                                                System.out.println("Sinopsis: " + sinopsisPel);
                                                System.out.println("------------------------------------------------");
                                            }

                                            System.out.println("");
                                            System.out.println("Elija una pelicula: ");
                                            int p = Integer.parseInt(sc.nextLine());
                                            if (p == 0) {
                                                break;
                                            } else {
                                                System.out.println("Pos. " + (p - 1) + " Nombre de la pelicula  " + nombrePeliculaArray.get(p - 1) + " genero " + generoPeliculaArray.get(p - 1) + " tipo " + tipoPeliculaArray.get(p - 1) + " sinopsis " + sinopsisPeliculaArray.get(p - 1));
                                                System.out.println("");
                                                dato = p;
                                            }
                                            break;
                                        case 3:
                                            break;
                                        default:
                                            System.out.println("Opcion incorrecta");
                                            break;

                                    }

                                } while (Opcion_SeleccionCliente != 3);

                                break;
                            case 4:
                                break;
                        }

                        break;
                    case 2:

                        do {

                            System.out.print("\n1. Ver listado de peliculas\n2. Crear pelicula\n3. Atras\n"
                                    + "Selecciona una de las opciones: ");
                            Opcion_Peliculas = Integer.parseInt(sc.nextLine());
                            switch (Opcion_Peliculas) {
                                //LISTADO DE PELICULAS
                                case 1:
                                    if (contadorPeli == 0) {
                                        System.out.println("");
                                        System.out.println("----------------------------------------");
                                        System.out.println("La lista de peliculas se encuentra vacia");
                                        System.out.println("-----------------------------------------");
                                    } else {

                                        System.out.println("Listado de peliculas");
                                        for (int j = 0; j < nombrePeliculaArray.size(); j++) {
                                            String nomPel = (String) nombrePeliculaArray.get(j);
                                            String tipoPel = (String) tipoPeliculaArray.get(j);
                                            String generoPel = (String) generoPeliculaArray.get(j);
                                            String sinopsisPel = (String) sinopsisPeliculaArray.get(j);
                                            System.out.println("-----------------------------------------------");
                                            System.out.println((j + 1) + "");
                                            System.out.println("Nombre: " + nomPel);
                                            System.out.println("Tipo: " + tipoPel);
                                            System.out.println("Genero: " + generoPel);
                                            System.out.println("Sinopsis: " + sinopsisPel);
                                            System.out.println("------------------------------------------------");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Crear Pelicula");
                                    int op;
                                    do {
                                        System.out.println("Desea agregar una pelicula");
                                        System.out.println("1. SI   2. NO");
                                        op = Integer.parseInt(sc.nextLine());
                                        int a = 0;
                                        if (op == 1) {
                                            a++;
                                            pelicula[] listaPeliculas = new pelicula[a];
                                            int cont = 0;
                                            while (cont < a) {
                                                System.out.println("");
                                                System.out.print("Ingresar el nombre: ");
                                                String Nombre_Pelicula = sc.nextLine();
                                                System.out.print("Ingresar tipo (SERIE/PELICULA): ");
                                                String Tipo_Pelicula = sc.nextLine();
                                                System.out.print("Ingresar genero  (drama, Comedia, terror, suspenso): ");
                                                String Genero_Pelicula = sc.nextLine();
                                                System.out.print("Ingresar sinopsis: ");
                                                String Sinopsis_Pelicula = sc.nextLine();

                                                pelicula cliente = new pelicula(Nombre_Pelicula, Tipo_Pelicula, Genero_Pelicula, Sinopsis_Pelicula);
                                                listaPeliculas[cont] = cliente;
                                                cont++;
                                                contadorPeli++;
                                            }
                                            //System.out.println("LISTAS********");
                                            for (int i = 0; i < a; i++) {
                                                pelicula cliente = listaPeliculas[i];
                                                //System.out.println("NOMBRE CLIENTE: "+estudiante.Nombre_Cliente+" DIRECCION CLIENTE: "+estudiante.Direccion_Cliente+"EDAD:"+estudiante.Edad_Cliente);
                                                nombrePeliculaArray.add(cliente.Nombre_Pelicula);
                                                tipoPeliculaArray.add(cliente.Tipo_Pelicula);
                                                generoPeliculaArray.add(cliente.Genero_Pelicula);
                                                sinopsisPeliculaArray.add(cliente.Sinopsis_Pelicula);
                                            }
                                            System.out.println("Listado de peliculas");
                                            for (int j = 0; j < nombrePeliculaArray.size(); j++) {
                                                String nomPel = (String) nombrePeliculaArray.get(j);
                                                String tipoPel = (String) tipoPeliculaArray.get(j);
                                                String generoPel = (String) generoPeliculaArray.get(j);
                                                String sinopsisPel = (String) sinopsisPeliculaArray.get(j);
                                                System.out.println("-----------------------------------------------");
                                                System.out.println((j + 1) + "");
                                                System.out.println("Nombre: " + nomPel);
                                                System.out.println("Tipo: " + tipoPel);
                                                System.out.println("Genero: " + generoPel);
                                                System.out.println("Sinopsis: " + sinopsisPel);
                                                System.out.println("------------------------------------------------");
                                            }

                                        }

                                    } while (op != 2);
                                    break;
                                case 3:

                                    break;
                                default:
                                    System.out.println("OPCION NO DECLARADA EN EL MENU");
                                    break;
                            }
                        } while (Opcion_Peliculas != 3);

                        break;
                    case 3:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opcion Invalida");
                        break;
                }

            } while (Opcion_Usuario != 3);

        } catch (Exception excepcion) {
            System.out.println("Error");
        }
    }
}
