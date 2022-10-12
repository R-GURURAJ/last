import java.util.*;
public class sumOfDig {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char a=s.charAt(i);
            if(Character.isDigit(a)){
                sum+=Integer.parseInt(a+"");
            }
        }
        System.out.println(sum);
    }
}
