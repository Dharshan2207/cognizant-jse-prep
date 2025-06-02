public class Vowels {
    public static void main(String[] args) {
        String name = "RagaDharshan";
        int count = 0;

        for(char ch : name.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                count++;
            }
        }
        System.out.println(count);
    }
}
