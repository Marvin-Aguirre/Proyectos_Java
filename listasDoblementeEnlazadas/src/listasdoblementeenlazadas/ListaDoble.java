package listasdoblementeenlazadas;

public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void agregarAlFnal(int dato) {
        if (!estaVacia()) {
            fin = new NodoDoble(dato, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(dato);
        }
    }

    public void agregarAlInicio(int dato) {
        if (!estaVacia()) {
            inicio = new NodoDoble(dato, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(dato);
        }
    }

    public void tamList() {
        if (!estaVacia()) {
            NodoDoble auxiliar = inicio;
            int a = 0;
            while (auxiliar != null) {
                a++;
                auxiliar = auxiliar.siguiente;

            }
            System.out.println("-------------------------------------------------------------"
                    + "\nActualmente se encuentran: " + a + " elementos dentro de la lista\n"
                    + "-------------------------------------------------------------");
        } else {
            System.out.println("\n-----------------------------\n"
                    + "No hay elementos en la lista\n"
                    + "-----------------------------");
        }
    }

    public void mostrarListaIF() {
        if (!estaVacia()) {
            String l = "--";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                l = l + "[" + auxiliar.dato + "]--";
                auxiliar = auxiliar.siguiente;
            }
            System.out.println("----------Recorriendo la lista de inicio a fin----------");
            System.out.println(l);
            System.out.println("--------------------------------------------------------");
        }
    }

    public void mostrarListaFI() {
        if (!estaVacia()) {
            String l = "--";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                l = l + "[" + auxiliar.dato + "]--";
                auxiliar = auxiliar.anterior;
            }
            System.out.println("----------Recorriendo la lista de fin a inicio----------");
            System.out.println(l);
            System.out.println("--------------------------------------------------------");
        }
    }

    public boolean buscarElementoPorValor(int elemento) {
        NodoDoble auxiliar = inicio;
        while (auxiliar != null && auxiliar.dato != elemento) {
            auxiliar = auxiliar.siguiente;
        }
        return auxiliar != null;
    }

    public void buscarElemntoPorIndice(int indice) {
        NodoDoble aux = inicio;
        if (!estaVacia()) {
            NodoDoble auxiliar = inicio;
            int a = 0;
            while (auxiliar != null) {
                a++;
                auxiliar = auxiliar.siguiente;

            }

            if (indice > a) {
                System.out.println("-------------------------------------------\n"
                        + "El arreglo solo contiene: " + a + " posiciones\n"
                        + "-------------------------------------------");

            } else {
                for (int i = 0; i <= a; i++) {
                    if (i == indice) {
                        break;
                    } else {
                        aux = aux.siguiente;
                    }
                }
                System.out.println("\n-----------------------------------------------------------\n"
                        + "En el indice [ " + indice + " ] se encuentra el elemento: " + aux.dato + "\n"
                        + "-----------------------------------------------------------");
            }
        }
    }

    public void borrarElemento(int elemento) {
        NodoDoble actual = inicio;
        NodoDoble atras = null;

        while (actual != null) {
            if (actual.dato == elemento) {
                if (actual == inicio) {
                    inicio = inicio.siguiente;
                    inicio.anterior = null;
                } else if (actual == fin) {
                    atras = actual.anterior;
                    atras.siguiente = null;
                    fin = atras;
                } else {
                    atras.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
            }
            atras = actual;
            actual = actual.siguiente;
        }

    }

}
