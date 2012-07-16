package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class OracleFactoryMethod implements Sql {

    @Override
    public Conn createConnection() {
        return new OracleConn();
    }

}
