package Classies;

import enums.Markets;
import enums.Products;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Market {
    private String name;
    private List<Map<Products, String>> products;
    private BigDecimal wallet;

    public Market() {

    }

    public Market(String name, List<Map<Products, String>> products, BigDecimal wallet) {
        this.name = name;
        this.products = products;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map<Products, String>> getProducts() {
        return products;
    }

    public void setProducts(List<Map<Products, String>> products) {
        this.products = products;
    }

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", products=" + products +
                ", wallet=" + wallet +
                '}';
    }
}

