public class StringB {
    public static void main(StringB[] args) {

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);

        // Methods
        String name = "Mayank";
        // .toCharArray();
        // name.toLowerCasee();

        // Palindrome




    }

    static boolean pali(String str) {
        str = str.toLowerCase();
        for(int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1);
            if(start != end) {
                return false;
            }
        }
    }
}
