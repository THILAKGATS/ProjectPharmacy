package Pharmacy.ProjectPharmacy;

public interface PharmacyDetailsAccess 
{
	public void addnewPharmacyDetails(PharmacyDetails pharmacy);
	public void ListallPharmacydetails();
	public void updatePharmacyDetails(String ProductName);
	public void searchPharmacyDetails(String ProductName);
	public void sortpharmacyDetails();
	public void deletePharmacyDetails(String ProductName);
	
}
