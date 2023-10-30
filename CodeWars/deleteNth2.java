import java.util.stream.IntStream;
import java.util.HashMap;
import java.util.Map;
public class EnoughIsEnough {

	public static int[] deleteNth2(int[] elements, int maxOccurrences) {
		Map<Integer, Integer> ocorrencias = new HashMap<>();
    
		return IntStream.of(elements)
      .filter(motivo -> ocorrencias.merge(motivo,1,Integer::sum) <= maxOccurrences)
      .toArray();
	}
