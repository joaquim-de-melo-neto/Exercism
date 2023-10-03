import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class House {
    private String text = "This is ";
    final Map<Integer,String> verses;
    final Map<Integer,String> verbs;
  
    public House() {
        verses = new HashMap<>();
        
        verses.put(2,"the malt ");
        verses.put(3,"the rat ");
        verses.put(4,"the cat ");
        verses.put(5,"the dog ");
        verses.put(6,"the cow with the crumpled horn ");
        verses.put(7,"the maiden all forlorn ");
        verses.put(8,"the man all tattered and torn ");
        verses.put(9,"the priest all shaven and shorn ");
        verses.put(10,"the rooster that crowed in the morn ");
        verses.put(11,"the farmer sowing his corn ");
        verses.put(12,"the horse and the hound and the horn ");
        verbs = new HashMap<>();
        verbs.put(2,"lay in the house that Jack built.");
        verbs.put(3,"ate ");
        verbs.put(4,"killed ");
        verbs.put(5,"worried ");
        verbs.put(6,"tossed ");
        verbs.put(7,"milked ");
        verbs.put(8,"kissed ");
        verbs.put(9,"married ");
        verbs.put(10,"woke ");
        verbs.put(11,"kept ");
        verbs.put(12,"belonged to ");
        //verbs.put(12,"");
        
        
    }
    String verse(int verse) {
        StringBuilder str = new StringBuilder(text);
        if(verse == 1) return str.append("the house that Jack built.").toString();
        for(int count = verse; count > 1; count--){
            str.append(verses.get(count));
            str.append("that ");
            str.append(verbs.get(count));
        }
        return str.toString();
    }
    String verses(int startVerse, int endVerse) {                          //mapToObj(m -> verse(m))
        return String.join("\n", IntStream.rangeClosed(startVerse, endVerse).mapToObj(this::verse).collect(Collectors.toList()));
        
    }
    String sing() {
        return verses(1,12);
    }
}
