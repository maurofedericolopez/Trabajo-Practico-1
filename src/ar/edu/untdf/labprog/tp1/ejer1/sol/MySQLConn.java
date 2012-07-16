package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class MySQLConn implements Conn {

    @Override
    public void connect() {
        System.out.println("Conectado a MySQL");
    }

    @Override
    public void query() {
        System.out.println("Consulta en MySQL");
    }
}
