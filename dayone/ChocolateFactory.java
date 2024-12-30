package dayone;

import java.util.Arrays;

public class ChocolateFactory {
    public static void reArrange(int[] arr){
        int size = arr.length;
        int index=0, current=0;
        for(;current<size;current++){
            if(arr[current]!=0){
                arr[index]=arr[current];
                index++;
            }
        }
        Arrays.fill(arr, index, size, 0);
    }
    public static void main(String[] args) {
        int[] belt = {1, 0, 2, 3, 0, 4, 5, 0};
        Arrays.toString(belt);
        reArrange(belt);
        System.out.println(Arrays.toString(belt));
    }
}
