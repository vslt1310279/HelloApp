import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // UC8: Final refined project using HashMap for pattern storage and rendering
        String word = "OOPS";
        renderBanner(word);
    }

    public static void renderBanner(String word) {
        CharacterPatternMap patternMap = new CharacterPatternMap();
        
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char letter : word.toCharArray()) {
                line.append(patternMap.getPattern(letter, i)).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    public static class CharacterPatternMap {
        private final Map<Character, String[]> patterns = new HashMap<>();

        public CharacterPatternMap() {
            // Initializing patterns into the HashMap for efficient retrieval
            patterns.put('O', new String[]{" ****", "* *", "* *", "* *", "* *", "* *", " ****"});
            patterns.put('P', new String[]{"***** ", "* *", "* *", "***** ", "* ", "* ", "* "});
            patterns.put('S', new String[]{" ****", "* ", "* ", " ****", "    *", "    *", "**** "});
        }

        public String getPattern(char letter, int row) {
            return patterns.getOrDefault(letter, new String[]{"       "})[row];
        }
    }
}