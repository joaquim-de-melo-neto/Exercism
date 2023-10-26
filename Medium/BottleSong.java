import java.util.ArrayList;
import java.util.List;
class BottleSong {
    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    private String verse(int bottles) {
        String[] nums = new String[]{"no", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] lines = new String[4];
        lines[0] = String.format("%s green %s hanging on the wall,", this.capitalize(nums[bottles]), bottles != 1 ? "bottles" : "bottle");
        lines[1] = String.format("%s green %s hanging on the wall,", this.capitalize(nums[bottles]), bottles != 1 ? "bottles" : "bottle");
        lines[2] = "And if one green bottle should accidentally fall,";
        lines[3] = String.format("There'll be %s green %s hanging on the wall.", nums[bottles - 1], bottles != 2 ? "bottles" : "bottle");
        return String.join("\n", lines) + "\n";
    }
    String recite(int startBottles, int takeDown) {
        List<String> verses = new ArrayList<>();
        for (int i = startBottles; i > startBottles - takeDown; i--)
            verses.add(this.verse(i));
        return String.join("\n", verses);
    }
}
