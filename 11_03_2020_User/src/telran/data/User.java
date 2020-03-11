package telran.data;

public class User {
    private String name;
    private int secretCode;

    public String getName() {
        return name;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, int secretCode) {
        this.name = name;
        this.secretCode = secretCode;
    }
    public static User getUserByName(User[] users, String name){
        for(int i = 0; i < users.length; i++){
            if(users[i].getName().equalsIgnoreCase(name)){
                return users[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "\nUser: " + name + ", Code: " +secretCode +'.';
    }
}
