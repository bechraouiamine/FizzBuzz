/**
 * Created by aminebechraoui, on 01/02/2021, in PACKAGE_NAME
 */
public class FizzBuzz {

    public static String getFizzBuzz(int number) {
        if (number % 3 == 0) {
            return "FIZZ";
        }
        if (number % 5 == 0) {
            return "BUZZ";
        }
        return String.valueOf(number);
    }
}
