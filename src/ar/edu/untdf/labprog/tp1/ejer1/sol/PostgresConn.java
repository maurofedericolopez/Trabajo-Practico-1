package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class PostgresConn implements Conn {

    @Override
    public void connect() {
        System.out.println("Conectado a Postgres");
    }
}
