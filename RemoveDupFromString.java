public class RemoveDupFromString {
    public static void main(String[] args) {
        String str = "Programming";
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(result.indexOf(String.valueOf(ch)) == -1){
                result.append(ch);
            }
        }

        System.out.println("After deleting duplicates : " + result);
    }
}
