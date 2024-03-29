package Lec22;

public class Container {
    public static void main(String[] args) {
        int [] arr={1,8,6,2,5,4,8,3,7};
        int maxarea=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
            
        
        int min=Math.min(arr[i], arr[j]);
    int currarea=(j-i)*min;
    maxarea=Math.max(maxarea, currarea);

    
    }
}System.out.println(maxarea);
}
}
