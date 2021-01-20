public class Main {

    public static void main(String[] args) {


        double[] liste = {1.2, 6.3, 4.3, 5.6};
         double toplam = 0;
         double enBuyuk = liste[0];

         for (double numaralar:liste){
             if (enBuyuk<numaralar){
                 enBuyuk=numaralar;
             }
             toplam = toplam + numaralar;
             System.out.println(numaralar);
         }
         System.out.println("Numaraların toplamı: "+ toplam);
         System.out.println("En büyük Sayı: " +enBuyuk);


















    }
}
