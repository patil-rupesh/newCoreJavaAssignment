
import java.util.HashMap;

public class Customer {
	 HashMap<String,String> map=new HashMap<String,String>();
	 Order o=new Order();

	 
	 public void addorder(Product p) {
		 o.addOrder(p);
		 
	}
	public void getOrdes() {
		o.getOrders(); 
	}
	

	 
	public boolean verify(String name, String pass) {
		String temp=this.map.get(name);
		if(temp.equals(pass))
			{ return true;}
		else return false;
	}
	public void setName(String name, String pass) {
		this.map.put(name,pass);
	}


}
