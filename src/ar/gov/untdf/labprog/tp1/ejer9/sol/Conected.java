package ar.gov.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Conected extends FtpState {

    public Conected(Ftp miFtp){
        super.miFtp = miFtp;
        System.out.println("CONECTED");
        System.out.println("Ha iniciado sección");
    }

    @Override
    public void checkUser(String user) {
        System.out.println("Ya esta conectado");
    }

    @Override
    public void checkPassword(String password) {
        System.out.println("Ya esta conectado");
    }

    @Override
    public String getFile() {
        return miFtp.getArchivo();
    }

    @Override
    public void close() {
        System.out.println("Ha finalizado la sección");
        miFtp.setEstado(new Start(miFtp));
    }
}
