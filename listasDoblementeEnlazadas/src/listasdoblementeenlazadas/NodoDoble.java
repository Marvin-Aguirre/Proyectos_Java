/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeenlazadas;

/**
 *
 * @author USUARIO
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;
    
    public NodoDoble (int el, NodoDoble s, NodoDoble a){
        dato=el;
        siguiente=s;
        anterior=a;
    }
    public NodoDoble (int el){
        this(el, null,null);
    }
}
