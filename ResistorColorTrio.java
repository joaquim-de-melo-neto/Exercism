import java.util.*;
import java.util.stream.*;

class ResistorColorTrio {
    private Map<String, Integer> cores = new HashMap();
    
    public ResistorColorTrio(){
        cores.put("black",0);
        cores.put("brown",1);
        cores.put("red",2);
        cores.put("orange",3);
        cores.put("yellow",4);
        cores.put("green",5);
        cores.put("blue",6);
        cores.put("violet",7);
        cores.put("grey",8);
        cores.put("white",9);
    }
    
    String label(String[] colors) {
        String[] newColors = Arrays.copyOf(colors, 3); // vetor truncado somente com 3 cores 
        
        String resistence = Arrays.stream(newColors)
            .limit(2) // usei somente as duas primeira cores
            .map(color -> Integer.toString(this.cores.get(color)))
            .collect(Collectors.joining());
        
        // última cor usada como multiplicador
        long resistenceValue = Long.valueOf(resistence) * (long)Math.pow(10, this.cores.get(newColors[newColors.length - 1]));
        
        if(resistenceValue == 0) return "0 ohms";
        if(resistenceValue % 1_000_000_000 == 0)    return Long.toString(resistenceValue/1_000_000_000) + " gigaohms";
        if(resistenceValue % 1_000_000 == 0)        return Long.toString(resistenceValue/1_000_000) + " megaohms";
        if(resistenceValue % 1_000 == 0)            return Long.toString(resistenceValue/1_000) + " kiloohms";
                
        return Long.toString(resistenceValue) + " ohms";
    
    }    
}
