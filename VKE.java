import java.util.Scanner;

public class KıtleEndeksi
{
    public static void main(String[] args)
    {
        System.out.println("Lutfen adinizi giriniz :");
        Scanner scan = new Scanner(System.in);
        String ad = scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz :");
        Scanner scan1 = new Scanner(System.in);
        String soyad = scan1.nextLine();

        System.out.println("Boyunuzu giriniz (metre cinsinden örn:1.85):");
        Scanner scan2 = new Scanner(System.in);
        double boy =scan2.nextFloat();

        System.out.println("Kilonuzu giriniz :");
        Scanner scan3 = new Scanner(System.in);
        float kilo =scan3.nextInt();

        float hesapla = (float) (boy*boy);
        System.out.println(hesapla);

        float endeks= (kilo/hesapla);
        System.out.println("Vucut kitle endeksiniz (BMI): " +endeks);
        if (endeks<=18.4)
        {
            System.out.println("Adiniz:"+ad);
            System.out.println("Soyadiniz:"+soyad);
            System.out.println("Endeks :"+endeks);

            System.out.println("Zayifsiniz \nsağlıklı bir şekilde kilo alması önerilir.");
        }
       else if(endeks<=24.9)
        {
            System.out.println("Adiniz:"+ad);
            System.out.println("Soyadiniz:"+soyad);
            System.out.println("Endeks :"+endeks);
            System.out.println("Normal \n dengeli ve sağlıklı beslenmeye devam etmeleri önerilir.");
        }
        else if (endeks<=29.9)
        {
            System.out.println("Adiniz:"+ad);
            System.out.println("Soyadiniz:"+soyad);
            System.out.println("Endeks :"+endeks);
            System.out.println("Fazla Kilolu \n diyet ile fazla kilolarından kurtulması önerilir.");
        }
        else if (endeks<=34.9)
        {
            System.out.println("Adiniz:"+ad);
            System.out.println("Soyadiniz:"+soyad);
            System.out.println("Endeks :"+endeks);
            System.out.println("Sisman \n sağlık açısından risk oluşturabilecek düzeyde olduğu anlaşılır. Bu kişilerin diyetisyen yardımıyla kilo vermesi önerilir.");
        }
        else if (endeks<=44.9)
        {
            System.out.println("Adiniz:"+ad);
            System.out.println("Soyadiniz:"+soyad);
            System.out.println("Endeks :"+endeks);
            System.out.println("Sisman \n  İkinci derece obez olarak tanımlanan bu değerlere sahip olan kişilerde kalp ve damar hastalıkları bakımından risk artar. Kişinin kilo vermek için diyetisyene başvurması önerilir..");
        }
        else if (endeks<=45)
        {
            System.out.println("Adiniz:"+ad);
            System.out.println("Soyadiniz:"+soyad);
            System.out.println("Endeks :"+endeks);
            System.out.println("Sisman \n  İkinci derece obez olarak tanımlanan bu değerlere sahip olan kişilerde kalp ve damar hastalıkları bakımından risk artar. Kişinin kilo vermek için diyetisyene başvurması önerilir..");
        }
        else
            {
                System.out.println("Adiniz:"+ad);
                System.out.println("Soyadiniz:"+soyad);
                System.out.println("Endeks :"+endeks);
                System.out.println("Asiri Sisman \n Üçüncü derece obez kategorisinde olan bu kişilerde hastalık gelişme riski çok yüksektir. Hekim ve diyetisyen eşliğinde kilo verilmesi önerilir.");
            }


    }
}
