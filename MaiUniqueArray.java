// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.HashSet;

public class MaiUniqueArray {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3,3,3,3};
        int[] result = new int[arr.length];

                // output arr ={1,2,3,0,0,0,0,0,0}
        HashSet<Integer> st = new HashSet<>();
        int index =0;
        for(int num:arr){
            if(!st.contains(num)){
                st.add(num);
               result[index++] = num;
            }
        }
        System.out.println(Arrays.toString(result));





    }
}