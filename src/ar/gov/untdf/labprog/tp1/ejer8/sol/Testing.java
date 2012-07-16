/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gov.untdf.labprog.tp1.ejer8.sol;

import ar.gov.untdf.labprog.tp1.ejer7.sol.ListaInt;

/**
 *
 * @author Mauro
 */
public class Testing {
    public static void main(String[] args) {

        int [] test={34,6,3,3,5,6,4,434,5,7,8,535,67,8,8,4,63464,7,8,6,86,85,54,6346,346,4,546,985};
        ListaInt l = new ListaInt(test);
        l.printMe();

        // Se busca un entero en la lista con BinarySearch.
        l.search(new SequentialSearch(), 34);
    }
}
