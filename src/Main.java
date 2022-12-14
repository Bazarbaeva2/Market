import Classies.Customer;
import Service.Impliment.CustomerServiceImplment;
import Service.Impliment.MarketImpl;
import enums.Markets;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner=new Scanner(System.in);
        CustomerServiceImplment service = new CustomerServiceImplment();
        while (true) {

            int actionType = scanner.nextInt();
            switch (actionType){
                case 1-> service.createCustomer();
                case 2-> service.getAllCustomer();
                case 3-> service.creatMarkets();
                case 4-> service.getAllCustomer();

            }

        }
    }
}



