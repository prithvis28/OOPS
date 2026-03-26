/**
 * OOPSBannerApp
 *
 * UC8 - Use HashMap and Render Function
 *
 * @author Prithvi
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }

    // Build pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

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

        return map;
    }

    // Render function
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                String[] pattern = map.getOrDefault(ch, new String[]{
                        "       ", "       ", "       ",
                        "       ", "       ", "       ", "       "
                });

                line.append(pattern[row]);

                if (i != word.length() - 1) {
                    line.append("   ");
                }
            }

            System.out.println(line);
        }
    }
}