public class ComisssionEmployeeClass extends Employee
{
    
private double grossSales;
private double comissionRate;







public void setGrossSales(double grossSales) {
	if (grossSales < 0) {
		System.err.println("Invalid gross sales");
	} else {
		this.grossSales = grossSales;
	}

    public double getGrossSales() {
        return grossSales;
    }
}



public void setComissionRate(double comissionRate) {
	if (comissionRate < 0) {
		System.err.println("Invalid comission rate");
	} else {
		this.comissionRate = comissionRate;
	}
}
public double getComissionRate() {
	return comissionRate;
}
public ComisssionEmployeeClass() {
	super();
}

public ComisssionEmployeeClass(String firstname, String lastname, String Cnic,
		double grossSales, double comissionRate) {
	super(firstname, lastname, Cnic);
	this.grossSales = grossSales;
	this.comissionRate = comissionRate;
}

@Override
public String toString() {
	return "\nCommission employee: " + super.toString();
}

@Override
public double earnings() {
	return grossSales * comissionRate;
}



}
