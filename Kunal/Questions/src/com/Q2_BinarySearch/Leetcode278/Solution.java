package com.Q2_BinarySearch.Leetcode278;

public class Solution extends VersionControl{

    public Solution(int badVersion){
        super(badVersion);
    }

    public static void main(String[] args) {
        Solution solution = new Solution (4);
        System.out.println("Then " + solution.firstBadVersion(5) + " is the first bad version.");
    }

    public int firstBadVersion(int upperBound) {

        int left = 1;
        int right = upperBound;

        int mid = 0;

        if(left == right){
            return 1;
        }

        boolean result;

        while (left < right){
            mid = left + (right - left) / 2;
            result = isBadVersion(mid);

            if (result){
                right = mid;
            }
            if(!result){
                left = mid + 1;
            }
            System.out.printf("call isBadVersion(%d) -> %b\n",mid,result);

        }

        return left;
    }
}
