import static java.util.stream.Collectors.joining;
import java.util.*;
class RnaTranscription {
    Map<String, String> map = Map.of(
        "A","U",
        "T","A",
        "C","G",
        "G","C"
    );

    String transcribe(String dnaStrand) {
        return dnaStrand.isEmpty() ? "" :
            Arrays.stream(dnaStrand.split(""))
            .map(nucleotide -> map.get(nucleotide))
            .collect(joining());
    }
}
