package ar.gov.untdf.labprog.tp1.ejer12y13.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class FieldDocumento implements Validator {

    @Override
    public Boolean isValid(String cadena) {
        try {
            Integer documento = Integer.parseInt(cadena);
            return true;
        }catch(NumberFormatException ex) {
            return false;
        }
    }

}