public class Palindrome {

    public static void main(String[] args) {
        System.out.println("For commit");
        String s = "Madam, I'm Adam!";
        if (Palindrome.isPalindrome(s)) {
            System.out.println("This is Palindrome");

        } else {
            System.out.println("This isn't Palindrome");
        }

    }
    public static boolean isPalindrome(String s) {
        return s.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(s.replaceAll("\\W",""))
                        .reverse().toString());
    }

}