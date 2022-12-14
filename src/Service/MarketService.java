package Service;

import Classies.Customer;

import java.util.List;

public interface MarketService
{String signIn(List<Customer>customerList);
    String removeProfile();
    String LogIn(List<Customer>customerList);
    String createMarket();
    String RemoveMarket();
    String changeMarket();
    String check();
}
