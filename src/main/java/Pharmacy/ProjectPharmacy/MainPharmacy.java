package Pharmacy.ProjectPharmacy;

public class MainPharmacy
{

	public static void main(String[] args) 
	{
		PharmacyConnect pharmacy = new PharmacyConnect();
		Thread th = new Thread(pharmacy);
		th.start();

	}

}
