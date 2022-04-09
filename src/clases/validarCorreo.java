package clases;

//@author Software_Max(JDV)
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validarCorreo {

    public boolean validEmail(String email) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);// El email a validar
        return mather.find();

    }
}
