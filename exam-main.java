import java.util.Scanner;
import java.util.ArrayList;
class sogutucu implements aksesuar
{

    @Override
    public String getIsim() {
        return "Ergo Stand Laptop Sogutucu";
    }

}
class usb_coklayici implements aksesuar
{

    @Override
    public String getIsim() {
        return "S-Link Usb Coklayici";
    }


}
public class exam
{

    public static void main(String[] args)
    {
        Bilgisayar b = new Bilgisayar("MSI","MSI-935",7550);
        b.goster();
        System.out.println("\n");
        System.out.println("Monitorlu");
        Monitorler m = new Monitorler("Acer ","EK220qabi",1000);
        m.goster();
        b.goster();
        System.out.println("Toplam fiyat :8550");

        System.out.println("\n");
        usb_coklayici usb = new usb_coklayici();
        sogutucu sogutucu1 = new sogutucu();

        usb.getIsim();
        sogutucu1.getIsim();
        System.out.println(usb.getIsim()+" 130 TL"+"\n"+sogutucu1.getIsim()+" 200 TL");

        System.out.println("\n");
        cevrebirimleri c = new cevrebirimleri("Logitech");
        klavye k = new klavye("Cougar");
        mouse m1 = new mouse("Rampage");
        kulaklik k1 =new kulaklik("Power Boost");
        k.marka();
        m1.marka();
        k1.marka();
        System.out.println("\n");

        Gaming klavye = new Gaming_klavye();
        Gaming mouse = new Gaming_Mouse();

        klavye.getUrunturu();
        klavye.gosterme();
        mouse.getUrunturu();
        mouse.gosterme();


        System.out.println("\n");
       // Ekran kartlari icin array olusturdum sıralamak için //ARRAY
        ArrayList<String> ekran_kartlari = new ArrayList<>();
        ekran_kartlari.add("GTX 1650"); // ekran kartlarını array şeklinde yazarak atama işlemi add ile
        ekran_kartlari.add("Rodeon RX 550");
        ekran_kartlari.add("RTX 3080");
        ekran_kartlari.add("RTX 3090");

        for (int i = 0; i < ekran_kartlari.size(); i++)
        {
            System.out.println("Ekran karti :"+ekran_kartlari.get(i));

        }



    }
    }
