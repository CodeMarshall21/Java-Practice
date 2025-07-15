package com.A3_FunctionsInJava;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(15,21,32,24,54,65);
        mulArgs(15,32,"Hello","World","Hi","There");
    }
    static void multiple(int ...v){
        System.out.printf("%s\n",Arrays.toString(v));
    }

    static void mulArgs(int a, int b, String ...v){
        System.out.printf("%d %d %s",a,b,Arrays.toString(v));
//        System.out.println(b);
//        System.out.println(Arrays.toString(v));

    }
}
