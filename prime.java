import java.util.*;
public class prime{
static Scanner sc=new Scanner(System.in);
public static void main(String args[]){
    System.out.println("enter the start and end numbers :");
    int s=sc.nextInt();
    int e=sc.nextInt();
    for (int i = s; i < e; i++) {
        int flag=0;
        for(int j=2;j<i;j++){
            if(i%j==0 ){
                flag=1;
                // System.out.println("not prime   "+i);
                
                break;
            }
        }
        if(flag==0 && i!=1){
            System.out.println("prime       "+i);

        }
    }
}}