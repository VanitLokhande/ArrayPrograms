package com.company;
import java.util.*;

public class LargestAndSmallestWordInString {
    public static void main(String[]args){
        String str = "Hardships often prepare ordinary people for an extraordinary destiny";
        String [] words = str.split(" ");
        int max=0;
        int min =15;
        String small="";
        String big ="";
        for(int i=0;i< words.length;i++){
            int len =0;
            String word = words[i];
            for(int j=0;j< word.length();j++){
                word.charAt(j);
                len=len+1;
            }

            if(max<len){
                max=len;
                big =words[i];

            }
            if(min>len){
                min=len;
                small = words[i];
            }
        }
        System.out.println("maxium len-"+max);
        System.out.println("largest string-"+big);
        System.out.println("minimum len-"+min);
        System.out.println("smallest string-"+small);

    }
}
