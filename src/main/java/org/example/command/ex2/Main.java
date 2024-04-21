package org.example.command.ex2;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        AddCustomerCommand addCustomerCommand = new AddCustomerCommand(customerService);
        Button button = new Button(addCustomerCommand);
        button.click();
    }

}
