package de.telran;

import de.telran.exeption.InvalidAgeExeption;
import de.telran.exeption.InvalidBankCountryCodeExeption;
import de.telran.exeption.InvalidIbannLengthExeption;
import de.telran.model.BankAccount;
import de.telran.model.Customer;

import java.util.Arrays;
import java.util.List;

public class Validator {
    public static void main(String[] args) {
        List<Customer> Customers = Arrays.asList(
                new Customer("Ivan", 15, new BankAccount("DE12121212121212")),
                new Customer("Piotr", 19, new BankAccount("DE121212121212")),
                new Customer("Maria", 27, new BankAccount("DE12121212121212")),
                new Customer("Svetlana", 30, new BankAccount("DE1212121212")),
                new Customer("Elena", 15, new BankAccount("ES121212121212"))
        );

    }

    public static void validateCustomers(List<Customer> customers) {
        for (Customer customer: customers){
            try{
            validateCustomer(customer);
            } catch (InvalidIbannLengthExeption |InvalidBankCountryCodeExeption ex){
                System.out.println("Validation failed");
            } catch (InvalidAgeExeption ex){
                System.out.println("Validation failed");
            }
            System.out.println("program continius");
        }

    }
//
    public static void validateCustomer(Customer customer) throws InvalidIbannLengthExeption, InvalidBankCountryCodeExeption, InvalidAgeExeption {
        try {
            validateAge(customer);
        } catch (InvalidAgeExeption ex){

        }
        try {
            validateBankCountryCode(customer.getBankAccount());
        } catch (InvalidBankCountryCodeExeption ex) {

        }
        try {
            validateIbannLength(customer.getBankAccount());
        } catch (InvalidIbannLengthExeption ex) {

        }

    }

    private static void validateAge(Customer customer) throws InvalidAgeExeption {

    }

    private static void validateIbannLength(BankAccount bankAccount) throws InvalidIbannLengthExeption {

    }

    private static void validateBankCountryCode(BankAccount bankAccount) throws InvalidBankCountryCodeExeption {

    }

}
