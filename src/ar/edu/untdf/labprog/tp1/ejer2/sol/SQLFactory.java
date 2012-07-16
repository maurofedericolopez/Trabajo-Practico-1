package ar.edu.untdf.labprog.tp1.ejer2.sol;

import ar.edu.untdf.labprog.tp1.ejer4.sol.MsSQLServerAdapter;

/**
 *
 * @author Mauro Federico Lopez
 */
public class SQLFactory extends SQLFactoryMethod {

    @Override
    public Conn createConnection(String nombreConexion) {
        String s = nombreConexion.toUpperCase();
        if (s.equals("MYSQL"))
            return new MySQLConn();
        else if (s.equals("ORACLE"))
                 return new OracleConn();
             else if (s.equals("POSTGRES"))
                      return new PostgresConn();
                  else if (s.equals("MSSQL"))
                           return new MsSQLServerAdapter();
                       else
                           return null;
    }
}
