package ar.gov.untdf.labprog.tp1.ejer12y13.sol;

import java.util.ArrayList;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ProvinciaValidator extends FieldValidator {

    private static ArrayList<String> provincias = new ArrayList<String>();
    @Override
    public boolean isValid(String provincia) {
        cargarSet();
        if (provincias.contains(provincia))
            return true;
        else
            return false;
    }

    private void cargarSet() {
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
    }
}