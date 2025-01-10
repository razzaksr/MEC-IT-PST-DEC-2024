package daysevan;

public class FindExtraInArr {
    public static int seekExtra(int[] source, int[] compare){
        for(int index=0;index<source.length;index++){
            if(index>=compare.length)
                return index;
            else{
                if(source[index]!=compare[index]){
                    return index;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1={2,4,6,8,9,10,12};
        int[] arr2={2,4,6,8,10,12};
        System.out.println(seekExtra(arr1, arr2));
    }
}
