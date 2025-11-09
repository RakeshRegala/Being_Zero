import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                long m=sc.nextLong();
                long n=sc.nextLong();
                if(m<=n){
                    System.out.println(((n*(n+1))/2)-(m*(m-1))/2);
                }
                else{
                    System.out.println(((m*(m+1))/2)-(n*(n-1))/2);
                }
            }
        }
    
}
