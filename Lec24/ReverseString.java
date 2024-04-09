package Lec24;

public class ReverseString {
  public static void main(String[] args) throws Exception {
    String str="abcdef";
    int n=str.length();
    Stack sy=new Stack(n);
    for(int i=0;i<n;i++){
        sy.push(str.charAt(i));
  }
    
    while (!sy.isEmpty()) {
        System.out.print((char)sy.pop());

        
    }
}
}
