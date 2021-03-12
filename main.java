  
import java.util.Scanner;
public class elevator {



        public static void main (String args []) {


            Scanner scan1 = new Scanner (System.in);
            Scanner scan2 = new Scanner (System.in);

            System.out.println("Lutfen bulundugunuz kati giriniz :");    // a
            int a=scan1.nextInt();

            System.out.println("Lutfen gitmek istediginiz kati giriniz :");   // b
            int b=scan2.nextInt();
            int p=a-b;





            for(int i=0;i<Math.abs(p);i++)
            {
                if(a>b) {
                    System.out.println("-*");

                }
                if(b>a)
                {
                    System.out.println("+*");
                }
            }







        }

    }
