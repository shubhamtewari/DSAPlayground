package questions;

/**
 * <p>Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.</p>
 *
 * <p>Sliding Window: Sliding window question generally have this format: Get longest/shortest collection
 * of data satisfying a certain constraint from a larger collection. A question might also ask you to work with
 * a subset of a collection. Windows can also be static or dynamic.</p>
 *
 * <p>To solve this question I had two pointers 'i' and 'j'.
 * We will always try to have a distance of 'k' 0s between the two pointers. This will be managed using 'c'.
 * If 'j' crosses a 0 and c > k, we will increment 'i' till it crosses a 0 too.
 * And while `c == k` we will also be maintaining the max length (~j-i).</p>
 *
 * <p>Will be updating this code. It can be refactored a lot.</p>
 */
public class Q1004MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;

        int c = 0;
        while (c < k && j < nums.length) {
            if (j == 0 && nums[j] == 0) {
                c++;
            }
            j++;
            if (j >= nums.length) {
                break;
            }
            if (nums[j] == 0) {
                c++;
            }
        }
        if (j == nums.length) {
            return nums.length;
        }
        int max = 0;

        if (k == 0) {
            while (i < nums.length) {
                if (nums[i] == 1) {
                    c++;
                }
                if (nums[i] == 0 || i == nums.length - 1) {
                    if (c >= max) {
                        max = c;
                    }
                    c = 0;
                }
                i++;
            }
        } else {
            while (true) {
                if (j - i + 1 >= max) {
                    max = j - i + 1;
                }
                if (j >= nums.length - 1) {
                    break;
                }
                if (nums[j + 1] == 0) {
                    while (nums[i] != 0) {
                        i++;
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
