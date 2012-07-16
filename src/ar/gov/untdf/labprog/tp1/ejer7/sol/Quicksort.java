package ar.gov.untdf.labprog.tp1.ejer7.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Quicksort extends Sort {

    private void quicksort(int low,int high) {
        int i=low, j =high;
	int pivot = listaInt.getLista()[low + (high-low)/2];
	while (i <= j) {
            while (listaInt.getLista()[i] < pivot) {
                i++;
            } // fin del while
            while (listaInt.getLista()[j] > pivot) {
                j--;
            } // fin del while

            if (i <= j) {
                exchange(i, j);
		i++;
		j--;
            } // fin del if
	}
	// Recursion
	if (low < j)
            quicksort(low, j);
            if (i < high)
                quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = listaInt.getLista()[i];
	listaInt.getLista()[i] = listaInt.getLista()[j];
	listaInt.getLista()[j] = temp;
    }

    @Override
    public void sort() {
        quicksort(0,listaInt.getLista().length -1);
    }
}
