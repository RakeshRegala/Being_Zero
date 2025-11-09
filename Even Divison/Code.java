import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                System.out.println("NO");
            }
            else if(arr[i]%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
