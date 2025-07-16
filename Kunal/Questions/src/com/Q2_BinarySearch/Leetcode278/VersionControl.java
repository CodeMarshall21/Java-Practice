package com.Q2_BinarySearch.Leetcode278;

import java.util.Random;

public class VersionControl {
    int badVersion;


    public VersionControl(int badVersion){
        this. badVersion = badVersion;
    }

    public boolean isBadVersion(int version){
        return version >= badVersion;
    }

}
