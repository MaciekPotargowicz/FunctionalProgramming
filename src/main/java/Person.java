public class Person {

    private String fname;
    private String lname;
    private String city;
    private String street;
    private String zipCode;
    private String localNumber;

    public Person(String fname, String lname, String city, String street, String zipCode, String localNumber) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.localNumber = localNumber;
    }

    public Person() { }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", localNumber='" + localNumber + '\'' +
                '}';
    }
}
