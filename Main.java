import java.util.*;

public class Main {

	public static void main(String[] args) {
		Customer c=new Customer();
		Product p;
		
		while(true) {
			System.out.println("\nPress 1 to Register as new Customer");
			System.out.println("Press 2 for Customer Login");
			System.out.println("Press 3 to exit: ");
			 Scanner in = new Scanner(System.in);  
	          System.out.print("Enter Choice: ");  
	          int ip = in.nextInt();  
				if(ip==3) break;
	          if(ip==1) {
	        	  System.out.print("Enter Customer Name: ");
	        	  String name = in.next();  
		          System.out.print("Enter Password: ");
		          String pass = in.next();  
			      c.setName(name, pass);
					
				}

	          if(ip==2) {
	        	  System.out.print("Enter Customer Name: ");
	        	  String name = in.next();  
		          System.out.print("Enter Password: ");
		          String pass = in.next();  
		          boolean b = c.verify(name, pass);
			      if(!b) { 
			    	  System.out.println("Invalid Name or password invalid");
			      continue;
			      } 
			      

			      while(true) {
					System.out.println("Press 1 to put product in cart(Write \"exit\"  to exit from cart): ");
					System.out.println("Press 2 see cart: ");
					System.out.println("Press 3 to exit: ");
					
			      ip = in.nextInt();
			      String order =" ";
			      if(ip==3) break;
			      while(ip==1) {
				    order = in.next(); 
				    if(order.equals("exit")) break;
			    	p=new Product(order);
			        c.addorder(p);
			      }
			      if(ip==2) {
			    	  c.getOrdes();
			      }
			      
	          }
			      in.close();
			      }

			}

	}

}
