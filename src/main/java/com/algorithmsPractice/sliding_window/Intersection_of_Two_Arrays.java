package com.algorithmsPractice.sliding_window;

import java.net.Inet4Address;
import java.util.*;

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (set.contains(nums1[i])) {
                set.remove(nums1[i]);
            }
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                if (!result.contains(nums2[i]))
                    result.add(nums2[i]);
            }
        }


        int finalArr [] = new int[result.size()];
        for(int r = 0; r<result.size(); r++){
            finalArr [r] = result.get(r);
        }
         return finalArr;

    }
    public static void main(String[] args) {
   Intersection_of_Two_Arrays a = new Intersection_of_Two_Arrays();
   int b[] = {1,2,2,1};
   int c []= {2,2};
   int[] z = a.intersection(b,c);
      for(int i=0; i<z.length; i++){
          System.out.print(z[i]+"  ");
      }
    }
}
