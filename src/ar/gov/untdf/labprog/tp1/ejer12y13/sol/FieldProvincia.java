package ar.gov.untdf.labprog.tp1.ejer12y13.sol;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mauro Federico Lopez
 */
public class FieldProvincia implements Validator {

    private String[] provincias = {"BUENOS AIRES","CORDOBA","SANTA FE","MENDOZA",
        "TUCUMAN","ENTRE RIOS","SALTA","MISIONES",
        "CHACO","CORRIENTES","SANTIAGO DEL ESTERO",
        "SAN JUAN","JUJUY","RIO NEGRO","NEUQUEN","FORMOSA",
        "CHUBUT","SAN LUIS","CATAMARCA","LA RIOJA",
        "LA PAMPA","SANTA CRUZ","TIERRA DEL FUEGO"};

    @Override
    public Boolean isValid(String cadena) {
        String provincia = cadena.toUpperCase();
        List<String> lista = Arrays.asList(provincias);
        if (lista.contains(provincia))
            return true;
        else
            return false;
    }

    /* private void cargarSet() {
        provincias.add("BUENOS AIRES");
        provincias.add("CORDOBA");
        provincias.add("SANTA FE");
        provincias.add("MENDOZA");
        provincias.add("TUCUMAN");
        provincias.add("ENTRE RIOS");
        provincias.add("SALTA");
        provincias.add("MISIONES");
        provincias.add("CHACO");
        provincias.add("CORRIENTES");
        provincias.add("SANTIAGO DEL ESTERO");
        provincias.add("SAN JUAN");
        provincias.add("JUJUY");
        provincias.add("RIO NEGRO");
        provincias.add("NEUQUEN");
        provincias.add("FORMOSA");
        provincias.add("CHUBUT");
        provincias.add("SAN LUIS");
        provincias.add("CATAMARCA");
        provincias.add("LA RIOJA");
        provincias.add("LA PAMPA");
        provincias.add("SANTA CRUZ");
        provincias.add("TIERRA DEL FUEGO");
    }*/

}
