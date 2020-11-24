package sr.unasat.atm.services;

public class AuthenticationService {
    final String gebruiker1 = "Sharven Hubbard";
    final int pinCode1 = 7501;
    final String gebruiker2 = "Rogier Hubbard";
    final int pinCode2 = 7112;
    final String gebruiker3 = "Donnevan Hubbard";
    final int pinCode3 = 8499;

    String message = "Uw gebruikersnaam is correct";

    public void inlogMethod(String gebruikersNaam, int gebruikersPincode) {
        switch (gebruikersNaam) {
            case gebruiker1:
                System.out.println(message);
                break;
            case gebruiker2:
                System.out.println(message);
                break;
            case gebruiker3:
                System.out.println(message);
                break;
            default:
                System.out.println("Inlog gegevens incorrect");
                System.exit(0);
        }
        String message2 = "Uw pinCode is correct u kunt verder met snelkas";
        switch (gebruikersPincode) {
            case pinCode1:
                System.out.println(message2);
                break;
            case pinCode2:
                System.out.println(message2);
                break;
            case pinCode3:
                System.out.println(message2);
                break;
            default:
                System.out.println("Uw pincode is incorrect probeer het opnieuw");
                System.exit(0);

        }


        }
    }