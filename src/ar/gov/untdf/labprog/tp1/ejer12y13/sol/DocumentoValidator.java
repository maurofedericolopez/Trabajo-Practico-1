package ar.gov.untdf.labprog.tp1.ejer12y13.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class DocumentoValidator extends FieldValidator {

    @Override
    public boolean isValid(String documento) {
        if (!documento.equals(""))
            return true;
        else
            return false;
    }
}