package ar.edu.untdf.labprog.tp1.ejer4.sol;

import ar.edu.untdf.labprog.tp1.ejer2.sol.Conn;

/**
 *
 * @author Mauro Federico Lopez
 */
public class MsSQLServerAdapter implements Conn {

    private MsSQLServer ms = new MsSQLServer();

    @Override
    public void connect() {
        ms.getConnect();
    }

    @Override
    public void query() {
        ms.ExecuteQuery();
    }

}
