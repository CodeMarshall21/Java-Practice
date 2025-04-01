package com.ProblemSolving.HashAndStar;

public class Main {
    public static void main(String[] args) {

        // print if (max(starCount,hashCount) < 3) -> "+" * max(starCount,hashCount) + "*" * max(starCount,hashCount)
        // else -> "+" * min(starCount,hashCount) + "*" * min(starCount,hashCount)

        String str = "##****";
        int starCount = 0;
        int hashCount = 0;


        for (char chr: str.toCharArray()){
            if (chr == '#'){
                hashCount ++;
            }
            if (chr == '*'){
                starCount ++;
            }

        }

        String newStr = "";

        int maxCount = Math.max(hashCount,starCount);
        int minCount = Math.min(hashCount,starCount);


        if (maxCount <= 3){
            for (int i = 0; i < maxCount; i++) {
                newStr += "#";
            }
            for (int i = 0; i < maxCount; i++) {
                newStr += "*";
            }
        }else{
            for (int i = 0; i < minCount; i++) {
                newStr += "#";
            }
            for (int i = 0; i < minCount; i++) {
                newStr += "*";
            }
        }



        System.out.println(newStr);
    }
}
