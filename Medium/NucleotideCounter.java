import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
class NucleotideCounter {
    String sequence;
    String[] nucleotides;
    Map<Character,Integer> mapper; 
    
    NucleotideCounter(String sequence){
        if( Pattern.compile("[^ACGT]+").matcher(sequence).find()){
            throw new IllegalArgumentException();
        }
       
        this.sequence = sequence;
        this.nucleotides = sequence.split("");
        mapper = new TreeMap<>();
            mapper.put('A',Integer.valueOf("0"));
            mapper.put('C',Integer.valueOf("0"));
            mapper.put('G',Integer.valueOf("0"));
            mapper.put('T',Integer.valueOf("0"));
        
    }
    Map<Character, Integer> nucleotideCounts() {
        if(sequence.length() == 0) return mapper;
        
        for(String nucleotide : nucleotides){
            Character nucleotideChar = Character.valueOf(nucleotide.charAt(0));
            Integer i = mapper.get(nucleotideChar);
            mapper.put(nucleotideChar,
                       Integer.sum(i, Integer.valueOf("1")));
        }
        
        
        /*Map<Character, Integer> mapper = Arrays.stream(nucleotides)
            .collect(
                TreeMap::new,
                (map, palavra) -> map.merge(palavra.charAt(0), 1,Integer::sum),
                TreeMap::putAll);*/
        return mapper;
            
    }
}
