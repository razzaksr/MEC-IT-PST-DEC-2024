package dayone;

import java.util.Arrays;

public class Equilibrium {
    public static int findEq(int[] arr){
        int totalSum = Arrays.stream(arr).sum();
        int partSum = 0;
        // O(n)
        for(int index = 0;index<arr.length;index++){
            totalSum-=arr[index];
            if(totalSum==partSum)
                return index;
            partSum+=arr[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        // int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] arr = {0,-3,5,-4,-2,3,1,0};
        System.out.println(findEq(arr));
    }
}
