package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class PostgresConn implements Conn{

    @Override
     public void connect() {
        System.out.println("Conectado a Postgres");
    }

    @Override
    public void query() {
        System.out.println("Consulta en Postgres");
    }
}
