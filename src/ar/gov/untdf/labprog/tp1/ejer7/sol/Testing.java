package ar.gov.untdf.labprog.tp1.ejer7.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Testing {

    public static void main(String[] args) {

        int [] test={34,6,3,3,5,6,4,434,5,7,8,535,67,8,8,4,63464,7,8,6,86,85,54,6346,346,4,546,985};
        ListaInt l = new ListaInt(test);
        l.printMe();

        // Se ordena la lista con Quicksort.
        l.sort(new Quicksort());
        l.printMe();
    }
}
