package ar.gov.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Testing {

    public static void main(String[] args) {
        Ftp ftp = new Ftp();
        ftp.checkUser("admin");
        ftp.checkPassword("1234");
        System.out.println(ftp.getFile());
        ftp.close();
    }
}
