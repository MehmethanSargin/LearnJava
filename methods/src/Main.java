public class Main {

    public static void main(String[] args) {
        int sayi = topla(15,7);
        int sayi1= topla2(10,5,5,7);
        System.out.println(sayi1);
    }
    public static int topla (int sayi1, int sayi2) {
       return sayi1+sayi2;
    }

    //variable arguments Çok sayıda argüman göndermek için

    public static int topla2 (int... sayilar){
       int toplam =0;
        for (int sayi:sayilar){
           toplam+=sayi;
       }
      return toplam;
    }
}
