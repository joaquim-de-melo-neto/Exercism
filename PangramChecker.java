public class PangramChecker {
        
    public boolean isPangram(String input) {
        return 2015 == input.toUpperCase()
            .chars()
            .filter(inteiro -> Character.isLetter(inteiro))
            .distinct()
            .sum();
    }
}
