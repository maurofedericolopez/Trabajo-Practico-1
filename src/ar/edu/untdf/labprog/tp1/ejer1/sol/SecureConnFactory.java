package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class SecureConnFactory implements ConnFactory {

    @Override
    public Conn createConnection(String tipo) {
        String s = tipo.toUpperCase();
        if (s.equals("MYSQL"))
            return new SecureMySQLConn();
        else if (s.equals("ORACLE"))
                 return new SecureOracleConn();
             else if (s.equals("POSTGRES"))
                      return new SecurePostgresConn();
                  else
                      return null;
    }
}
