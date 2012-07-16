package ar.gov.untdf.labprog.tp1.ejer12y13.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class EmailValidator extends FieldValidator {
    private String[] listaSufijos = {
        ".COM",
        "GMAIL.COM",
        "HOTMAIL.COM",
        "YAHOO.COM.AR"
    };

    @Override
    public boolean isValid(String email) {
        if ( (email.indexOf("@") != -1) & (email.endsWith(listaSufijos[0])) )
            return true;
        else
            return false;
    } // fin del metodo isValid
} // fin de la clase EmailValidator