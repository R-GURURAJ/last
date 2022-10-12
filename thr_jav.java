import java.util.*;
public class thr_jav extends Thread {
static Scanner sc =new Scanner(System.in);
public void run()
{ 
  System.out.println("Thread Started Running...");
}
  public static void main(String[] args)
  {
    thr_jav g1 = new thr_jav();
    g1.run(); 
  }
}
    