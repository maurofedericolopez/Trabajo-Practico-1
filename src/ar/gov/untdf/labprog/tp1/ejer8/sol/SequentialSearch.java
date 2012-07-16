package ar.gov.untdf.labprog.tp1.ejer8.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class SequentialSearch implements Search {

    @Override
    public Boolean contains(int[] lista, int buscado) {
        for (int i : lista) {
            if (i == buscado){
                return true;
            } // fin del if
	} // fin del for
	return false; 
    }
}
