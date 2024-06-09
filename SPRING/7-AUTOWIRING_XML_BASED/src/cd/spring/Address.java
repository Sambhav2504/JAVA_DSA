package cd.spring;

public class Address {
    private int houseno;
    private String city;
    private int pincode;

        public void setCity(String city) {//SETTER METHOD
        this.city = city;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
//    CONSTRUCTOR METHOD
    public Address(int houseno,String city,int pincode){
        this.houseno = houseno;
        this.city=city;
        this.pincode=pincode;
    }
    @Override
    public String toString() {
        return "#"+houseno+"#"+city+"#"+pincode;
    }
}
