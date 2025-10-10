class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        int i = 0;
        while (i < spells.length) {
            int s = 0, e = potions.length - 1;
            while (s <= e) {
                int m = s + (e - s) / 2;
                long prod = ((long) spells[i]) * ((long) potions[m]);
                if (success > prod)
                    s = m + 1;
                else
                    e = m - 1;
            }
            ans[i++] = potions.length - s;
        }
        return ans;
    }
}
