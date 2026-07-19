class Solution {
    public int countOdds(int low, int high) {
        int length = high - low + 1;

        if (length % 2 == 0)
            return length / 2;

        return length / 2 + (low % 2);
    }
}