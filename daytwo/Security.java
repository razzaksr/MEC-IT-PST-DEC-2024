package daytwo;

import java.util.Arrays;

public class Security {
    public static void riskFactor(int[] arr){
        int start = 0, end = arr.length-1, mid=0;
        while(mid<end){
            if(arr[mid]==0){
                arr[mid]+=arr[start];
                arr[start]=arr[mid]-arr[start];
                arr[mid]-=arr[start];
                start++;mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else{
                arr[mid]+=arr[end];
                arr[end]=arr[mid]-arr[end];
                arr[mid]-=arr[end];
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 2, 1, 1, 2, 2, 1, 0, 2, 1, 0};
        riskFactor(arr);
        System.out.println(Arrays.toString(arr));
    }
}
