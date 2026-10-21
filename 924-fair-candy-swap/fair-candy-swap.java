class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        // Calculate Alice's total candies
        for (int candy : aliceSizes) {
            sumAlice += candy;
        }

        // Calculate Bob's total candies
        for (int candy : bobSizes) {
            sumBob += candy;
        }

        // Calculate the difference
        int diff = (sumAlice - sumBob) / 2;

        // Find the boxes to exchange
        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (a - b == diff) {
                    return new int[]{a, b};
                }
            }
        }

        return new int[]{};
    }
}