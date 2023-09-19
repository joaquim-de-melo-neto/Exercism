import java.util.*;
class WordCount {
    public Map<String, Integer> phrase(String input) {
  //      \\tokenizar input e adicionar cada eelmento String como chave no map e inicaiar //seus valores com zero; talvez use pattern e matcher 
            Map<String,Integer> result = new HashMap<>();
        
        input = input.toLowerCase();
        
        String[] tokens = input.split("\\s+|,");
        for(String s : tokens){
            s = s.replaceAll("^\\p{Punct}+|\\p{Punct}+$", "");
            if(s.length() == 0) continue;
            if(result.containsKey(s)) 
                result.put(s,Integer.sum(result.get(s),1));
            else result.put(s,Integer.valueOf("1"));
        }
        return result;
    }
}
