package ar.gov.untdf.labprog.tp1.ejer12y13.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class FieldValidator {

    private Validator validador;

    public String validate(String cadena) {
        if(validador.isValid(cadena))
            return "campo válido";
        else
            return "campo inválido";
    }

    /**
     * @return the validador
     */
    public Validator getValidador() {
        return validador;
    }

    /**
     * @param validador the validador to set
     */
    public void setValidador(Validator validador) {
        this.validador = validador;
    }
}
