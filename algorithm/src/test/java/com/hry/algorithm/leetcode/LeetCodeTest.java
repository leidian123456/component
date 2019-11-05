package com.hry.algorithm.leetcode;

import com.hry.algorithm.leetcode.one_100.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author: huangrongyou@yixin.im
 * @date: 2019/10/22 19:50
 */
public class LeetCodeTest {

    @Test
    public void twoSum(){

    }

    @Test
    public void longestSubstringWithoutRepeatingCharacters(){
        String testStr1 = "abcabcbb";
        String testStr2 = "pwwkew";
        String testStr3 = "abba";
        L003LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new L003LongestSubstringWithoutRepeatingCharacters();
        // 方法1
        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1(testStr1));
        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1(testStr2));
        Assert.assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1(testStr3));

        // 方法2
        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2(testStr1));
        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2(testStr2));
        Assert.assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2(testStr3));

    }

    @Test
    public void medianOfTwoSortedArrays(){
        int[] nums1 = new int[]{1, 3};
        int[] nums2 =  new int[]{2};

        L004MedianOfTwoSortedArrays medianOfTwoSortedArrays = new L004MedianOfTwoSortedArrays();
        Assert.assertEquals(2.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);


        nums1 = new int[]{1, 2};
        nums2 =  new int[]{3, 4};
        Assert.assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }

    @Test
    public void LongestPalindromicSubstring(){
        L005LongestPalindromicSubstring longestPalindromicSubstring = new L005LongestPalindromicSubstring();
        Assert.assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
    }

    @Test
    public void L007ReverseInteger(){
        L007ReverseInteger l007ReverseInteger = new L007ReverseInteger();
        Assert.assertEquals(321, l007ReverseInteger.reverse(123));
        Assert.assertEquals(-54321, l007ReverseInteger.reverse(-12345));
        Assert.assertEquals(0, l007ReverseInteger.reverse(1534236469));
    }


    @Test
    public void L008StringToInteger(){
        L008StringToInteger l008StringToInteger = new L008StringToInteger();
        Assert.assertEquals(42, l008StringToInteger.myAtoi("42"));
        Assert.assertEquals(-42, l008StringToInteger.myAtoi("   -42"));
        Assert.assertEquals(4193, l008StringToInteger.myAtoi("4193 with words"));
        Assert.assertEquals(0, l008StringToInteger.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, l008StringToInteger.myAtoi("-91283472332"));
        Assert.assertEquals(2147483647, l008StringToInteger.myAtoi("9223372036854775808"));
    }

}





















