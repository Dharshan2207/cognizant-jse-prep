public class Functions {
    public static void main(String[] args) {
        String str = "Hello World";
        String name = "Raga Dharshan";

        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.equals("Hello World"));

        System.out.println(str.substring(6, 11));
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));

        char[] arr = str.toCharArray();

        for(char c : arr){
            System.out.println(c);
        }

        String[] words = name.split(" ");

        for(String s : words){
            System.out.println(s);
        }

    }
}
