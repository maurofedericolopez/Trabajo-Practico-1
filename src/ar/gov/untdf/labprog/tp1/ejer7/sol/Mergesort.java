package ar.gov.untdf.labprog.tp1.ejer7.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Mergesort extends Sort{

    private void mergesort(int low, int high,int[] helper) {		
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(low, middle,helper);
            mergesort(middle + 1, high,helper);
            merge(low, middle, high,helper);
	}
    }

    private void merge(int low, int middle, int high,int [] helper) {
        for (int i = low; i <= high; i++) {
            helper[i] = listaInt.getLista()[i];
	} // fin del for
	int i = low;
	int j = middle + 1;
	int k = low;
	while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                listaInt.getLista()[k] = helper[i];
		i++;
            } // fin del if
            else {
                listaInt.getLista()[k] = helper[j];
		j++;
            } // fin del else
            k++;
	} // fin del while
	while (i <= middle) {
            listaInt.getLista()[k] = helper[i];
            k++;
            i++;
	} // fin del while
    }

    @Override
    public void sort() {
        mergesort(0,listaInt.getLista().length-1, new int[listaInt.getLista().length]);
    }

}
