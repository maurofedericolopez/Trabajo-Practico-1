package ar.gov.untdf.labprog.tp1.ejer7.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Mergesort implements Sort{

    private int[] lista;

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
            helper[i] = lista[i];
	} // fin del for
	int i = low;
	int j = middle + 1;
	int k = low;
	while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                lista[k] = helper[i];
		i++;
            } // fin del if
            else {
                lista[k] = helper[j];
		j++;
            } // fin del else
            k++;
	} // fin del while
	while (i <= middle) {
            lista[k] = helper[i];
            k++;
            i++;
	} // fin del while
    }

    @Override
    public void sort(int[] lista) {
        this.lista = lista;
        mergesort(0,lista.length-1, new int[lista.length]);
    }
}
