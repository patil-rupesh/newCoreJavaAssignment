
import java.util.*;

public class Order {
    
    List<Product> names=new ArrayList<Product>();

    public void addOrder(Product p) {
    	names.add(new Product(p.getName()));
		 System.out.println("Success in adding");
	}
	public void getOrders() {
	Iterator<Product> it = names.iterator();
	while (it.hasNext()) {
			
			System.out.print(it.next().getName()+" ");
		}
		}

}
