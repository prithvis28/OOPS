/**
 * OOPSBannerApp
 *
 * UC7 - Character Pattern using Inner Class
 *
 * @author Prithvi
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPatternMap patternMap = new CharacterPatternMap();

        String word = "OOPS";
        String[][] letters = new String[word.length()][];

        // Fetch patterns for each character
        for (int i = 0; i < word.length(); i++) {
            letters[i] = patternMap.getPattern(word.charAt(i));
        }

        // Print banner
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < letters.length; col++) {
                line.append(letters[col][row]);
                if (col != letters.length - 1) {
                    line.append("   ");
                }
            }

            System.out.println(line);
        }
    }

    // 🔥 INNER CLASS
    static class CharacterPatternMap {

        private Map<Character, String[]> map = new HashMap<>();

        public CharacterPatternMap() {

            // O
            map.put('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            // P
            map.put('P', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      ",
                    "*      "
            });

            // S (correct shape)
            map.put('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            });
        }

        public String[] getPattern(char ch) {
            return map.getOrDefault(ch, new String[]{
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       "
            });
        }
    }
}