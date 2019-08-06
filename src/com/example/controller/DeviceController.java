package com.example.controller;

import com.example.model.Electronics;

import java.util.Arrays;
import java.util.Scanner;

public class DeviceController {

    public static void getInputUser(Scanner input) {
        Electronics[] electronics = new Electronics[3];

        System.out.println("Wprowadź 3 urządzenia");

        for (int i = 0; i < electronics.length; i++) {
            System.out.println("nazwa");
            String name = input.nextLine();
            System.out.println("rozmiar");
            int size = input.nextInt();
            System.out.println("opis");
            input.nextLine();
            String description = input.nextLine();
            electronics[i] = getElectronicsArray(name, size, description)[i];
        }

        System.out.println(Arrays.asList(electronics));
    }

    private static Electronics[] getElectronicsArray(String name, int size, String description) {
        Electronics[] electronics = new Electronics[3];
        Electronics current = null;
        Electronics previous = null;


            do {
                for (int i = 0; i < electronics.length; i++) {
                    electronics[i] = new Electronics(name, size, description);
                    previous = current;
                    current = electronics[i];
                }
            } while (!current.equals(previous));
//            electronics[i] = new Electronics(name, size, description);
//            previous = current;
//            current = electronics[i];
//            if (current.equals(previous)) {
//                //System.out.println("wprowadź inne urządzenie");
//                electronics[i - 1] = electronics[i];
//            }

        return electronics;
    }

}
