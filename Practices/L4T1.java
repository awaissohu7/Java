public class L4T1 {
    String name;
    String yearofjoining;
    String address;


L4T1(String name,String yearofjoining,String address)
{
    this.name=name;
    this.yearofjoining=yearofjoining;
    this.address=address;

}

    public static void main(String[] args) {
        
        L4T1 s1=new L4T1("Awais","2003","abidcolonykhairpurmirs");
        L4T1 s2=new L4T1("Zaheer","1985","abidcolonykhairpurmirs");
        L4T1 s3=new L4T1("Siraj","2003","abidcolonykhairpurmirs");
        
        
        System.out.println(s1.name+"    "+s1.yearofjoining+"    "+s1.address);
        System.out.println(s2.name+"    "+s2.yearofjoining+"    "+s2.address);

        System.out.println(s3.name+"    "+s3.yearofjoining+"    "+s3.address);

    




























    }
}
