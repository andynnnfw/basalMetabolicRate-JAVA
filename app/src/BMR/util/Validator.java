package BMR.util;

public class Validator {
    public static boolean isValidNumber(String text){
        try {
            double valor = Double.parseDouble(text);
            return valor > 0;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
