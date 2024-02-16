package Revision;

import java.util.ArrayList;

public class Array_list {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	list.add(100);
	list.add(10);
	list.add(00);
	list.add(200);
	list.add(1300);
	list.add(1050);
	boolean b=list.contains(100);
	System.out.println(list +""+b +"" +list.get(0));
}
}
