package Hackathon;
public class KeyPad {
    public static void main(String[] args) {
        String[] arr = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String digits = "23";
        print(arr,digits,"");
    }

    private static void print(String[] arr, String digits, String ans) {
        if (digits.length()<0) {
            return;
            
        }
if (digits.length()==0) {
    System.out.println(ans);
    return;
    
}
        int k=digits.charAt(0)-48;
        String str=arr[k-1];
        for (int i = 0; i < str.length(); i++) {
            print(arr, digits.substring(1), ans+str.charAt(i));
            
        }
       
    }
}
