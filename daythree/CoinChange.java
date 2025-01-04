package daythree;

import java.util.Arrays;

public class CoinChange {
    public static int dynamicProgramming(int[] arr,int userAmount){
        int[] poss=new int[userAmount+1];
        Arrays.fill(poss,userAmount+1);
        poss[0]=0;
        for(int each:arr){
            int current;
            for(current=each;current<=userAmount;current++){
                System.out.print(current+"'s position "+poss[current]+" "+poss[current-each]+" ");
                poss[current]=Math.min(poss[current],poss[current-each]+1);
                System.out.println(poss[current]);
            }
        }
        return (poss[userAmount]<=userAmount)?poss[userAmount]:-1;
    }
    public static int denoms(int[] arr,int userRequired){
        int count = 0;
        Arrays.sort(arr);
        // 10,13,20,500
        for(int index=arr.length-1;index>=0;){
            if(userRequired>=arr[index]){
                userRequired-=arr[index];
                System.out.print(arr[index]+" ");
                count++;
            }
            else
                index--;
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        int[] coins={500,20,10,13};
        // System.out.println(denoms(coins, 1543));
        System.out.println(dynamicProgramming(coins, 43));
    }
}
