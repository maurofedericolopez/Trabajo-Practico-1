package ar.gov.untdf.labprog.tp1.ejer7.sol;

import ar.gov.untdf.labprog.tp1.ejer8.sol.Search;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ListaInt {

    private int[] lista;

    public ListaInt(int[] lista) {
        this.lista = lista;
    }

    /**
     * 
     */
    public void printMe() {
        System.out.println();
        System.out.print("(");
        for(int x:lista){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.print(")");
        System.out.println();
    }

    /**
     * Ordena la lista de enteros con el metodo pasado por parametros.
     * @param metodo 
     */
    public void sort(Sort metodo) {
        metodo.sort(lista);
    }

    /**
     * Busca un entero en la lista de enteros con el metodo pasado por parametros
     * @param metodo
     * @param elementoBuscado 
     */
    public void search(Search metodo, int elementoBuscado) {
        System.out.println();
        if (metodo.contains(lista, elementoBuscado))
            System.out.println("El elemento buscado esta en la lista");
        else
            System.out.println("El elemento buscado no esta en la lista");
    }
}
