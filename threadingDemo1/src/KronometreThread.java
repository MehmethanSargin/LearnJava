public class KronometreThread implements Runnable{

    //standart kod olusturmak ıcın
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: "+threadName);
    }
    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : "+threadName);
        //sadece burayı kullanmak ıstedıgımız sekılde yazıcaz
        try{
            for (int i=1;i<=10;i++){
                System.out.println(threadName + " : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception){
            System.out.println("Kesildi : "+threadName);
        }

        System.out.println("Thread bitti : "+ threadName);

    }

    //standart kod başlatmak ıcın
    public void start(){
      System.out.println("Thread nesnesi oluşuyor");
      if(thread==null){
          thread = new Thread(this,threadName);
          thread.start();
      }
    }

}
