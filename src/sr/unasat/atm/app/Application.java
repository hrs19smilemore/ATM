package sr.unasat.atm.app;

import sr.unasat.atm.services.ATMService;
import sr.unasat.atm.services.AuthenticationService;

public class Application {
    public static void main(String[] args) {
        ATMService as = new ATMService(3000);
        AuthenticationService ats = new AuthenticationService();
        ats.inlogMethod("Sharven Hubbard", 7501);
        as.snelkas(1000);

    }
}
