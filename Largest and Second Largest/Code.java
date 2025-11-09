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
        long l=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        long sl=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>sl && arr[i]!=l){
                sl=arr[i];
            }
        }
        System.out.print(l+" "+sl);
        
    }
}
