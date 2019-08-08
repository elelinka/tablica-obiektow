package com.example.controller;

import com.example.model.Electronics;

import java.util.Arrays;
import java.util.Scanner;

public class DeviceController {

    public static void addObjectToArray(Scanner input) {
        Electronics[] electronics = new Electronics[3];

        Electronics previous;
        Electronics current;

        String name;
        int size;
        String description;

        System.out.println("Wprowadź 3 urządzenia");

        for (int i = 0; i < electronics.length; i++) {
            System.out.println("nazwa");
            name = input.nextLine();
            System.out.println("rozmiar");
            size = input.nextInt();
            input.nextLine();
            System.out.println("opis");
            description = input.nextLine();
            electronics[i] = new Electronics(name, size, description);
            previous = electronics[i];
            for (int j = i + 1; j < electronics.length; j++) {
                System.out.println("nazwa");
                name = input.nextLine();
                System.out.println("rozmiar");
                size = input.nextInt();
                input.nextLine();
                System.out.println("opis");
                description = input.nextLine();
                electronics[j] = new Electronics(name, size, description);
                current = electronics[j];
                if (current.equals(previous)) {
                    System.out.println("podaj inne urządzenie");
                    j--;
                    continue;
                }
            }
        }
        System.out.println(Arrays.asList(electronics));
    }
}
