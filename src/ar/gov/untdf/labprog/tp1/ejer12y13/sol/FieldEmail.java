package ar.gov.untdf.labprog.tp1.ejer12y13.sol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mauro Federico Lopez
 */
public class FieldEmail implements Validator{

    @Override
    public Boolean isValid(String cadena) {
        String correo = cadena.toUpperCase();
        if(isEmail(correo))
            return true;
        else
            return false;
    }

    //Método para validar correo electrónico
    public Boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;        
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }        
    }

}
