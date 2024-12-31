package daytwo;

public class StairCase {
    public static int countDC(int stairs){
        if(stairs<=0)
            return 0;
        else if(stairs==1)
            return 1;
        else if(stairs==2)
            return 2;
        else
            return countDC(stairs-1)+countDC(stairs-1);
    }
    public static int countDP(int stairs){
        if(stairs<=0)
            return 0;
        else if(stairs==1)
            return 1;
        else if(stairs==2)
            return 2;
        int[] poss = new int[stairs+1];// 3+1>> 4>> 0-3
        poss[0]=0;poss[1]=1;poss[2]=2;
        for(int index=3;index<poss.length;index++){
            poss[index]=poss[index-1]+poss[index-2];
        }
        return poss[stairs];
    }
    
    public static void main(String[] args) {
        System.out.println(countDP(5));
    }
}
