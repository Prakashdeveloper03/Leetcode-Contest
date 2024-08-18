import java.util.Scanner;

class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') {
                    count0++;
                } else {
                    count1++;
                }
                if (count0 <= k || count1 <= k) {
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.nextLine();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.countKConstraintSubstrings(s, k));
            t--;
        }
        sc.close();
    }
}
