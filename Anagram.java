import java.util.*;

class Anagram {

    private static String anagram = new String();
    
    public Anagram(String word) {
        anagram = word;
    }
    // recebe uma palavra e retorna com as letras ordenadas
    public static String sortWord(String string){
        char[] array = string.toUpperCase().toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    
    public List<String> match(List<String> candidates) {
         List<String> list = new ArrayList<>();  

        String sortedAnagram = sortWord(anagram);
        for(String s: candidates){
            // verifica se as String candidatas possuem o mesmo tamanho ou são idênticas ao anagrama. Se sim, esse loop é ignorado
            if(anagram.length() != s.length() || anagram.equalsIgnoreCase(s))
                continue;
            if(sortedAnagram.equalsIgnoreCase(sortWord(s))) // verifica se são anagramas e em caso positivo adiciona a lista que será retornada
                list.add(s);
        }
            
        
        return list;
    }

}
