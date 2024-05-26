    public class question4 {
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
        if (num > max) {
        max = num;
        }
        }
        return max;
        }
        public static void main(String[] args) {
        int[] nums = {37, 29, 27, 44, 65};
        System.out.println("Maximum element: " + findMax(nums));
        }
        }
 