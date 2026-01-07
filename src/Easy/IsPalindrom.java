package Easy;

class Solution {
    public boolean isPalindrome(int x) {


        String temp = String.valueOf(x);
        String reversed = new StringBuilder(temp).reverse().toString();

        return reversed.equals(temp);


    }
}
