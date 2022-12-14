package Service.Impliment;

import Classies.Customer;
import Service.CustomerCervice;
import enums.Markets;
import enums.Products;
import jdk.internal.jimage.ImageStream;

import java.math.BigDecimal;
import java.util.*;

public class CustomerServiceImplment implements CustomerCervice {
    List<Customer> customerList = new ArrayList<Customer>();
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
            for (Customer customer : customerList) {
                if (customer.getId() == id) {
                    throw new Exeption("\nThis ID already exists!");
                }
            }
            System.out.print("\nWrite your name: ");
            String name = new Scanner(System.in).nextLine();
            if (!name.matches("[a-zA-Z]*")) {
                throw new Exception("\nName entered incorrectly (only letters)!");
            }
            System.out.print("\nWrite your age: ");
            int age = new Scanner(System.in).nextInt();
            if (age < 0 || age > 120) {
                throw new Exception("wrong age entry!");
            }
            System.out.print("\nWallet balance: ");
            BigDecimal wallet = new Scanner(System.in).nextBigDecimal();
            int wallet1 = wallet.intValue();
            if (wallet1 < 0) {
                throw new Exception("Balance cannot be negative!");
            }
            System.out.println("Create password: ");
            String password = new Scanner(System.in).nextLine();
            if (password.isEmpty() || password.length() > 10) {
                throw new Exception("The password must not be empty and its size must be less than 11!");
            }
            System.out.println("Create shopping list? -> y/n");
            String choice = new Scanner(System.in).next().toLowerCase();
            Map<String, Integer> shoppingList = new LinkedHashMap<>();
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
                        if (quantity < 0 || quantity > 200) {
                            throw new Exception("Quantity cannot be negative or greater than 200!");
                        }
                        shoppingList.put(product, quantity);
                        System.out.println("\nDo you want to add something else? -> y/n");
                        String choice2 = new Scanner(System.in).next().toLowerCase();
                        if (choice2.equals("n") || choice2.equals("no")) {
                            isTrue = false;
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();

                    System.out.println("Wrong input!(When added to sheet).");
                }
            }
            return "Successfully created!";
        } catch (InputMismatchException e) {
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

        } else {
            for (int i = 0; i < this.customerList.size(); i++) {
                CustomerCervice.printUser(this.customerList.get(i));
            }


        }


        return this.customerList;
    }

    @Override
    public String addProduct() {

        System.out.println("\n ");


        return addProduct();
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
    public Map<Products, Integer> findProduct(String name) {
        Map<Products, Integer> productsIntegerMap = new HashMap<>();
        List<Integer> price = new ArrayList<>();
        List<Products> list = new ArrayList<>();
        Integer sum;
        Integer disc = 0;
        System.out.println("Write customer name: ");
        String people = scanner.next().toUpperCase();
        for (Customer customer : customerList) {
            if (people.equals(customer.getName())) {
                System.out.println("Choose your best Market: ");
                Markets markets = Markets.valueOf(scanner.next().toLowerCase());
                Markets[] market = Markets.values();
                for (Markets markets1 : market) {
                    if (markets1.equals(markets)) {
                        System.out.println("Choose products: ");
                        Products products = Products.valueOf(scanner.next().toLowerCase());
                        Integer p1 = products.getPrice();

                        System.out.println("Price product: " + p1);
                        BigDecimal buy = customer.getWallet();
                        Integer marketMoney = markets1.getDeclaringClass().getModifiers();
                        System.out.println("Customer money: " + buy);
                        if ((buy - (p1)) > 0) {

                            Integer buyerMoney = (buy - (p1));
                            Integer mMoney = marketMoney + p1;
                            customer.setBankCard(buyerMoney);
                            markets1.setBankCard(mMoney);

                            System.out.println("Remainder money: " + buyerMoney);
                            Integer d1 = products.getSum();
                            price.add(p1);
                            disc = (d1);
                            sum = p1;
                            ImageStream goodsIntegerMap = new ImageStream();
                            goodsIntegerMap.put(products, p1);
                            if (name.equals(customer.getName())) {
                                list.add(products);
                                customer.setList(list);
                                List<Markets> marketsList = new ArrayList<>();
                                marketsList.add(markets);
                                customer.setName(marketsList.toString());
                            }
                            while (true) {
                                System.out.print("Want to select a product (yes  / no) ");
                                String x = scanner.next();
                                if (x.equals("yes")) {
                                    System.out.print("Choose goods: ");
                                    Products g2 = Products.valueOf(scanner.next().toUpperCase());
                                    Integer p2 = g2.getPrice();
                                    Integer d2 = g2.getSum();
                                    System.out.println("Price product:" + p2); //->  price goods //1
                                    Integer z = customer.getBankCard();
                                    for (int i = 0; i < 1; i++) {
                                        if (z - (p2) > 0) {
                                            z = (z - p2);
                                            disc += d2;
                                            price.add(p2);
                                            sum += p2;
                                            mMoney = (mMoney + p2);
                                            z = z + disc;
                                            customer.setBankCard(z);
                                            markets1.setBankCard(mMoney - disc);
                                            System.out.println("market money:" + mMoney);
                                            System.out.println("Remainder money: " + z);//2

                                            goodsIntegerMap.put(g2, p2);
                                            if (name.equals(customer.getName())) {

                                                list.add(g2);
                                                customer.setList(list);
                                            }
                                        } else {
                                            System.out.println("Not enough money");
                                        }
                                    }
                                } else if (x.equals("no"))
                                    break;
                            }
                            System.out.println("" +
                                    "\n ========================= Check =================================" +
                                    "\n                Customers: " + name +
                                    "\n                Markets: " + markets +
                                    "\n                List: " + productsIntegerMap +
                                    "\n                Total cost of products: " + price + " = " + sum +
                                    "\n***************** Thank you for your purchase!!! ******************");
                        } else {
                            System.out.println("Not enough money");
                        }
                    }
                }
            } else {
                System.out.println("Not founded buyer ");
            }
        }

     catch(Exception Throwable e;
        e){
            System.out.println(e.getMessage());
        }
        return productsIntegerMap;


    }

    @Override
    public String changeProfile() {
        return null;
    }

    @Override
    public void findProduct() {

    }

    public void creatMarkets() {
    }
}
