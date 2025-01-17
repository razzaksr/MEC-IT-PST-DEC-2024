package mybank.zealous;

public class MyBankFactory {
    private static CrudRepository crudRepository=null;
    public static CrudRepository getCrudRepository(String what){
        if(what.equalsIgnoreCase("account")){
            crudRepository = AccountRepository.getAccountRepository();
        }
        else if(what.equalsIgnoreCase("customer")){
            crudRepository = CustomerRepository.getCustomerRepository();
        }
        return crudRepository;
    }
}
