import java.util.regex.Pattern;

public class PinCode {
    public static void main(String[] args) {
        System.out.println("Welcome To Pin Code System ");
        //UC1 The Postal Index Number
        System.out.println(Pattern.matches("^[1-9]{1}[0-9]{5}$", "400088"));//true
        //UC2 Check for A400088 – this should fail
        System.out.println(Pattern.matches("^[1-9]{1}[0-9]{5}$", "A400088"));//fail
        //Check for 400088B – this should fail
        System.out.println(Pattern.matches("^[1-9]{1}[0-9]{5}$", "400088B"));//fail
        //Make sure 400 088 is also valid along with 400088
        System.out.println(Pattern.matches("[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}", "400088B"));//true/false
    }
}
