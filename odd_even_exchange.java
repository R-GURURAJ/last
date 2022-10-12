/**
 * odd_even_exchange
 */
import java.util.*;
public class odd_even_exchange {
    static Scanner dc= new Scanner(System.in);
public static void main(String[] args) {
    char a[] ={'a' ,'b' ,'c' ,'d' ,'j' ,'o'};
    System.out.println(a.length);
    char c[]=new char[a.length];
    char a1,b1;
    for (int i = 0; i < a.length ; i++) {
        a1=a[i];
        b1=a[i+1];
        char t=b1;
        b1=a1;
        a1=t;
        c[i]=a1;
        c[i+1]=b1;
        i+=1;
    }
    for (char d : c) {
        System.out.println(d);
    }
}
    
}