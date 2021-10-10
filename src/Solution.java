public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortest = 2000;
        StringBuilder answer = new StringBuilder();
        boolean failed = false;

        if (strs.length == 1) {
            return strs[0];
        }

        for (String s: strs) {
            if (s.length() < shortest) {
                shortest = s.length();
            }
        }

        char letter;
        for (int i = 0; i < shortest; i++) {
            letter = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) == letter){
                    if (j == strs.length - 1) {
                        answer.append(strs[j].charAt(i));
                    }
                } else {
                    failed = true;
                    break;
                }
            }
            if (failed) {
                return answer.toString();
            }
        }

        return answer.toString();
    }
}
