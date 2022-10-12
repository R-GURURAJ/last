import java.util.*;
public class reverse {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
     System.out.println("enter an string:");
     String inp=s.nextLine();
     String [] sp=inp.split(" ");
     int anss=0;
     for (String sg : sp) {
        anss++;
     }
    for (int i = anss-1; i >=0; i--) {
        System.out.print(sp[i]);
    }
    }
}
