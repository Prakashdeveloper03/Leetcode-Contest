import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[] { nums[i], i });
        }

        for (int i = 0; i < k; i++) {
            int[] curr = pq.poll();
            curr[0] *= multiplier;
            pq.offer(curr);
        }

        int[] result = new int[nums.length];
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            result[curr[1]] = curr[0];
        }
        return result;
    }
}

public class KFinalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int multiplier = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.getFinalState(nums, k, multiplier));
            t--;
        }
        sc.close();
    }
}