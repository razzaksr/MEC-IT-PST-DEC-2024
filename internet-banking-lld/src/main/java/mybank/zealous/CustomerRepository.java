package mybank.zealous;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerRepository implements CrudRepository<Customer>{
    private List<Customer> myBankCustomers;
    private CustomerRepository(){
        Customer customer1 = new Customer("Keerthana","ABCDF8765F",98767525344L,7654456545L);
        Customer customer2 = new Customer("Jothinathan","BDFDJ8765G",98765673443L,876545678L);
        Customer customer3 = new Customer("Abhinaya","NDCCD9394T",65445676534L,87654567656L);
        Customer customer4 = new Customer("Preethi","DUCFH9844I",87654563444L,7654567834L);
        myBankCustomers = Stream.of(customer1,customer2,customer3,customer4).collect(Collectors.toList());
    }
    private static CustomerRepository customerRepository = new CustomerRepository();
    public static CustomerRepository getCustomerRepository(){
        return customerRepository;
    }
    @Override
    public String save(Customer Object) {
        // TODO Auto-generated method stub
        myBankCustomers.add(Object);
        return Object.getFullName()+" became the mybank customer";
    }
    @Override
    public String update(Customer Object) {
        // TODO Auto-generated method stub
        for(Customer customer:myBankCustomers){
            if(customer.getAadhaar()==Object.getAadhaar()){
                int index = myBankCustomers.indexOf(customer);
                myBankCustomers.set(index, Object);
                return Object.getFullName()+" customer details updated";
            }
        }
        return Object.getFullName()+" customer details hasn't updated";
    }
    @Override
    public void delete(Customer Object) {
        // TODO Auto-generated method stub
        // if(myBankCustomers.contains(Object)){
        //     myBankCustomers.remove(Object);
        //     System.out.println(Object.getFullName()+" has closed the relationship");
        // }
        // else{
        //     System.out.println(Object.getFullName()+" hasn't closed the relationship");
        // }
        myBankCustomers = myBankCustomers.stream().filter(v->v.getAadhaar()!=Object.getAadhaar()).toList();
    }
    @Override
    public List<Customer> view() {
        // TODO Auto-generated method stub
        return myBankCustomers;
    }
}
