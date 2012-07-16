package ar.gov.untdf.labprog.tp1.ejer7.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public abstract class Sort {

    protected ListaInt listaInt;

    public abstract void sort();

    /**
     * @param listaInt the lista to set
     */
    public void setListaInt(ListaInt listaInt) {
        this.listaInt = listaInt;
    }

}
