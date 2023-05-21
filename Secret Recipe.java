import java.util.*;
public class Main {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int x,a,b,c,d,e;
    x = sc.nextInt();
    for (int i = 1; i <= x; i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = sc.nextInt();
      e = sc.nextInt();
      int aa = a - c;
      if( aa < 0) aa*=-1;
      int bb = b - c;
      if(bb < 0) bb*= -1;
     double dis1 = ((double)aa)/d;
     double dis2 = ((double)bb)/e;
     if(dis1 > dis2) System.out.println("Kefa");
     else if(dis2 > dis1) System.out.println("Chef");
     else System.out.println("Draw");
    }
  }
}
