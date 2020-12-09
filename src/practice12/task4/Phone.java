package practice12.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private final int countryCode;
    private final int firstThree;
    private final int secondThree;
    private final int four;

    private static final String INTERNATIONAL_REGEX = "^[+][0-9][/0-9]{10}$";
    private static final String RUSSIAN_REGEX = "^[8][/0-9]{10}$";


    private Phone(int countryCode, int firstThree, int secondThree, int four) {
        this.countryCode = countryCode;
        this.firstThree = firstThree;
        this.secondThree = secondThree;
        this.four = four;
    }


    public String toUnique() {
        return "+" + countryCode + firstThree +
                "-" + secondThree + "-" + four;
    }


    public static Phone fromInternational(String src) throws IllegalArgumentException {
        Matcher matcher = Pattern.compile(INTERNATIONAL_REGEX).matcher(src);
        if (!matcher.matches())
            throw new IllegalArgumentException("Wrong international phone number format.");

        return new Phone(
                Integer.parseInt(String.valueOf(src.charAt(1))),
                Integer.parseInt(src.substring(2, 5)),
                Integer.parseInt(src.substring(5, 8)),
                Integer.parseInt(src.substring(8, 12))
        );
    }


    public static Phone fromRussian(String src) throws IllegalArgumentException {
        Matcher matcher = Pattern.compile(RUSSIAN_REGEX).matcher(src);
        if (!matcher.matches())
            throw new IllegalArgumentException("Wrong russian phone number format.");

        return new Phone(
                7,
                Integer.parseInt(src.substring(1, 4)),
                Integer.parseInt(src.substring(4, 7)),
                Integer.parseInt(src.substring(7, 11))
        );
    }
}
