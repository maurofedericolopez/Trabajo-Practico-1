package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Testing {

    public static void main(String[] args) {
        SQLFactory factoria = new SQLFactory();

        // Crear una conexion MySQL.
        Conn conexion = (Conn) factoria.createConnection("mysql");
        conexion.connect();
        conexion.query();

        // Crear una conexion Oracle.
        conexion = (Conn) factoria.createConnection("oracle");
        conexion.connect();
        conexion.query();

        // Crear una conexion Postgres.
        conexion = (Conn) factoria.createConnection("postgres");
        conexion.connect();
        conexion.query();
  }
}
