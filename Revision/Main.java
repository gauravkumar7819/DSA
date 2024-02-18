package Revision;

import java.util.*;
public class Main {
    public static void main (String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
   arr[i] =sc.nextInt();}
Set<List> ans=new HashSet<>();
		print(arr, 0, new ArrayList<Integer>(), ans);
		System.out.println(ans);
	}

	public static void print(int[] arr, int lp, ArrayList<Integer> list, Set<List> ans) {


        ans.add(new ArrayList<Integer>(list));

		for (int i = lp; i < arr.length; i++) {
			list.add(arr[i]);
			print(arr, i + 1, list, ans);
			list.remove(list.size() - 1);

		}}}