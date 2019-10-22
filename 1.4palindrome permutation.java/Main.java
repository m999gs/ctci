import java.util.*;
class Main{
    public static void main(String args[]) {
        String s="Tact Coa";
        System.out.println(func(s));
    }
    public static boolean func(String s){
        s=s.toLowerCase();
        int[] arr=new int[26];
        for(char c:s.toCharArray())if(c-'a'>=0&&c-'a'<26)arr[c-'a']++;
        int nums_odds=0;
        for(int x:arr)if(x%2!=0)nums_odds++;
        return nums_odds>1?false:true;
    }
}