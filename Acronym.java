import java.util.stream.Collectors;
import java.util.*;
class Acronym {
    String phrase;
    
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        return Arrays.stream(this.phrase.replaceAll("-|_"," ").split("\\s+"))
            .map(word -> String.valueOf(word.charAt(0)).toUpperCase())
            .collect(Collectors.joining());
    }

}
