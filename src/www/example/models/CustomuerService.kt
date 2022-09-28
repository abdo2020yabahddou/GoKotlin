package www.example.models

public class CustomerService {
     public fun processCustomer(customer : Customer) {
          customer.customerHasLength()

     }
     public Customer customerFromSocial(String handle) {
          return new Custmer("Bob");
     }
     public List<Customer> processedCustomer() {
          return new ArrayList<Customer>();
     }
}