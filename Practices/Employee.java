public class Employee {
    
    private String firstname;
    private String lastname;
    private String Cnic;


Employee(String firstname,String lastname,String Cnic)  
{
    this.firstname=firstname;
    this.lastname=lastname;
    this.Cnic=Cnic;
}
Employee ()
{

}

public String getCnic() {
    return Cnic;
}
public void setFirstname(String firstname) {
    this.firstname = firstname;
}
public String getFirstname() {
    return firstname;
}

public void setLastname(String lastname) {
    this.lastname = lastname;
}

public String getLastname() {
    return lastname;
}


public String toString() {
    return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", Cnic=" + Cnic + "]";
}


public void earning()
{
    return 0.0;
}
}











