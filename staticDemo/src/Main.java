public class Main {

    public static void main(String[] args) {
	ProductManager productManager = new ProductManager();
	Product product = new Product();
	product.name="Urun";
	product.price=3.14;
	productManager.add(product);
    }
}
