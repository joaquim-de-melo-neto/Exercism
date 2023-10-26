import java.util.Map;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.*;
class NucleotideCounter {
    String sequence;
    Map<Character,Integer> mapper; 
    
    NucleotideCounter(String sequence){
        if( Pattern.compile("[^ACGT]+").matcher(sequence).find()){
            throw new IllegalArgumentException();
        }
       
        this.sequence = sequence;
        mapper = new TreeMap<>();
            mapper.put('T',Integer.valueOf("0"));
            mapper.put('A',Integer.valueOf("0"));
            mapper.put('C',Integer.valueOf("0"));
            mapper.put('G',Integer.valueOf("0"));
    }
    Map<Character, Integer> nucleotideCounts() {
        if(sequence.length() == 0) return mapper;
        sequence.chars().forEach(n -> mapper.merge((char)n, 1, Integer::sum));
        return mapper;
    }
}
