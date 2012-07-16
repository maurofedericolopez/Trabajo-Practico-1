package ar.gov.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public abstract class FtpState {

    protected Ftp miFtp;

    // RESPUESTA DE LOS METODOS POR DEFAULT.

    /**
     * Verifica el usuario.
     * @param user 
     */
    public void checkUser(String user) {
        System.out.println("Error, comando no esperado");
    }

    /**
     * Verifica la contraseña.
     * @param password 
     */
    public void checkPassword(String password) {
        System.out.println("Error, comando no esperado");
    }

    /**
     * Devuelve el archivo.
     * @return 
     */
    public String getFile() {
        return "Error, comando no esperado";
    }

    /**
     * Cierra la conexion.
     */
    public void close() {
        System.out.println("Error, comando no esperado");
    }
}