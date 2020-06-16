package de.telran;

import de.telran.exeption.InvalidAgeExeption;
import de.telran.exeption.InvalidBankCountryCodeExeption;
import de.telran.exeption.InvalidIbannLengthExeption;
import de.telran.model.BankAccount;
import de.telran.model.Customer;
import org.junit.Test;

public class ValidatorTest {

    @Test(expected = InvalidAgeExeption.class)
    public void testValidateCustomer() throws Exception {
        Customer customer = new Customer("Ivan", 15, new BankAccount("DE12121212121212"));
        Validator.validateCustomer(customer);
    }
}
