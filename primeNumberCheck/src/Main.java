public class Main {

    public static void main(String[] args) {
	    int number = 25;
	    boolean asalSorgu= true;

	    if (number==1){
	    	System.out.println("Sayı Asal Değildir.");
	    	//koşulu sağlayıp kodu bıtırmek için return komutunu kullanıyoruz.
			return;
		}
	    if (number<1){
	    	System.out.println("Geçersiz sayı girdiniz");
	    	return;
		}

	    for (int i=2; i<number; i++){
	    	//kalanla işlem yapmak için bu modu "%" kullanıyorum.
	    	if(number % i == 0){
	    		asalSorgu=false;
			}
		}
	    if (asalSorgu==true){
	    	System.out.println("Sayı asaldır.");

		}else {
	    	System.out.println("Sayı Asal Değildir.");
		}


    }
}
