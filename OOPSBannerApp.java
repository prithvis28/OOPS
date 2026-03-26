/**
 * OOPSBannerApp
 *
 * UC6 - OOPS Banner using Static Methods
 *
 * @author Prithvi
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[][] letters = {
                buildO(),
                buildO(),
                buildP(),
                buildS()
        };

        for (int i = 0; i < 7; i++) {
            String line = String.join("   ",
                    letters[0][i],
                    letters[1][i],
                    letters[2][i],
                    letters[3][i]);
            System.out.println(line);
        }
    }

    // O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // P
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // S (FIXED — this was your main issue)
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}