class OnlineSepet
{
    private String Urunler;
    private int UrunSayisi;
    private int UrunFiyati;
    private int Indirim;

    public OnlineSepet(String urunler, int urunSayisi, int urunFiyati, int indirim)
    {
        this.Urunler = urunler;
        this.UrunSayisi = urunSayisi;
        this.UrunFiyati =urunFiyati;
        this.Indirim = indirim;



    }

    public int getIndirim() {
        return Indirim;
    }

    public void setIndirim(int indirim) {
        Indirim = indirim;
    }

    public int getUrunFiyati() {
        return UrunFiyati;
    }

    public void setUrunFiyati(int urunFiyati) {
        UrunFiyati = urunFiyati;
    }

    public int getUrunSayisi() {
        return UrunSayisi;
    }

    public void setUrunSayisi(int urunSayisi) {
        UrunSayisi = urunSayisi;
    }

    public String getUrunler() {
        return Urunler;
    }

    public void setUrunler(String urunler) {
        Urunler = urunler;
    }

public void urungoster()
{
    System.out.println(" Urun Adi : "+Urunler);
    System.out.println("Urun Sayisi :"+UrunSayisi);
    System.out.println("Urun Fiyati : "+UrunFiyati);
    System.out.println("Indirim : "+Indirim);
}

}
class Musteri
{
    private String MusteriAdi;
    private int SiparisKodu;
    private int SepetTutari;
    private String MusteriAdresi;

    public Musteri(String musteriAdi, int siparisKodu, int sepetTutari, String musteriAdresi)
    {
        this.MusteriAdi = musteriAdi;
        this.SiparisKodu = siparisKodu;
        this.SepetTutari = sepetTutari;
        this.MusteriAdresi = musteriAdresi;


    }

    public int getSepetTutari() {
        return SepetTutari;
    }

    public String getMusteriAdresi() {
        return MusteriAdresi;
    }

    public void setMusteriAdresi(String musteriAdresi) {
        MusteriAdresi = musteriAdresi;
    }

    public void setSepetTutari(int sepetTutari) {
        SepetTutari = sepetTutari;
    }

    public int getSiparisKodu() {
        return SiparisKodu;
    }

    public void setSiparisKodu(int siparisKodu) {
        SiparisKodu = siparisKodu;
    }

    public String getMusteriAdi() {
        return MusteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        MusteriAdi = musteriAdi;
    }

public void musterigoster()
{
    System.out.println("Musteri Adi :"+MusteriAdi);
    System.out.println("Siparis Kodu :"+SiparisKodu);
    System.out.println("Musteri Adresi "+MusteriAdresi);
    System.out.println("Sepet Tutari : "+SepetTutari);

}

}
class kurye
{
    private int varissuresi;
    private int puani;
    private String isim;

    public int getVarissuresi() {
        return varissuresi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getPuani() {
        return puani;
    }

    public void setPuani(int puani) {
        this.puani = puani;
    }

    public void setVarissuresi(int varissuresi) {
        this.varissuresi = varissuresi;
    }

    public kurye(int varissuresi, int puani, String isim){
        this.isim=isim;
        this.puani = puani;
        this.varissuresi =varissuresi;


    }
    public void kuryegoster()
    {
        System.out.println("Kurye Ismi : "+isim);
        System.out.println("Varis suresi : "+varissuresi);
        System.out.println("Puani : "+puani);


    }


}
class Restaurant
{
    private  String restaurant_adi;
    private  String restaurant_adresi;
    private int restaurant_puani;

    public Restaurant(String restaurant_adi, String restaurant_adresi, int restaurant_puani){
        this.restaurant_adi = restaurant_adi;
        this.restaurant_adresi = restaurant_adresi;
        this.restaurant_puani=restaurant_puani;


    }

    public int getRestaurant_puani() {
        return restaurant_puani;
    }

    public void setRestaurant_puani(int restaurant_puani) {
        this.restaurant_puani = restaurant_puani;
    }

    public String getRestaurant_adresi() {
        return restaurant_adresi;
    }

    public void setRestaurant_adresi(String restaurant_adresi) {
        this.restaurant_adresi = restaurant_adresi;
    }

    public String getRestaurant_adi() {
        return restaurant_adi;
    }

    public void setRestaurant_adi(String restaurant_adi) {
        this.restaurant_adi = restaurant_adi;
    }

public  void restaurantgoster ()
{
    System.out.println("Restaurant Adi : "+restaurant_adi);
    System.out.println("Restaurant Adresi : "+restaurant_adresi);
    System.out.println("Puani : "+restaurant_puani);
}


}



public class Odevim
{
    public static void main(String[] args)
    {

        OnlineSepet o = new OnlineSepet("Yarım Doner ",5,40,0);
        Musteri m = new Musteri("Omer ozcan",01,40,"Umraniye/Istanbul");
        kurye k = new kurye(20,8,"Mehmet");
        Restaurant r = new Restaurant("Donerci Ali ","Umraniye/Istanbul",9);

        o.urungoster();
        m.musterigoster();
        k.kuryegoster();
        r.restaurantgoster();





    }
}
