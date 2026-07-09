package com.algorithmsPractice.HashSet;

import java.util.HashSet;

public class HappyNumber {
    private int result(int nums) {
        int sum = 0;
        while (nums != 0) {
            int rem = nums%10;
            sum = sum + (rem*rem);
            nums /=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int r = result(n);
            if(set.contains(r)){
                return false;
            }
            if(r == 1){
                return true;
            }
            set.add(r);
            n = r;
        }
    }
}
