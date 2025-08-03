package ARRAYS;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0 ;
        int j =0 ;
        Set<Integer> resultset = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while  ( i<nums1.length && j< nums2.length)
        {
            if(nums1[i] > nums2[j]){
                j++;
            }
            else if (nums1[i]< nums2[j]){
                i++;
            }
            else
            {
                resultset.add(nums1[i]);
                i++;
                j++;
            }
        }

        int [] result = new int [resultset.size()];
        int id = 0 ;
        for (int num : resultset){
            result[id++] = num;


        }
        return result;

    } }