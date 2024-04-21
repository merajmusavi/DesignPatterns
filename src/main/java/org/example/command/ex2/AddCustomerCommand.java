package org.example.command.ex2;

public class AddCustomerCommand implements Command {

    CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {

        customerService.addCustomer();
    }
}
