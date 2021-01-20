import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add("Ankara");
/*
        System.out.println(sayilar.size());
        System.out.println(sayilar.remove(1));
        System.out.println(sayilar.get(1));
        System.out.println(sayilar.set(1,1));

 */
        for (Object i:sayilar){
            System.out.println(i);
        }
    }
}
