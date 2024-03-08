package Revision;

public class KeyPad {
    public static void main(String[] args) {
        String[] arr = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String digits = "23";

        print(digits,arr,"");
    }

    private static void print (String digits,String[] arr,String ans ) {
if (digits.length()==0) {
    System.out.println(ans);
    return;
}




int k=digits.charAt(0) - 48;
String str=arr[k-1];
for (int i = 0; i < str.length(); i++) {
    print(digits.substring(1),arr , ans+str.charAt(i));
}
    }
}
