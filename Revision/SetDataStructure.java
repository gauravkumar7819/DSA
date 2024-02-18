package Revision;

import java.util.HashSet;
import java.util.Set;

public class SetDataStructure {
    public static void main(String[] args) {
        String s="123331";
        String sa="17681";
        String sb="123331";

        Set<String> ss=new HashSet<>();
        Set<String> s1=new HashSet<>();
        Set<String> s2=new HashSet<>();
        Set <Set> set=new HashSet<>();
     for (int i = 0; i < s.length(); i++) {
        
        ss.add(""+s.charAt(i));
     }
     System.out.println(ss);
     for (int i = 0; i < sa.length(); i++) {
        
        s1.add(""+sa.charAt(i));
     }
     System.out.println(s1);
     for (int i = 0; i < sb.length(); i++) {
        
        s2.add(""+sb.charAt(i));
     }
     System.out.println(s2);
       
     set.add(ss);
     set.add(s1);
     set.add(s2);
     System.out.println(set);
    }

}
