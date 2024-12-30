package dayone;

import java.util.Arrays;

class ArrayRotation {
    public static void clockLeast(String[] arr, int rotation){
        int size = arr.length;
        String[] clock = new String[size];
        for(int index=0;index<size;index++){
            clock[(index+rotation+size)%size]=arr[index];
        }
        System.out.println(Arrays.toString(clock));
    }
    public static void antiClockLeast(String[] arr, int rotation){
        int size = arr.length;
        String[] antiClock = new String[size];
        for(int index=0;index<size;index++){
            antiClock[(index-rotation+size)%size]=arr[index];
        }
        System.out.println(Arrays.toString(antiClock));
    }
    public static void antiClockJothi(String[] arr, int rotation){
        String[] antiClock = new String[arr.length];
        int current = 0, index;
        // O(n)
        for(index=rotation;index<arr.length;index++,current++){
            antiClock[current]=arr[index];
        }
        // O(n)
        index=0;
        while(index<rotation){
            antiClock[current]=arr[index];
            current++;index++;
        }
        System.out.println(Arrays.toString(antiClock));
    }
    public static void main(String[] args) {
        String[] myTech = {"Node", "Django", "Vue", "Express", "Spring", "Flask", "Angular", "React", "Hibernate"};
        System.out.println(Arrays.toString(myTech));
        //antiClockJothi(myTech, 2);// O(2n)
        antiClockLeast(myTech, 2);// O(n)
        clockLeast(myTech, 2);// O(n)
    }
}