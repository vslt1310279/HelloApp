public class Main {
    public static void main(String[] args) {
        // Using String.join to build each line of the banner for better memory efficiency
        System.out.println(String.join("", " *", " **", " **", " **", " "));
        System.out.println(String.join("", "* ", " ", " ", "* *"));
        System.out.println(String.join("", "* ", " ", " ", "* *"));
        System.out.println(String.join("", "* ", " ", "*", "* "));
        System.out.println(String.join("", "* ", " ", " ", "* "));
        System.out.println(String.join("", "* ", " ", " ", "* "));
        System.out.println(String.join("", " *", " **", " ", "** "));
    }
}