package telran.data;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Objects;

public class Adrese {
    private String street;
    private int houseNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adrese)) return false;
        Adrese adrese = (Adrese) o;
        return getHouseNumber() == adrese.getHouseNumber() &&
                getStreet().equals(adrese.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStreet(), getHouseNumber());
    }

    @Override
    public String toString() {
        return "Adrese{" + street + ", " + houseNumber + ". ";
    }
}
