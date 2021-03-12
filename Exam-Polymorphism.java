  
public class cevrebirimleri //POLYMORPHİSM
{
    private String isim;
    public cevrebirimleri(String isim) {
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void marka()
    {
        System.out.println("Marka : Logitech");
    }
}
class klavye extends cevrebirimleri // KLAVYE SINIFI CEVRE BİRİMLERİ SINIFINA EKLENDİ
{
    public klavye(String isim) {
        super(isim);
    }
    @Override
    public void marka() {
        System.out.println(getIsim()+" Klavye");
    }
}
class mouse extends cevrebirimleri // MOUSE SINIFI CEVRE BİRİMLERİ SINIFINA EKLENDİ
{
    public mouse(String isim) {
        super(isim);
    }
    @Override
    public void marka() {
        System.out.println(getIsim()+" mouse");
    }
}
class kulaklik extends cevrebirimleri // KULAKLIK SINIFI CEVRE BİRİMLERİ SINIFINA EKLENDİ
{
    public kulaklik (String isim) {
        super(isim);

    }
    @Override
    public void marka() {
        System.out.println(getIsim()+ " kulaklık");
    }
}
