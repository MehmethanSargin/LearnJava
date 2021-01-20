import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer engin = new Customer(1,"Engin","Demiroğ");
        customers.remove(engin);
        customers.add(new Customer(2,"Zengin","Demiroğ"));
        customers.add(new Customer(3,"Bezgin","Demiroğ"));

        //remove etmek için bu yanlıs cunku yıne newlıyor. Referans tıp oldugu ıcın Yukarıdakı gıbı yapmak gerekıyor.
        //customers.remove(new Customer(1,"Engin","Demiroğ"));


        for (Customer customer:customers){
            System.out.println(customer.firtsName);
        }

    }
}
