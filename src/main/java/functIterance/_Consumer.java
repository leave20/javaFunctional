package functIterance;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "9456321");
//        greetCustomer(maria);
        greetCustomerV2(maria,false);

        greetCustomerConsumer.accept(maria);

        greetCustomerConsumerVTwo.accept(maria, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerVTwo = (customer, showBooleanParameter) ->
            System.out.println("Hello " + (showBooleanParameter ? customer.customerName : "Jose") + "" +
                    ", thank for registering phone number " +
                    "" + (showBooleanParameter ? customer.customerPhoneNumber : "9856333333"));

    static void greetCustomerV2(Customer customer, boolean showBooleanParameter) {
        System.out.println("Hello " + (showBooleanParameter ? customer.customerName : "Jose") + "" +
                ", thank for registering phone number " +
                "" + (showBooleanParameter ? customer.customerPhoneNumber : "9856333333"));
    }


    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + "" +
                    ", thank for registering phone number " +
                    "" + customer.customerPhoneNumber);


    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + "" +
                ", thank for registering phone number " +
                "" + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
