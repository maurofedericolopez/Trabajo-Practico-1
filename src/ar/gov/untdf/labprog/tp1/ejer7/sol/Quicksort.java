package ar.gov.untdf.labprog.tp1.ejer7.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Quicksort implements Sort {

    private int[] lista;

    private void quicksort(int low,int high) {
        int i=low, j =high;
	int pivot = lista[low + (high-low)/2];
	while (i <= j) {
            while (lista[i] < pivot) {
                i++;
            } // fin del while
            while (lista[j] > pivot) {
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
        int temp = lista[i];
	lista[i] = lista[j];
	lista[j] = temp;
    }

    @Override
    public void sort(int[] lista) {
        this.lista = lista;
        quicksort(0,lista.length-1);
    }
}
