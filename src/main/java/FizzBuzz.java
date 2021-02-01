/**
 * Created by aminebechraoui, on 01/02/2021, in PACKAGE_NAME
 */
public class FizzBuzz {

    public static final String EMPTY = "";

    public static String getFizzBuzz(int number) {
        String result = "";

        result = isDivisibleBy3(number);

        result = isDivisibleBy5(number, result);

        result = isResultEmpty(number, result);

        return result;
    }

    private static String isDivisibleBy3(int number) {
        if (number % 3 == 0) {
            return "FIZZ";
        }
        return EMPTY;
    }

    private static String isDivisibleBy5(int number, String result) {
        if (number % 5 == 0) {
            result += "BUZZ";
        }
        return result;
    }

    private static String isResultEmpty(int number, String result) {
        if (result.length() == 0) {
            result = String.valueOf(number);
        }
        return result;
    }
}
