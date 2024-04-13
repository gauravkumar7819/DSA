package Lec25;
public class SubSeques {
    public static void main(String[] args) {
        String str="bccb";
        print(str,"");
        

    }

    private static void print(String str, String ans) {
        if (str.length()<=0) {
            return;
        }if (str.length()>0) {
            StringBuffer ss=new StringBuffer(ans);

            ss.reverse();
            String st=new String(ss);


            if (ans.equals(st)) {
                System.out.println(ans);
                
            }
            
        
         System.out.println(ans);
    }
for (int i = 0; i < str.length(); i++) {
    print(str.substring(0, i)+str.substring(1+i),ans+str.charAt(i));
    
}

        
    }
}
