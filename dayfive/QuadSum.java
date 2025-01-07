public class QuadSum {
    public static boolean isQuadSumFound(int[] arr, int size, int target, int count){
        System.out.println(size+" "+target+" "+count);
        if(target==0&&count==4)
            return true;
        if(count>4||size==0)
            return false;
        return isQuadSumFound(arr, size-1, target-arr[size-1], count+1)||
        isQuadSumFound(arr, size-1, target, count);
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,4,0,9,5,1,3};
        if(isQuadSumFound(numbers, numbers.length, 20, 0))
            System.out.println("Quadruple sum found");
        else
            System.out.println("Quadruple was not found");

    }
}
