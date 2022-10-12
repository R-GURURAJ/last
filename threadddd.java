import java.lang.Thread;
public class threadddd {
               public static void main( String arrgs[] ) {
                   X worker = new X(); // We create a worker thread to dance continously
                   DoOtherStuff(); // Let the main thread do other stuff
               }
               public static void DoOtherStuff() {
                         while(true)
                                System.out.println("-|-");
               }
}
class X implements Runnable {
               X() {
                   Thread t = new Thread(this);
                   t.start();
               }
               public void run() {
                   Work();  //some code that executes the functionality of the thread
               }
               public void Work() {
                   while(true)
                            System.out.println("+|+");
               }
 }