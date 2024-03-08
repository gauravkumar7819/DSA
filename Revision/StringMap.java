package Revision;

import java.util.*;
public class StringMap {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> ls= new ArrayList<>();
        mapped(n+"",ls);
    }
    public static String change(List<String> ls){
        String ans="";
        for(String s:ls){
            int n=Integer.valueOf(s);
            char ch=(char)(n+'A'-1);
            ans+=ch;
        }
        return ans;
    }
    public static void mapped(String s,List<String> ls){
        if(s.length()==0){
            String ans=change(ls);
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=s.length();i++){
            if(Integer.valueOf(s.substring(0,i))<=26){
                ls.add(s.substring(0,i));
                mapped(s.substring(i),ls);
                ls.remove(ls.size()-1);
            }

        }
    }
}