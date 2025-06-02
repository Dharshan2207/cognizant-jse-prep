import java.util.HashMap;
import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            if(map,get(key) > 1){
                System.out.println(key);
            }
        }
    }


}
