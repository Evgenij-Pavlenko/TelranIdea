package telran.data;

public class Person implements Comparable<Person> {
    private String name;
    Adress adress;

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Person() {
    }

    public Person(String name, Adress adress) {
        this.name = name;
        setAdress(adress);
    }

    public static void getPesons(Person[] pers) {
        for (Person p : pers) {
            System.out.println(p.toString());
        }
    }

    public static void findByName(Person[] pers, String name) {
        int flag = 0;
        for (Person p : pers) {
            if (p.getName().equalsIgnoreCase(name)) {
                flag = 1;
                System.out.println(p.getName() + " livs on the " + p.getAdress().getCity());
            }

        }
        if (flag == 0) {
            System.out.println("Not found");
        }

    }

    public static void findNamedByCity(Person[] pers, String city) {
        int flag = 0;
        for (Person p : pers) {
            if (p.getAdress().getCity().equalsIgnoreCase(city)) {
                flag = 1;
                System.out.println(p.getName() + " LIVS on the " + p.getAdress().getCity() + ", Street: " + p.getAdress().getStreet());
            }

        }
        if (flag == 0) {
            System.out.println("Not found1");
        }
    }

    public int compareTo(Person person) {
        return this.getAdress().getStreet().compareTo(person.getAdress().getStreet());
    }

    public static void sortByStreet(Person[] pers) {
        for (int i = 0; i < pers.length - i; i++) {
            for (int j = 0; j < pers.length - 1; j++) {
                if (pers[j].compareTo(pers[j+1])>0) {
                    Person temp = pers[j];
                    pers[j] = pers[j + 1];
                    pers[j + 1] = temp;
                }
            }
        }

    }
//        for (int i = 0; i < pers.length - i; i++) {
//            for (int j = 0; j < pers.length - 1; j++) {
//                if (pers[j].getAdress().getStreet().equalsIgnoreCase(pers[j + 1].getAdress().getStreet())) {
//                    Person temp = pers[j];
//                    pers[j] = pers[j + 1];
//                    pers[j + 1] = temp;
//                }
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Person: " + name + '\n' + adress;
    }
}
