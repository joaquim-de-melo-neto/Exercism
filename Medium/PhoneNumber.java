import java.util.regex.Pattern;
public class PhoneNumber {
    private static final String PUNCTUAL_REGEX = "[\\p{Punct}\\p{Blank}]";
    private static final String LETTERS_REGEX = "[\\p{Lower}]";
    private String number;
    public PhoneNumber(String number) {
        String tempNumber = number;
        tempNumber = replaceNoNeededCharacters(tempNumber);
        assertProperNumberLength(tempNumber);
        tempNumber = removeCountryCodeIfPresent(tempNumber);
        this.number = tempNumber;
    }
    public String getNumber() {
        return number;
    }
    private String replaceNoNeededCharacters(String string) {
        assertNumberWithoutSpecialCharacters(string);
        return string.replaceAll(PUNCTUAL_REGEX, "");
    }
    private String removeCountryCodeIfPresent(String string) {
        return string.substring(0,1).equals("1") ? string.substring(1, string.length()) : string;
    }
    private void assertProperNumberLength(String string) {
        Pattern pattern = Pattern.compile(LETTERS_REGEX);
        if (string.length() < 10) {
            throw new IllegalArgumentException("incorrect number of digits");
        }
        if (string.length() > 11) {
            throw new IllegalArgumentException("more than 11 digits");
        }
        if (string.length() == 11 && !string.substring(0,1).equals("1")) {
            throw new IllegalArgumentException("11 digits must start with 1");
        }
        if (pattern.matcher(string).find()) {
            throw new IllegalArgumentException("letters not permitted");
        }
        if (string.substring(string.length()-10, string.length()-9).equals("0")) {
            throw new IllegalArgumentException("area code cannot start with zero");
        }
        if (string.substring(string.length()-10,string.length()-9).equals("1")) {
            throw new IllegalArgumentException("area code cannot start with one");
        }
        if (string.substring(string.length()-7,string.length()-6).equals("0")) {
            throw new IllegalArgumentException("exchange code cannot start with zero");
        }
        if (string.substring(string.length()-7,string.length()-6).equals("1")) {
            throw new IllegalArgumentException("exchange code cannot start with one");
        }
    }
    private void assertNumberWithoutSpecialCharacters(String string) {
        if (string.contains("@") || string.contains(":") || string.contains("!")) {
            throw new IllegalArgumentException("punctuations not permitted");
        }
    }
}
