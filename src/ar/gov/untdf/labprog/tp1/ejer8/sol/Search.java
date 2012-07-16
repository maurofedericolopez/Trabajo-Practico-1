package ar.gov.untdf.labprog.tp1.ejer8.sol;

import ar.gov.untdf.labprog.tp1.ejer7.sol.ListaInt;

/**
 *
 * @author Mauro Federico Lopez
 */
public abstract class Search {

    protected ListaInt listaInt;

    public abstract Boolean contains(int buscado);

    /**
     * @param listaInt the lista to set
     */
    public void setListaInt(ListaInt listaInt) {
        this.listaInt = listaInt;
    }

}
