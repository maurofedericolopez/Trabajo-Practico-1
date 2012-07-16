package ar.edu.untdf.labprog.tp1.ejer4.sol;

import ar.edu.untdf.labprog.tp1.ejer2.sol.Conn;
import ar.edu.untdf.labprog.tp1.ejer2.sol.Sql;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Testing {

    public static void main(String[] args) {
        Sql unSql;
        Conn unaConexion;

        // MsSQLServer
        unSql = new MsSQLServerFactoryMethod();
        unaConexion = unSql.createConnection();
        unaConexion.query();
  }
}
