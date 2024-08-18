import java.util.Scanner;

class Solution {
    public String largestPalindrome(int n, int k) {
        if (k == 1) {
            return String.valueOf("9").repeat(n);
        } else if (k == 2) {
            if (n <= 2) {
                return String.valueOf("8").repeat(n);
            }
            return "8" + String.valueOf("9").repeat(n - 2) + "8";
        } else if (k == 3) {
            return String.valueOf("9").repeat(n);
        } else if (k == 4) {
            if (n <= 4) {
                return String.valueOf("8").repeat(n);
            }
            return "88" + String.valueOf("9").repeat(n - 4) + "88";
        } else if (k == 5) {
            if (n <= 2) {
                return String.valueOf("5").repeat(n);
            }
            return "5" + String.valueOf("9").repeat(n - 2) + "5";
        } else if (k == 6) {
            if (n <= 2) {
                return String.valueOf("6").repeat(n);
            } else if (n == 3) {
                return "888";
            } else if (n == 4) {
                return "8778";
            }
            if (n % 2 == 1) {
                return "8" + String.valueOf("9").repeat((n / 2) - 1) + "8" + String.valueOf("9").repeat((n / 2) - 1)
                        + "8";
            } else {
                return "8" + String.valueOf("9").repeat((n / 2 - 2)) + "77" + String.valueOf("9").repeat((n / 2) - 2)
                        + "8";
            }
        } else if (k == 7) {
            String[] dic = {
                    "", "7", "77", "959", "9779",
                    "99799", "999999", "9994999",
                    "99944999", "999969999", "9999449999", "99999499999"
            };
            int l = n / 12;
            int r = n % 12;

            StringBuilder nines = new StringBuilder();
            while (l-- > 0) {
                nines.append("999999");
            }

            return nines.toString() + dic[r] + nines.toString();
        } else if (k == 8) {
            if (n <= 6) {
                return String.valueOf("8").repeat(n);
            }
            return "888" + String.valueOf("9").repeat(n - 6) + "888";
        } else if (k == 9) {
            return String.valueOf("9").repeat(n);
        }
        return "";
    }
}

public class LargestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.largestPalindrome(n, k));
            t--;
        }
        sc.close();
    }
}
