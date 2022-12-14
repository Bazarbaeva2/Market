package Service.Impliment;

import Classies.Customer;
import Service.CustomerCervice;

import java.math.BigDecimal;
import java.util.*;

public class CustomerServiceImplment implements CustomerCervice {
    List<Customer> customerList=new ArrayList<Customer>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String addDB(List<Customer> people) {
         customerList = people;
        return "Successfully created";
    }

    @Override
    public String createCustomer() {
        try {
            System.out.print("\nIDs that already exist: ");
            for (Customer customer : customerList) {
                System.out.print(customer.getId() + ", ");
            }
            System.out.print("\nEnter ID: ");
            int id = new Scanner(System.in).nextInt();
            for (Customer customer :customerList) {
                if (customer.getId() == id) {
                    throw new Exeption ("\nThis ID already exists!");
                }
            }
            System.out.print("\nWrite your name: ");
            String name = new Scanner(System.in).nextLine();
            if (!name.matches("[a-zA-Z]*")) {
                throw new Exception("\nName entered incorrectly (only letters)!");
            }
            System.out.print("\nWrite your age: ");
            int age = new Scanner(System.in).nextInt();
            if (age < 0 || age > 120){
                throw new Exception("wrong age entry!");
            }
            System.out.print("\nWallet balance: ");
            BigDecimal wallet =new Scanner(System.in).nextBigDecimal();
            int wallet1 = wallet.intValue();
            if (wallet1 < 0){
                throw new Exception("Balance cannot be negative!");
            }
            System.out.println("Create password: ");
            String password = new Scanner(System.in).nextLine();
            if (password.isEmpty() || password.length() > 10){
                throw new Exception("The password must not be empty and its size must be less than 11!");
            }
            System.out.println("Create shopping list? -> y/n");
            String choice = new Scanner(System.in).next().toLowerCase();
            Map<String,Integer> shoppingList = new LinkedHashMap<>();
            if (choice.equals("y") || choice.equals("yes")) {
                boolean isTrue = true;
                try {
                    while (isTrue) {
                        System.out.print("\nWrite the name of the product: ");
                        String product = new Scanner(System.in).nextLine();
                        if (!product.matches("[a-zA-Z -]*]")) {
                            throw new Exception("Product name entered incorrectly");
                        }
                        System.out.print("Quantity: ");
                        int quantity = new Scanner(System.in).nextInt();
                        if (quantity < 0 || quantity > 200){
                            throw new Exception("Quantity cannot be negative or greater than 200!");
                        }
                        shoppingList.put(product,quantity);
                        System.out.println("\nDo you want to add something else? -> y/n");
                        String choice2 = new Scanner(System.in).next().toLowerCase();
                        if (choice2.equals("n") || choice2.equals("no")){
                            isTrue = false;
                        }
                    }
                    }catch (Exception e){
                    e.getMessage();

                    System.out.println("Wrong input!(When added to sheet).");
                }
            }
            return "Successfully created!";
        }catch (InputMismatchException e){
            System.out.println("Wrong input!");
        } catch (Exception e) {
            e.getMessage();
        } catch (Exeption e) {
            throw new RuntimeException(e);
        }
        return "Created failed!";
    }

    @Override
    public String removeCustomer(String name) {

        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        System.out.println("\n\t Here is registered customers");
        if (this.customerList.isEmpty()) {
            System.out.println("\n Customer list is empty, please add some customer");

        }else {
            for (int i = 0; i <this.customerList.size() ; i++){
                CustomerCervice.printUser(this.customerList.get(i));
            }


            }


        return this.customerList;
    }

    @Override
    public String addProduct() {
        System.out.println("\n ");

        return null;
    }

    @Override
    public String removeProduct() {

        return null;
    }

    @Override
    public Map<String, Integer> getList() {

        return null;
    }

    @Override
    public Map<String, Integer> findProduct(String name) {

        return null;
    }

    @Override
    public String changeProfile() {

        return null;
    }

    public void creatMarkets() {
    }
}
