import java.util.Locale;

public class TestFunctions {

    public boolean Login(String email , String password) {
        if (ValidEmail(email) && (isStrong(password))) {
            return true;
        }
        return false;
    }


    private boolean ValidEmail(String str) {
        if ((str.length() < 30) && (str.toLowerCase().contains("@mail.wit.ie")) || (str.toLowerCase().contains("@wit.ie"))) {
            return true;
        }
        return false;
    }

    //At least one upper case English letter, (?=.*?[A-Z])
    //At least one lower case English letter, (?=.*?[a-z])
    //At least one digit, (?=.*?[0-9])
    //At least one special character, (?=.*?[#?!@$%^&*-])
    //Minimum eight in length.
    private boolean isStrong(String password){
        return password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");

    }
}
