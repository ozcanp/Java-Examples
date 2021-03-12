public abstract class Gaming // ABSTRACT
{
    private String urunturu; // urun türü
    public int  yıl=2021 ; // yıl burada cıkıs tarıhıdır.
    public abstract String getUrunturu();
    public int fiyat ;
    public abstract int getFiyat();

    public int  getYıl()
    {
        return this.yıl;
    }
    void gosterme(){
        System.out.println(getUrunturu()+" "+getYıl());
        System.out.println(getFiyat());
    }
}
class Gaming_Mouse extends Gaming{
    @Override
    public String getUrunturu() {
        return "Logitech Gaming Mouse";
    }
    @Override
    public int getFiyat() {
        return 200;
    }
    @Override
    public int getYıl() {
        return super.getYıl();
    }
}
class Gaming_klavye extends Gaming{
    @Override
    public String getUrunturu() {
        return "Steel Series Apex Mekanik klavye";
    }
    @Override
    public int getFiyat() {
        return 550;
    }
    public int getYıl(){
        return super.getYıl();
    }

}
