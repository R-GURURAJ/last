import java.util.*;
class alter{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter pos and neg num :");
        int inp [] = new int[5];
        int inppos [] = new int[5];
        int inpneg [] = new int[5];
        for (int i = 0; i < inp.length; i++) {
            inp[i]=sc.nextInt();
        }
        int pos=0;
        int neg = 0;
        for (int i : inp) {
            if (i>=0) {
                inppos[pos++]=i;
            }else{
                inpneg[neg++]=i;
            }
        }
        System.out.println("neg");
        for (int i =0;i<neg;i++) {
            System.out.print(inpneg[i]+" ");
        }
        System.out.println("\npos:");
        for (int i=0;i<pos;i++) {
            System.out.print(inppos[i]+" ");
        }
    }
}