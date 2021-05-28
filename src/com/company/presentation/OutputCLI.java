package com.company.presentation;

import com.company.logic.Processor;

public class OutputCLI {
    public static void textGenerate() {
        System.out.println("Welcome to shape calculator!");
    }

    public static void mainMenu() {
        System.out.println("Main Menu");
        System.out.println("1. Go to calculator");
        System.out.println("2. Exit");
        System.out.println("Choose number: ");
    }

    public static void errorMessage() {
        System.err.println("You have selected wrong input!!");
    }

    public static void endMessage() {
        System.out.println("Thank you for choosing our app, see you soon!!");
    }

    public static void calcMenu() {
        System.out.println("Calculator Menu");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.println("5. Go back to Main Menu");
        System.out.println("Choose number: ");
    }

    public static void squareMenu() {
        System.out.println("Write a lenght of a side A: ");
    }

    public static void squareResult(float area, float perimeter) {
        System.out.println("Your square parameters:");
        System.out.println("Area: " + area + "cm2");
        System.out.println("Perimeter: " + perimeter + "cm");
    }

    public static void rectangleMenu() {
        System.out.println("Write a lenght of a side A and B: ");
    }

    public static void rectangleResult(float area, float perimeter) {
        System.out.println("Your rectangle parameters:");
        System.out.println("Area: " + area + "cm2");
        System.out.println("Perimeter: " + perimeter + "cm");
    }

    public static void triangleMenu() {
        System.out.println("Write a lenght of a side A,B,C and height: ");
    }

    public static void triangleResult(float area, float perimeter) {
        System.out.println("Your triangle parameters:");
        System.out.println("Area: " + area + "cm2");
        System.out.println("Perimeter: " + perimeter + "cm");
    }

    public static void circleMenu() {
        System.out.println("Write a lenght of radius and diameter: ");
    }

    public static void circleResult(float area, float perimeter) {
        System.out.println("Your Circle parameters:");
        System.out.println("Area: " + area + "cm2");
        System.out.println("Perimeter: " + perimeter + "cm");
    }
}
