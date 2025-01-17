package mybank.zealous;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CrudRepository crudRepository=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------Welcome to MyBank Console Banking-----------------");
        System.out.println("Enter your credentials ");
        String username = scanner.next();
        String password = scanner.next();
        if(username.equalsIgnoreCase("zealous")&&password.equalsIgnoreCase("mohamed")){
            do{
                System.out.println("Select What to manage\n1.Customer\n2.Accounts\n3.Any to logout");
                String rootMenu = scanner.next();
                switch (rootMenu) {
                    case "customer":
                        crudRepository = MyBankFactory.getCrudRepository(rootMenu);
                        boolean customerMenu = true;
                        do{
                            System.out.println("Select Option\n1.Create Customer\n2.Update Customer\n3.Delete Customer\n4.View Customers\n5.Any to root menu");
                            int customerOption = scanner.nextInt();
                            switch (customerOption) {
                                case 1:
                                    System.out.println("Enter fullname(without space), aadhaar, pan, contact");
                                    Customer customer = new Customer(scanner.next(),scanner.next(),scanner.nextLong(),scanner.nextLong());
                                    System.out.println(crudRepository.save(customer));
                                    break;
                                case 2:
                                    customer = new Customer(scanner.next(),scanner.next(),scanner.nextLong(),scanner.nextLong());
                                    System.out.println(crudRepository.update(customer));
                                    break;
                                case 3:
                                    customer = new Customer(scanner.next(),scanner.next(),scanner.nextLong(),scanner.nextLong());
                                    crudRepository.delete(customer);
                                    break;
                                case 4:
                                    crudRepository.view().forEach(System.out::println);
                                    break;
                                default:
                                    customerMenu=false;
                            }
                        }while(customerMenu);
                        break;
                    case "account":
                        crudRepository = MyBankFactory.getCrudRepository(rootMenu);
                        boolean accountMenu = true;
                        do{
                            System.out.println("Select Option\n1.Open an account\n2.Perform transaction\n3.Suspend Account\n4.View Accounts\n5.View Specific Customer\n6.Any to back toot menu");
                            int accountOption = scanner.nextInt();
                            switch (accountOption) {
                                case 1:
                                    System.out.println("Enter the account details such as number, pan, balance ");
                                    Account account = new Account(scanner.nextLong(),scanner.next(),scanner.nextDouble());
                                    System.out.println(crudRepository.save(account));
                                    break;
                                case 2:
                                    System.out.println("What you wish to \n1.withdraw\n2.deposit");
                                    int transaction = scanner.nextInt();
                                    System.out.println("Enter the account number and amount ");
                                    long leafAccNumber = scanner.nextLong();
                                    int required = scanner.nextInt();
                                    Account fetchAccount = (Account) crudRepository.view().stream().filter(v->
                                            ((Account) v).getAccountNumber()==leafAccNumber
                                        ).findFirst().get();
                                    if(fetchAccount!=null){
                                        if(transaction==1){
                                            if(fetchAccount.getAccountBalance()>=required){
                                                fetchAccount.setAccountBalance(fetchAccount.getAccountBalance()-required);
                                                System.out.println(crudRepository.update(fetchAccount));
                                            }
                                            else{
                                                System.out.println("Insuffcicient balance");
                                            }
                                        }
                                        else if(transaction==2){
                                            fetchAccount.setAccountBalance(fetchAccount.getAccountBalance()+required);
                                            System.out.println(crudRepository.update(fetchAccount));
                                        }
                                        else{
                                            System.out.println("Invalid transaction option");
                                        }
                                    }
                                    else{
                                        System.out.println("Invalid account number");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter the account details such as number, pan, balance ");
                                    account = new Account(scanner.nextLong(),scanner.next(),scanner.nextDouble());
                                    crudRepository.delete(account);
                                    break;
                                case 4:
                                    crudRepository.view().forEach(System.out::println);
                                    break;
                                case 5:
                                    System.out.println("enter customer PAN ");
                                    String pan = scanner.next();
                                    List<Account> temp = crudRepository.view().stream().filter(v->
                                        ((Account) v).getCustomer().equalsIgnoreCase(pan)
                                    ).toList();
                                    temp.forEach(System.out::println);
                                    break;
                                default:
                                    accountMenu=false;
                            }
                        }while(accountMenu);
                        break;
                    default:
                        return;
                }
            }while(true);
        }
        else{
            System.out.println("Invalid credentials");
        }


        scanner.close();
    }
}
