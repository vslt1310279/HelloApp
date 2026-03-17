public class Main {
    public static void main(String[] args) {
        // UC4: Organizing banner lines into a centralized String array
        String[] oopsBanner = {
            String.join("", " *", " **", " **", " **", " "),
            String.join("", "* ", " ", " ", "* *"),
            String.join("", "* ", " ", " ", "* *"),
            String.join("", "* ", " ", "*", "* "),
            String.join("", "* ", " ", " ", "* "),
            String.join("", "* ", " ", " ", "* "),
            String.join("", " *", " **", " ", "** ")
        };

        // Using an enhanced for-loop for cleaner output traversal
        for (String line : oopsBanner) {
            System.out.println(line);
        }
    }
}