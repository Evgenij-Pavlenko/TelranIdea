package telran.controller;

import telran.data.User;

import java.util.Scanner;

import static telran.data.User.getUserByName;

public class UserApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user1 = new User("Gena", 3457);
        User user2 = new User("Vasya", 1234);
        User user3 = new User("Petya", 5678);
        User user4 = new User("Luisa", 9012);
        User user5 = new User("Mark", 4567);

        User[] users = {user1, user2, user3, user4, user5};
        String nameUser = getNameFromUser();

        userCollaboration(users, nameUser);

        scanner.close();
    }

    public static String getNameFromUser() {
        System.out.println("Please, enter you name");
        return scanner.nextLine();
    }

    public static int operationChoice() {
        System.out.println("If you want get your secret code, enter 1");
        System.out.println("If you want change your name, enter 2");
        return scanner.nextInt();
    }

    public static void updateUser(User user) {  //проверка по коду юсера
        System.out.println("Please, enter your new name");
        String newName = scanner.next();
        if (checkPassword(user)) {
            user.setName(newName);
            System.out.println("Your new name is " + user.getName() + " now.");
        } else
            System.out.println("You make nothing");
    }

    public static boolean checkPassword(User user) {
        while (true) {
            System.out.println("Enter you password or 'quit'");
            String answer = scanner.next();
            System.out.println("You enter is: " + answer);
            if (answer.equalsIgnoreCase("quit")) {
                System.out.println("You make exit");
                return false;
            } else if (answer.equalsIgnoreCase(String.valueOf(user.getSecretCode()))) {
                System.out.println("Secretcode is right");
                return true;
            } else {
                System.out.println("Password is wrong");
                System.out.println("Enter right password");
            }

        }

    }

    public static void makeUserOperationChoise(int operation, User user) {
        switch (operation) {
            case 1:
                System.out.println(user.getSecretCode());
                break;
            case 2:
                updateUser(user);
                break;
            default:
                System.out.println("Wrong operation number");
        }
    }

    public static void userCollaboration(User[] users, String name) {
        if (getUserByName(users, name) == null) {
            System.out.println("Sorry, we don't know you");
        } else {
            System.out.println("Hello dear " + name + "!");
            int operation = operationChoice();
            makeUserOperationChoise(operation, getUserByName(users, name));
        }
    }
}
