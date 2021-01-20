public class Main {

    public static void main(String[] args) {
        HesapYonetimi hesapYonetimi = new HesapYonetimi();
        System.out.println("Hesap Bakiyesi ="+hesapYonetimi.getHesap());
        hesapYonetimi.yatirma(100);
        System.out.println("Hesap Bakiyesi ="+hesapYonetimi.getHesap());
        try {
            hesapYonetimi.cekme(90);
        }catch (BakiyeYetersizException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap Bakiyesi ="+hesapYonetimi.getHesap());
        try {
            hesapYonetimi.cekme(20);
        }catch (Exception exception) {
         System.out.println(exception.getMessage());
        }
        System.out.println("Hesap Bakiyesi ="+hesapYonetimi.getHesap());

    }
}
