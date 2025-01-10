package daysevan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimalInefficiency {
    public static int findOptimalInefficiency(int[] salaries, int tableCost) { 
        int n = salaries.length; 
        int[] dp = new int[n + 1]; 
        Arrays.fill(dp, Integer.MAX_VALUE); 
        dp[0] = 0; 
        for (int i = 1; i <= n; i++) { 
            Map<Integer, Integer> salaryCount = new HashMap<>(); 
            int arguments = 0; 
            for (int j = i; j >= 1; j--) { 
                int salary = salaries[j - 1]; 
                salaryCount.put(salary, salaryCount.getOrDefault(salary, 0) + 1); 
                if (salaryCount.get(salary) > 1) { 
                    arguments += salaryCount.get(salary) - 1; 
                } 
                dp[i] = Math.min(dp[i], dp[j - 1] + tableCost + arguments); 
                System.out.println(dp[i]+" @ "+i);
            } 
        } 
        return dp[n];
    }
    public static void main(String[] args) {
        // // Sample Test Cases
        int[] salaries1 = {5, 4, 3, 2, 1};
        System.out.println(findOptimalInefficiency(salaries1, 2)); 

        int[] salaries2 = {3, 3, 3, 3, 3};
        System.out.println(findOptimalInefficiency(salaries2, 3)); 

        int[] salaries3 = {1, 2, 2, 3, 4};
        System.out.println(findOptimalInefficiency(salaries3, 5)); 
    }
}
