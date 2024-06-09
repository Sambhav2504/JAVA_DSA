package cd.spring;

public class Address {
    private int houseno;
    private String city;
    private int pincode;

        public String getCity() {//SETTER METHOD
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
//    public Address(int houseno,String city,int pincode){
//        this.houseno = houseno;
//        this.city = city;
//        this.pincode = pincode;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", houseno=" + houseno +
                ", pincode=" + pincode +
                '}';
    }
}

