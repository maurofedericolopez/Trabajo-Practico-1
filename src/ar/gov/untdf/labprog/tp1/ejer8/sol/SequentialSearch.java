package ar.gov.untdf.labprog.tp1.ejer8.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class SequentialSearch extends Search {

    @Override
    public Boolean contains(int buscado) {
        for (int i : listaInt.getLista()) {
            if (i == buscado){
                return true;
            }
	}
	return false; 
    }
}
