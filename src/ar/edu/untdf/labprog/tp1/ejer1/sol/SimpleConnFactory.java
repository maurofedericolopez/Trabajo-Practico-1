package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class SimpleConnFactory implements ConnFactory {

    @Override
    public Conn createConnection(String tipo) {
        String s = tipo.toUpperCase();
        if (s.equals("MYSQL"))
            return new MySQLConn();
        else if (s.equals("ORACLE"))
                 return new OracleConn();
             else if (s.equals("POSTGRES"))
                      return new PostgresConn();
                  else
                      return null;
    }
}
