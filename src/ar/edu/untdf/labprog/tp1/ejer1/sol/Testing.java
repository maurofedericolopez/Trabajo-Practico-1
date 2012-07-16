package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Testing {

    public static void main(String[] args) {
        Testing t = new Testing();
        Conn conexion;

        // Crear una conexion segura, por ejemplo MySQL.
        conexion = t.crearConexion("mysql","s");
        conexion.connect();

        // Crear una conexion simple, por ejemplo Postgres.
        conexion = t.crearConexion("postgres","");
        conexion.connect();
    }

    public Conn crearConexion(String tipo, String segura) {
        if (segura.toUpperCase().equals("S"))
            return new SecureConnFactory().createConnection(tipo);
        else
            return new SimpleConnFactory().createConnection(tipo);
    }
}
