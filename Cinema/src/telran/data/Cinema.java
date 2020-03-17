package telran.data;

import java.util.Objects;

public class Cinema {
    private String name;
    private Adrese adrese;
    public Cinema(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adrese getAdrese() {
        return adrese;
    }

    public void setAdrese(Adrese adrese) {
        this.adrese = adrese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cinema)) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(getName(), cinema.getName()) &&
                Objects.equals(getAdrese(), cinema.getAdrese());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAdrese());
    }

    @Override
    public String toString() {
        return "Cinema: " +name + ". ";
    }
}
