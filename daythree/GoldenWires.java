package daythree;

import java.util.Arrays;

public class GoldenWires {
    public static int minimumCostToAssembleWires(int[] wires) {
        int n = wires.length;
        Arrays.sort(wires); // Sort the wires in ascending order
        int totalCost = 0;
        System.out.println(Arrays.toString(wires));
        while (n > 1) {
            int cost = wires[0] + wires[1]; // Merge the two shortest wires
            totalCost += cost;
            wires[1] = cost; // Replace second element with merged wire
            // Shift remaining elements to the left
            for (int i = 2; i < n; i++) {wires[i - 1] = wires[i];}
            System.out.println(Arrays.toString(wires)+"\n"+totalCost);
            n--; // Decrease the number of wires
        }
        System.out.println(Arrays.toString(wires));
        return totalCost;
    }
    public static void main(String[] args) {
        int[] wires = {1, 1, 6, 6, 7, 8};
        System.out.println(minimumCostToAssembleWires(wires));
    }
}
