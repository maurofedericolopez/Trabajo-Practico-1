package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class OracleConn implements Conn {

    @Override
    public void connect() {
        System.out.println("Conectado a Oracle");
    }

    @Override
    public void query() {
        System.out.println("Consulta en Oracle");
    }
}
