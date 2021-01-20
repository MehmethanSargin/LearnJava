public class Main {

    public static void main(String[] args) {
        char harf = 'P';
	    /*
	    char[] kalinHarfler = {'A','I','O','U'};
        char[] inceHarfler = {'E','İ','Ö','Ü'};
	    for (char kalin : kalinHarfler){
	        if (harf == kalin){
	            System.out.println("Girdiğiniz harf kalın harftir.");
            }
        } for (char ince : inceHarfler){
	        if (harf == ince ){
	            System.out.println("Girdiğiniz harf ince harftir.");
            }
            }
            }
        }
       */
        switch (harf){
            case 'A':
            case'I':
            case'O':
            case'U':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
            case'İ':
            case 'Ö':
            case 'ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Girdiğiniz harf sesli değil");
        }



    }
}