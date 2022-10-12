public class equation {
    public static void main(String[] args) {
     String s="20+4-8*9/11",exp[]=new String[s.length()],num[]=new String[s.length()];
     int e=0,n=0,len=s.length();
     for(int i =0,k=0;i<s.length();i++){
        if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
            exp[e++]=s.charAt(i)+"";
            num[n++]=s.substring(0, i);
            // System.out.println(s.substring(0, i));
            s=""+s.substring(i+1,s.length());
            i=0;
            System.out.println(s);
        }
    }
    num[n++] = s;
    System.out.println("----------------------------------");
    for(int i =0;i<e;i++){
        System.out.println(exp[i]);
    }
    System.out.println("----------------------------------");
    for(int i =0;i<n;i++){
        System.out.println(num[i]);
    }
    String ans ="";
    for (int i =n-1,j=e-1; i>=0 || j>=0; i--,j--) {
        ans+=num[i];
        if(j>=0){
            ans+=exp[j];
        }
    }
  System.out.println(ans);
    }
}
