package ar.gov.untdf.labprog.tp1.ejer12y13.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public abstract class FieldValidator {

    public abstract boolean isValid(String cadena);

    public String validate(String cadena){
        if (this.isValid(cadena))
            return "Valido";
        else
            return "Invalido";
    }
}
