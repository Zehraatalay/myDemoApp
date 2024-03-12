package com.mycompany.app;
import java.util.ArrayList;

public class App {
    public static boolean calculatePrice(ArrayList<Integer> arr1,ArrayList<Integer> arr2, String message, int number) {
        int product = 0;

        for (int num : arr1)
                product += num;

        for (int num : arr2)
                product *= num;

            product -= number;
            System.out.println("Product: " + product + "Message: " + message);
            return true;
    }
}

