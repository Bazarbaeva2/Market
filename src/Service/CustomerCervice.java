package Service;

import Classies.Customer;
import enums.Products;

import java.util.List;
import java.util.Map;

public interface CustomerCervice {
    static void printUser(Customer customer) {
    }

    String addDB(List<Customer> people);
    String createCustomer();
    String removeCustomer(String name);
    List<Customer>getAllCustomer();
    String addProduct();
    String removeProduct();
    Map<String, Integer>getList();
    Map<Products, Integer> findProduct(String name);
    String changeProfile();


    void findProduct();
}

