package basic.buoi4.homework.bt4;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer.toString());
        customer.setDiscount(8);
        System.out.println(customer.toString());
        System.out.println("id is: " + customer.getId());
        System.out.println("name is: " + customer.getName());
        System.out.println("discount is: " + customer.getDiscount());
        Invoice invoice = new Invoice(101, customer, 888.8);
        System.out.println(invoice.toString());
        invoice.setAmount(999.9);
        System.out.println(invoice.toString());
        System.out.println("id is: " + invoice.getId());
        System.out.println("customer is: " + invoice.getCustomer().toString());
        System.out.println("amount is: " + invoice.getAmount());
        System.out.println("customer's id is: " + invoice.getCustomer().getId());
        System.out.println("customer's name is: " + invoice.getCustomer().getName());
        System.out.println("customer's discount is: " + invoice.getCustomer().getDiscount());
        System.out.println(String.format("amount after discount is: %.2f", invoice.getAmountAfterDiscount()));
    }
}
