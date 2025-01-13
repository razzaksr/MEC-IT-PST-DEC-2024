package dayeight;

public class Robots {
    public static int maxConsecutiveRobots(int[] chargeTimes, int[] runningCosts, int budget) {
        int n = chargeTimes.length;
        int maxConsecutive = 0;//1,2,3
        int totalCost = 0;//5
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            // 3+2*1>> 5
            // 6+1*2>> 8
            // 1+3*3>> 10
            // 3+4*4>> 19
            totalCost += chargeTimes[windowEnd] + (runningCosts[windowEnd] * (windowEnd - windowStart + 1));
            // totalCost=5+8+10+19
            while (totalCost > budget) {
                // 42 - 3 + 2 * 4>> 42-11>> 31
                // 31 - (6+1*3)>> 31-9>> 22
                totalCost -= chargeTimes[windowStart] + (runningCosts[windowStart] * (windowEnd - windowStart + 1));
                windowStart++;
            }

            maxConsecutive = Math.max(maxConsecutive, windowEnd - windowStart + 1);// 3
        }

        return maxConsecutive;
    }

    public static void main(String[] args) {
        int[] chargeTimes1 = {3, 6, 1, 3, 4};
        int[] runningCosts1 = {2, 1, 3, 4, 5};
        int budget1 = 25;
        System.out.println(maxConsecutiveRobots(chargeTimes1, runningCosts1, budget1));  

        int[] chargeTimes2 = {11, 12, 19};
        int[] runningCosts2 = {10, 8, 7};
        int budget2 = 19;
        System.out.println(maxConsecutiveRobots(chargeTimes2, runningCosts2, budget2));  

        int[] chargeTimes3 = {1, 2, 3, 4, 5};
        int[] runningCosts3 = {1, 2, 3, 4, 5};
        int budget3 = 15;
        System.out.println(maxConsecutiveRobots(chargeTimes3, runningCosts3, budget3));  
    }
}
