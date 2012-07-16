package ar.gov.untdf.labprog.tp1.ejer8.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class BinarySearch extends Search {

    @Override
    public Boolean contains(int buscado) {
        if (listaInt.getLista().length == 0) {
            return false;
	}

	int low = 0;
	int high = listaInt.getLista().length-1;

        while(low <= high ) {
            int middle = (low+high) /2; 
            if (buscado > listaInt.getLista()[middle] ){
                low = middle +1;
            } // fin del if
            else if (buscado < listaInt.getLista()[middle]){
                high = middle -1;
            }
            else {
                return true; 
            }
	}
	return false;
    }
}
