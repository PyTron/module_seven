public class Patient{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String middleName;
    private int zipCode;
    private String phoneNum;
    private String emerContName;
    private String emerContPhone;
    public Patient(String a, String b, String c, String d, String e, String f, int g, String h, String i, String j){
        this.firstName = a;
        this.lastName = b;
        this.middleName = c;
        this.address = d;
        this.city = e;
        this.state = f;
        this.zipCode = g;
        this.phoneNum = h;
        this.emerContName = i;
        this.emerContPhone = j;
    }
    public void setFirstName(String a){
        firstName = a;
    }
    public void setLastName(String a){
        lastName = a;
    }
    public void setMiddleName(String a){
        middleName = a;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setCity(String a){
        city = a;
    }
    public void setState(String a){
        state = a;
    }
    public void setZipCode(int a){
        zipCode = a;
    }
    public void setPhoneNum(String a){
        phoneNum = a;
    }
    public void setEmerContName(String a){
        emerContName = a;
    }
    public void setEmerContNum(String a){
        emerContPhone= a;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZipCode(){
        return zipCode;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getEmerContName(){
        return emerContName;
    }
    public String getEmerContNum(){
        return emerContPhone;
    }
    public String toString()
    {
        return "Name of Patient: " + firstName + " " + middleName +  " " + lastName + 
        "\nAddress of Patient: " + address + 
        "\n City " + city + " State: " + state + " Zip: " + zipCode +
        "\nPatient Phone Number: " + phoneNum + 
        "\nPatient Emergency Contact: Name: " + emerContName + " Phone: " + emerContPhone;
    }
}