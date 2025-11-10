import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        // sc.next();
        for(int i=0;i<t;i++){
            String str=sc.next();
            str = str.toLowerCase();
            StringBuffer sb=new StringBuffer(str);
            sb.reverse();

            if(str.contentEquals(sb)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
        
        
        
        
    }
}
