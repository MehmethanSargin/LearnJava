public class Main {

    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {
            case 'A' :
                System.out.println("Mükemmel bir not : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok iyi not : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi not : Geçtiniz");
                break;
            case 'D':
                System.out.println("idare eder : Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldın");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }





    }
}
