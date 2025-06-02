public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,4,6,23,12};

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("Second Largest : " + second);
    }
}
