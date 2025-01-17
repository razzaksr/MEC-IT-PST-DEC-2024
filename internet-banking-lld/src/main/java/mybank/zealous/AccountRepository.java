package mybank.zealous;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountRepository implements CrudRepository<Account>{
    private List<Account> myBankAccounts;
    private AccountRepository(){
        Account account1 = new Account(9876545676545L,"ABCDF8765F",988.5);
        Account account2 = new Account(876543456734L,"NDCCD9394T",883485.5);
        Account account3 = new Account(9876567845456L,"ABCDF8765F",348854.45);
        Account account4 = new Account(1234565432345L,"DUCFH9844I",45845.3);
        myBankAccounts = Stream.of(account1,account2,account3,account4).collect(Collectors.toList());
    }
    // singleton
    private static AccountRepository accountRepository = new AccountRepository();
    public static AccountRepository getAccountRepository(){
        return accountRepository;
    }
    @Override
    public String save(Account Object) {
        // TODO Auto-generated method stub
        myBankAccounts.add(Object);
        return Object.getAccountNumber()+" has been opened by "+Object.getCustomer();
    }
    @Override
    public String update(Account Object) {
        // TODO Auto-generated method stub
        for(Account account : myBankAccounts){
            if(Object.getAccountNumber()==account.getAccountNumber()){
                int index = myBankAccounts.indexOf(Object);
                myBankAccounts.set(index, Object);
                return Object.getAccountNumber()+" has done transactions";
            }
        }
        return Object.getAccountNumber()+" hasn't done any transactions";
    }
    @Override
    public void delete(Account Object) {
        // TODO Auto-generated method stub
        // if(myBankAccounts.contains(Object)){
        //     myBankAccounts.remove(Object);
        //     System.out.println(Object.getAccountNumber()+" has been suspended");
        // }
        // else{
        //     System.out.println(Object.getAccountNumber()+" hasn't exists");
        // }
        myBankAccounts = myBankAccounts.stream().filter(v->v.getAccountNumber()!=Object.getAccountNumber()).toList();
    }
    @Override
    public List<Account> view() {
        // TODO Auto-generated method stub
        return myBankAccounts;
    }

}
