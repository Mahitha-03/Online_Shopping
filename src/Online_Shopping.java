import java.util.Scanner;

public class Online_Shopping {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("------ Categories ------");
		System.out.println("1 . Electronics");
		System.out.println("2 .Clothing");
		System.out.println("3 . Foot Wear");
		System.out.println("4 . Accessories");
		System.out.println("5 . Home Appliances");
		
		System.out.println("Enter the Category :");
		int category = sc.nextInt();
		int product;
		double price = 0;
		double totalBill;
		String item = "";
		
		if(category == 1) {
		 
		  System.out.println("-- Electronics --");
		  System.out.println("1. Headphones - Rs.1000");
          System.out.println("2. Keyboard - Rs.800");
          System.out.println("3. Mouse - Rs.500");
          System.out.println("4. Speaker - Rs.1500");
          System.out.println("5. Monitor - Rs.8000");
          System.out.println("6. Laptop - Rs.45000");
          System.out.println("7. Mobile Phone - Rs.20000");
          System.out.print("Select product: ");
           product = sc.nextInt();
          
          if(product == 1)
          {
        	  item = "Headphones";
        	  price = 1000;
          }
          else if (product == 2) {
              item = "Keyboard"; price = 800;
          } else if (product == 3) {
              item = "Mouse"; price = 500;
          } else if (product == 4) {
              item = "Speaker"; price = 1500;
          } else if (product == 5) {
              item = "Monitor"; price = 8000;
          } else if (product == 6) {
              item = "Laptop"; price = 45000;
          } else {
              item = "Mobile Phone"; price = 20000;
          }
		
		}
		else if(category == 2)
		{
			System.out.println("\n-- Clothing --");
			System.out.println("Jeans");
			System.out.println("Shirt");
			System.out.println("Jacket");
			System.out.println("Kurti");
			System.out.println("Saree");
			
			System.out.println("Select the product");
			product = sc.nextInt();
			if(product == 1)
			{
				item = "Jeans";
				price = 1200;
			}
			else if(product == 2)
			{
				item = "Shirt";
				price = 800;
			}
			else if(product == 3)
			{
				item = "Jacket";
				price = 2000;
			}
			else if(product == 4)
			{
				item = "Kurti";
				price = 900;
			}
			else if(product == 5)
			{
				item = "Saree";
				price = 1500;
			}
		}
		else if(category == 3)
		{
			System.out.println("\n-- Foot Wear --");
			System.out.println("1. Sports Shoes - 1500");
			System.out.println("2. Sandles - 700");
			System.out.println("3. Heels - 1200");
			System.out.println("4. Sneakers - 2500");
			System.out.println("5. Boots - 3000");
			System.out.println("Enter the product");
			 product = sc.nextInt();
			if(product == 1)
			{
				item = "Sports Shoes";
				price = 1500;
			}
			else if(product == 2) {
				item = "Sandles";
				price = 700;
			}
			else if(product == 3) {
				item = "Heels";
				price = 1200;
			}
			else if(product == 4) {
				item = "Sneakers";
				price = 2500;
			}
			else if(product == 5) {
				item = "Boots";
				price = 3000;
			}
			
		}
		
		else if(category == 4)
		{

            System.out.println("\n----- Accessories -----");
            System.out.println("1. Watch - Rs.1500");
            System.out.println("2. Backpack - Rs.800");
            System.out.println("3. Sunglasses - Rs.600");
            System.out.println("4. Wallet - Rs.400");
            System.out.println("5. Belt - Rs.350");
	         
            System.out.println("Enter the product :");
             product = sc.nextInt();
            

            if (product == 1) {
                item = "Watch";
                price = 1500;
            } else if (product == 2) {
                item = "Backpack"; 
                price = 800;
            } else if (product == 3) {
                item = "Sunglasses"; 
                price = 600;
            } else if (product == 4) {
                item = "Wallet";
                price = 400;
            } else if (product == 5) {
                item = "Belt"; 
                price = 350;
		}
		
		}
		else if(category == 5)
		{
			System.out.println("\n-- Home Appliances --");
            System.out.println("1. Mixer - Rs.2000");
            System.out.println("2. Electric Kettle - Rs.900");
            System.out.println("3. Washing Machine - Rs.18000");
            System.out.println("4. Refrigerator - Rs.25000");
            System.out.println("5. Microwave Oven - Rs.8000");
            
            System.out.println("Enter the product :");
             product = sc.nextInt();
            if (product == 1) {
                item = "Mixer"; 
                price = 2000;
            } else if (product == 2) {
                item = "Electric Kettle"; 
                price = 900;
            } else if (product == 3) {
                item = "Washing Machine"; 
                price = 18000;
            } else if (product == 4) {
                item = "Refrigerator"; 
                price = 25000;
            } else if (product == 5) {
                item = "Microwave Oven"; 
                price = 8000;
            }
			
		}
		System.out.println("Enter the quantity :");
		int quantity = sc.nextInt();
		
		totalBill = price * quantity;
		
		double discount;
		if(totalBill > 3000)
		{
			discount = totalBill * 0.10;
		}
		else {
			
			if(totalBill >= 1500)
			{
				discount = totalBill * 0.05;
			}
			else {
				discount = 0;
			}
		}
	
		double finalBill = totalBill - discount;

        System.out.println("\n===== BILL DETAILS =====");
        System.out.println("Selected Product: " + item);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: Rs." + totalBill);
        System.out.println("Discount: Rs." + discount);
        System.out.println("After Discount Final Bill: Rs." + finalBill);

	}
	}


