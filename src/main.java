import java.util.Arrays;

/**
 * Created by think on 2018/1/7
 * 测试数据：
 * 小数据
 * 空数据
 * 大数据
 */
public class main {
    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums3 = {0, 1};
        int[] nums4 = {0};//sout:1
        int[] nums5 = {1};//sout:0
        int[] nums6 = {1, 2};//sout:0
        System.out.println(missingNumber2(nums1));
        System.out.println(missingNumber2(nums2));
        System.out.println(missingNumber2(nums3));
        System.out.println(missingNumber2(nums4));
        System.out.println(missingNumber2(nums5));
        System.out.println(missingNumber2(nums6));
    }

    public static int missingNumber1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1 && nums[0] != 0) return 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[0] != 0) {
                return nums[0] - 1;
            }
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }


    public static int missingNumber2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int total = 0;
        for (int i = 0; i <= nums.length ; i++) {
            total += i;
        }
        for (int num:nums) {
            total -= num;
        }
        return total;
    }
}
