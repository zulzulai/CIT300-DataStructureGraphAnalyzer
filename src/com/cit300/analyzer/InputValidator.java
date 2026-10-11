<<<<<<< HEAD
package com.cit300.analyzer;

import java.util.Scanner;

public class InputValidator {
    public static int getInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }
=======
package com.cit300.analyzer;

import java.util.Scanner;

public class InputValidator {
    public static int getInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }
>>>>>>> d9d3e27404c257246bb6aba2d1b928d56278097c
}