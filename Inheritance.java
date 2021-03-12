public class Bilgisayar
{
    private String  marka;
    private String  model;
    private int fiyat;

    public Bilgisayar(String marka,String model,int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }
        public void goster()
        {
            System.out.println("Hazir Sistem :");
            System.out.println("Marka :"+this.marka);
            System.out.println("Model :"+this.model);
            System.out.println("Fiyat :"+this.fiyat);
        }
}
