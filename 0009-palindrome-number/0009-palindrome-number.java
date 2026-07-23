class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are never palindromes (the '-' sign breaks symmetry)
        // Also, numbers ending in 0 (except 0 itself) can't be palindromes,
        // since a palindrome can't start with 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverted = 0;
        while (x > reverted) {
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }

        // When the length is odd, the middle digit doesn't matter,
        // so we can discard it by dividing reverted by 10
        return x == reverted || x == reverted / 10;
    }
}