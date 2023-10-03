import java.util.*;
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
        List<Integer> list = new ArrayList<>();
        if(size == 1){
            list = scores();
            return list;
        }
        if(size == 2){
            list = scores();
            Collections.sort(list);
            Collections.reverse(list);
                return list;
        }
        Integer[] array = highScores.toArray(new Integer[0]);
        Arrays.sort(array);
        list.addAll(Arrays.asList(array).subList(array.length-3,array.length));
        
        Collections.reverse(list);
        return list;
    }
}
