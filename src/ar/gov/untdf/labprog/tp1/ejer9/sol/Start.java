package ar.gov.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class Start extends FtpState {

    public Start(Ftp miFtp) {
        super.miFtp = miFtp;
        System.out.println("START");
        System.out.println("Ingrese el usuario");
    }
    
    @Override
    public void checkUser(String user) {
        if(miFtp.getUser().equals(user))
            miFtp.setEstado(new UserID(miFtp));
        else
            super.checkUser(user);
    }
}
