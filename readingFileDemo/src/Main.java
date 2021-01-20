import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        BufferedReader reader = null;
        int total=0;
        try {
           reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
          //Satır satır okundugu ıcın line dıyoruz Satır bosta olabılır oyuzden null dıyoruz. .
           String line =null;
           //Eğer okunabılıyorsa bunu yap
           while ((line = reader.readLine())!=null){
               total+=Integer.valueOf(line);
           }
           System.out.println("Toplam = " +total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
