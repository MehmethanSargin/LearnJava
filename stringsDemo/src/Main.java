public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        /*
        //Eleman sayısını bulmak için
        System.out.println("Eleman sayısı: "+mesaj.length());

        //Metin içindeki karakteri bulma
        System.out.println("5.eleman: "+mesaj.charAt(4));
        //Metinleri birleştirerek yeni bir metin oluşturuyor. concatenation
        System.out.println(mesaj.concat(" Yaşasın."));
        //Bununla  başlıyor mu başlamıyormu /Bitiyormu bitmiyormu
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        //Karakterleri toplu şekilde getirmek için
        char [] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        //Girdiğimiz karakterin kaçıncı ındexte olduğunu öğrenme
        System.out.println(mesaj.indexOf("u"));//soldan saga bakar ılkını alır
        System.out.println(mesaj.lastIndexOf("a"));//sagdan bakar ılkını alır ama ındex numarasını degıstırmez bakarken b v
        */

        //Metindeki karakterleri değiştirme işlemi
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        //Metnin içinden girdiğimiz indexler arasındaki karakterleri getirme
        System.out.println(mesaj.substring(2,5));
        //Metindeki kelimeleri bölmek için
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
       //Metindeki tüm harfleri küçültmek/büyütmek için;
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        //Metni dışarıdan aldığımızda başında ve sonunda boşluk olabılır bunları kırpmak için
        System.out.println(mesaj.trim());

    }
}
