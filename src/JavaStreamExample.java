import java.util.ArrayList;
import java.util.List;

//@FunctionalInterface
class Product {
	int id;
	String name;
	float price;

	//public void m1();
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product=new Product();
		List<Product> productsList = new ArrayList<Product>();
		List<Float> productPriceList = new ArrayList<Float>();  
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		//System.out.println(productsList);
		
		productsList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		
		if(product.getPrice()<=28000f)
		{
			//System.out.println(productsList);
		}
		//System.out.println(productsList);

	}

}
