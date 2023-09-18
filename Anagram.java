import java.util.*;

class Anagram {

    private static String anagram = new String();
    
    public Anagram(String word) {
        anagram = word;
    }

    public static String sortWord(String string){
        char[] array = string.toUpperCase().toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    
    public List<String> match(List<String> candidates) {
         List<String> list = new ArrayList<>();  

        String sortedAnagram = sortWord(anagram);
        for(String s: candidates){
            if(anagram.length() != s.length() || anagram.equalsIgnoreCase(s))
                continue;
            if(sortedAnagram.equalsIgnoreCase(sortWord(s))) 
                list.add(s);
        }
            
        
        return list;
    }

}
