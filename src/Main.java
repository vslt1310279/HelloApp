public class Main {
    public static void main(String[] args) {
        // UC6: Building the banner using static helper methods for each letter
        String[] oopsBanner = {
            getLine(0), getLine(1), getLine(2), getLine(3), getLine(4), getLine(5), getLine(6)
        };

        for (String line : oopsBanner) {
            System.out.println(line);
        }
    }

    // Static helper to build each row by combining letter patterns
    public static String getLine(int row) {
        return String.join(" ", getO(row), getO(row), getP(row), getS(row));
    }

    public static String getO(int row) {
        String[] o = {" ****", "* *", "* *", "* *", "* *", "* *", " ****"};
        return o[row];
    }

    public static String getP(int row) {
        String[] p = {"***** ", "* *", "* *", "***** ", "* ", "* ", "* "};
        return p[row];
    }

    public static String getS(int row) {
        String[] s = {" ****", "* ", "* ", " ****", "    *", "    *", "**** "};
        return s[row];
    }
}