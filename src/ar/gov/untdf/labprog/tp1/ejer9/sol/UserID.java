package ar.gov.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class UserID extends FtpState {

    public UserID(Ftp miFtp){
        super.miFtp = miFtp;
        System.out.println("USERID");
        System.out.println("Ingrese el password");
    }

    @Override
    public void checkPassword(String password) {
        if(miFtp.getPassword().equals(password))
            miFtp.setEstado(new Conected(miFtp));
        else
            super.checkPassword(password);
    }
}
