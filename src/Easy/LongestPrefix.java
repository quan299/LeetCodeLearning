package Easy;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length ==0) return "";
        String test = strs[0];
        for (int i =1; i< strs.length;i++) {
            while (!strs[i].startsWith(test)) {

                test = test.substring(0, test.length() - 1);
                if (test.isEmpty()) {
                    return "";
                }
            }
        }
        return test;
    }
}
