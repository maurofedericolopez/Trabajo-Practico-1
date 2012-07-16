package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Testing {

    public static void main(String[] args) {
        Sql unSql;
        Conn unaConexion;

        // MySQL
        unSql = new MySQLFactoryMethod();
        unaConexion = unSql.createConnection();
        unaConexion.query();
    }
}
