import java.util.*;
import java.util.stream.Collectors;

class HighScores {
    List<Integer> highScores = new ArrayList<>();
    int size;
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
        size = highScores.size();
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size()-1);
    }

    Integer personalBest() {
        return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        return highScores.stream().sorted((t1, t2) -> t1 > t2 ? -1 : 1).limit(3).collect(Collectors.toList());
    }

}
