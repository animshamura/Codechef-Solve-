import java.util.Scanner;
public class Main {
  public static void main(String [] ars) {
   Scanner sc = new Scanner (System.in);
   int a = sc.nextInt();
   for(int i = 1; i <= a; i++) {
     double x = sc.nextDouble();
     int y = sc.nextInt();
     int z = sc.nextInt();
     int s1 = (int) x;
     int s2 = (int) x;
     int r;
     for(int j = 1; j <= x; j++) {
       r = sc.nextInt();
       if(r != y) s1--;
       if(r != z) s2--;
     }
     
    double sum = (s1/x)*(s2/x);
    System.out.printf("%1$.10f",sum);
    System.out.println();
   }
  }
}
