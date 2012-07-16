package ar.edu.untdf.labprog.tp1.ejer4.sol;

import ar.edu.untdf.labprog.tp1.ejer2.sol.Conn;
import ar.edu.untdf.labprog.tp1.ejer2.sol.Sql;

/**
 *
 * @author Mauro Federico Lopez
 */
public class MsSQLServerFactoryMethod implements Sql{

    @Override
    public Conn createConnection() {
        return new MsSQLServerAdapter();
    }

}
