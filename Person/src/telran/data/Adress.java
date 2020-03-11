package telran.data;

public class Adress {
    private String city;
    private String Street;
    private int houseNumber;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return Street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Adress() {
    }

    public Adress(String city, String street, int houseNumber) {
        setCity(city);
        setStreet(street);
        setHouseNumber(houseNumber);
    }

    @Override
    public String toString() {
        return "Adress: " + city + ", " + Street + ", " + houseNumber + '.';
    }
}
