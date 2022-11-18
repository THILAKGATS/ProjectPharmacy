package Pharmacy.ProjectPharmacy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PharmacyConnect implements PharmacyDetailsAccess,Runnable
{
	List<PharmacyDetails> pharmacy = new LinkedList<PharmacyDetails>();
	Scanner scan = new Scanner(System.in);
	
	
	public PharmacyConnect()
	{
		pharmacy.add(new PharmacyDetails("Tylenol", 500, 10000.00, "Dec2022", "L484"));
		pharmacy.add(new PharmacyDetails("Vicodin", 700, 20000.00, "Jan2023", "M367"));
		pharmacy.add(new PharmacyDetails("Mscotin", 1000, 35000, "Feb2023", "M30"));
	}
	
	public void choice()
	{
		do {
			System.out.println("what filed want to do \n1.list \n2.add\n3.search\n4.update\n5.delete");
	       switch(scan.nextInt())
	       {
	       case 1:
	    	   System.out.println("your values listed here");
	    	   ListallPharmacydetails();
	    	   break;
	       case 2:
	    	   System.out.println("Enter the values need to be added: productname,quatity,price,expiry,productcode");
	    	   addnewPharmacyDetails(new PharmacyDetails(scan.next(), scan.nextInt(), scan.nextDouble(),scan.next(), scan.next()));
	    	   break;
	       case 3:
	    	   System.out.println("enter the product name want to search");
	    	   searchPharmacyDetails(scan.next());
	    	   break;
	       case 4: 
	    	   System.out.println("Enter the name want to be updated");
	    	   updatePharmacyDetails(scan.next());
	    	   break;
	       case 5:
	    	   System.out.println("Enther the product name to be deleted");
	    	   deletePharmacyDetails(scan.next());
	    	   break;
	    	   
	       }
			 
		}while(true);
	}
	@Override
	public void addnewPharmacyDetails(PharmacyDetails pharmacy) 
	{
		this.pharmacy.add(pharmacy);
		System.out.println("added successfully");
		
	}

	@Override
	public void ListallPharmacydetails() 
	{
		Iterator<PharmacyDetails> it = pharmacy.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	@Override
	public void updatePharmacyDetails(String ProductName) 
	{
		for(PharmacyDetails pharmacyobj : pharmacy)
		{
			if(pharmacyobj.getProductName().equalsIgnoreCase(ProductName))
			{
				System.out.println("enter which field need to be updated:Productname,quantity,price");
				String input =scan.next();
				switch(input)
				{
				
				case "Productname":
					System.out.println("Enter your new product name");
					String newproductname = scan.next();
					pharmacyobj.setProductName(newproductname);
					System.out.println(newproductname+"successfully added");
					break;
				case "quantity":
					System.out.println("Enter the new quantity");
					int quants = scan.nextInt();
					pharmacyobj.setQuantity(quants);
					System.out.println(quants+"Successfully added");
				}
			}
		}
	}

	@Override
	public void searchPharmacyDetails(String ProductName) 
	{
		for(PharmacyDetails pharmacydata:pharmacy)
		{
			if(pharmacydata.getProductName().equalsIgnoreCase(ProductName))
			{
				System.out.println(pharmacydata);
				return;
			}
			
			
		}

		System.out.println(ProductName+" not found");
	}

	@Override
	public void sortpharmacyDetails() 
	{
	
		
	}

	@Override
	public void deletePharmacyDetails(String ProductName)
	{
		for(PharmacyDetails search:pharmacy)
		{
			if(search.getProductName().equalsIgnoreCase(ProductName))
			{
				pharmacy.remove(search);
				System.out.println(ProductName+"successfully deleted");
				return;
			}
		}
	}

	@Override
	public void run() 
	{
		
		choice();
	}
	

}
