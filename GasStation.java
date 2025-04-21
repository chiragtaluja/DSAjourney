package practice;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int stidx = 0;
        int currGas = 0;
        int totalGas = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            currGas += diff;
            if (currGas < 0) {
                stidx = i + 1;
                currGas = 0;
            }
        }
        if (totalGas >= 0) {
            return stidx;
        }
        return -1;
    }

    public static void main(String[] args) {
        GasStation solution = new GasStation();

        // Test Case 1
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = solution.canCompleteCircuit(gas, cost);
        System.out.println("Starting gas station index: " + result);  // Output: 3

        // Additional Test Case
        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        int result2 = solution.canCompleteCircuit(gas2, cost2);
        System.out.println("Starting gas station index: " + result2);  // Output: -1
    }
}

