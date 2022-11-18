package Pharmacy.ProjectPharmacy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PharmacyDetails
{
	private String ProductName;
	private int Quantity;
	private double price;
	private String ExpiryDate;
	private String ProductCode;
}
