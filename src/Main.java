public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();

        System.out.println("[\"flower\",\"flow\",\"flight\"] was: " + solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println("[\"dog\",\"racecar\",\"car\"] was: " + solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
