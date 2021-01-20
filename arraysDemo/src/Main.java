public class Main {

    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Mehmedor";
        ogrenciler[1]="Yunus Emre";
        ogrenciler[2]="Kader";
        ogrenciler[3]="Kaan";

        /* Kötü şekilde yazdırmak
        for (int i=0; i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
       */

        //iyi şekilde yazdırmak
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }










    }
}
