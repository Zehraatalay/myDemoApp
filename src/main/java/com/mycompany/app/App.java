package com.mycompany.app;
import java.util.ArrayList;

public class App {
    public static boolean calculatePrice(ArrayList<Integer> arr1,ArrayList<Integer> arr2, String message, int number) {
        int product = 0;
        if(arr1 == null || arr2 == null)
            return false;

        if(arr1.isEmpty() || arr2.isEmpty())
            return false;

        for (Integer num : arr1){
            if(num != null)
                product += num;
            else
                return false;
        }

        for (Integer num : arr2){
            if(num != null)
                product *= num;
            else
                return false;
        }


            product -= number;
            System.out.println("Product: " + product + "Message: " + message);
            return true;
    }
}

