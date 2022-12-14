package Classies;


import java.math.BigDecimal;
import java.util.Map;

public class Customer {
    private int id;
    private String name;
    private int age;
    private BigDecimal wallet;
    private String password;
    private Map<String, Integer> shoppingList;

    public Customer(){

    }

    public Customer(int id, String name, int age, BigDecimal wallet, String password, Map<String, Integer> shoppingList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.password = password;
        this.shoppingList = shoppingList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Integer> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(Map<String, Integer> shoppingList) {
        this.shoppingList = shoppingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", wallet=" + wallet +
                ", password='" + password + '\'' +
                ", shoppingList=" + shoppingList +
                '}';
    }
}
