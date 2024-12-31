package daytwo;

public class FindingMissMin {
    public static int missingMin(int[] arr){
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int index=0;index<arr.length;index++){
            if(arr[index]<firstMin){
                secondMin=firstMin;
                firstMin=arr[index];
            }
            else if(arr[index]<secondMin&&arr[index]!=firstMin)
                secondMin=arr[index];
        }
        int different = secondMin-firstMin;
        int missing = secondMin+1 - different;
        if(missing != secondMin)
            return missing;
        else{
            for(int index=0;index<arr.length;index++){
                if(arr[index]==firstMin)
                    arr[index]=Integer.MAX_VALUE;
            }
            return missingMin(arr);//, firstMin, secondMin);
        }
    }
    public static int findMinDC(int[] arr,int start,int end){
        if(start>end&&start==arr.length-1)
            return start+1;
        else if(start>end)
            return start;
        else{
            int mid = start+(end-start)/2;
            if(mid<arr[mid])
                return findMinDC(arr, start, mid-1);
            else
                return findMinDC(arr, mid+1, end);
        }
    }
    public static int findMin(int[] arr){
        int size = arr.length;
        for(int index=0;index<size;index++){
            if(arr[index]!=index)
                return index;
        }
        return size;
    }
    public static void main(String[] args) {
        // int[] numbers = {0,1,3,4,5,6,7};
        // int[] numbers = {0,2,3,5,6,7,8};
        // int[] numbers = {1,2,3,4,6,7,8,9};
        // int[] numbers = {0,1,2,3,4,5};
        // System.out.println(findMin(numbers));
        // System.out.println(findMinDC(numbers,0,numbers.length-1));
        // int[] numbers = {8, 2, 4, 5, 3, 7, 1};
        // int[] numbers = {1, 2, 3, 5};
        // int[] numbers = {1};
        // int[] numbers = {5,10,8,11};
        int[] numbers = {98,454,12,86,13,89};
        System.out.println(missingMin(numbers));
    }
}
