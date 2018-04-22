package wsp.joseph;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Joseph
 * @version 1.0
 * @DATE 2018-4-3
 */
public class SystemDesignTest {
    SystemDesign systemDesign = new SystemDesign();
    @Test
   public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(systemDesign.twoSum(nums, target)));
        //System.out.println(Arrays.asList(systemDesign.twoSum(nums, target)));
        //Arrays.asList(systemDesign.twoSum(nums, target)).stream().forEach(s -> System.out.println(s));
    }

    @Test
    public void lengthOfLongestSubstring() {
        System.out.println(systemDesign.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(systemDesign.lengthOfLongestSubstring("abcabcbb"), 3);
    }
}