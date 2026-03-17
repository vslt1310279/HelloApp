public class Main {
    public static void main(String[] args) {
        // UC7: Using a centralized CharacterPatternMap class for pattern management
        String[] oopsBanner = new String[7];
        
        for (int i = 0; i < 7; i++) {
            oopsBanner[i] = String.join(" ", 
                CharacterPatternMap.getPattern('O', i),
                CharacterPatternMap.getPattern('O', i),
                CharacterPatternMap.getPattern('P', i),
                CharacterPatternMap.getPattern('S', i)
            );
        }

        for (String line : oopsBanner) {
            System.out.println(line);
        }
    }

    // Static inner class to encapsulate ASCII art patterns
    public static class CharacterPatternMap {
        private static final String[] O = {" *", " ", " ", " ", " ", " ", " ***"};
        private static final String[] P = {"** ", " ", " ", "** ", "* ", "* ", "* "};
        private static final String[] S = {" *", " ", "* ", " *", "    *", "    *", "* "};

        public static String getPattern(char letter, int row) {
            switch (letter) {
                case 'O': return O[row];
                case 'P': return P[row];
                case 'S': return S[row];
                default: return "";
            }
        }
    }
}