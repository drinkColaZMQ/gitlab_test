package test;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        char[] chars=s.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        int hSize=0;
        int length=0;
        Integer x=0;
        for (int i=0;i<chars.length;i++){
            hm.put(chars[i],i);
            int t=hm.size();
            if (hSize==t){
               x= hm.get(chars[i])+1;

            }
        }

    }
}
