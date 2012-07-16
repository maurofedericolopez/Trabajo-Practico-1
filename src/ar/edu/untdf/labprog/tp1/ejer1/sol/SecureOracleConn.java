package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class SecureOracleConn implements Conn {

    @Override
    public void connect() {
        System.out.println("Conectado a Oracle en forma segura");
    }
}
