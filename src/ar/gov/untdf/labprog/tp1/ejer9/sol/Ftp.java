package ar.gov.untdf.labprog.tp1.ejer9.sol;

/**
 * 
 * @author Mauro Federico Lopez
 */
public class Ftp {

    private static String user = "admin";
    private static String password = "1234";
    private String archivo = "UnArchivo.txt";

    private FtpState estado;

    public Ftp() {
        estado = new Start(this);
    }

    public void checkUser(String user) {
        estado.checkUser(user);
    }

    public void checkPassword(String password) {
        estado.checkPassword(password);
    }

    public String getFile() {
        return estado.getFile();
    }

    public void close() {
        estado.close();
    }

    /**
     * @return the estado
     */
    public FtpState getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(FtpState estado) {
        this.estado = estado;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the archivo
     */
    public String getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
}
