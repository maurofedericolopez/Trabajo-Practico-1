package ar.gov.untdf.labprog.tp1.ejer8.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class BinarySearch implements Search {

    @Override
    public Boolean contains(int[] lista, int buscado) {
        if (lista.length == 0) {
            return false;
	} // fin del if

	int low = 0;
	int high = lista.length-1;

        while(low <= high ) {
            int middle = (low+high) /2; 
            if (buscado> lista[middle] ){
                low = middle +1;
            } // fin del if
            else if (buscado< lista[middle]){
                high = middle -1;
            } // fin del else if
            else { // The element has been found
                return true; 
            } // fin del else
	} // fin del while
	return false;
    }
}
