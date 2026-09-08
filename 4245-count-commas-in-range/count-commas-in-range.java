class Solution {
    public int countCommas(int n) {
        int total=0;

        if (n >= 1000) {
            total += Math.min(n, 99999) - 999;
        }


        if (n >= 100000) {
            total += (Math.min(n, 999999) - 100000) * 2 + 1;
        }

        if (n >= 1000000) {
            total += (Math.min(n, 999999999) - 999999) * 2;
        }

        if (n >= 1000000000) {
            total += (n - 999999999) * 3;
        }
        return total;
    }
}