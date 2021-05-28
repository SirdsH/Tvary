package com.company.logic;

import com.company.presentation.OutputCLI;

import java.util.Scanner;

public class Processor {
    private static Scanner sc = new Scanner(System.in);

    public static void mainController() {
        int input = sc.nextInt();
        while (!(input <= 2 && input > 0)) {
            OutputCLI.errorMessage();
            input = sc.nextInt();
        }
        if (input == 1) {
            OutputCLI.calcMenu();
            calcController();
        } else {
            OutputCLI.endMessage();
            System.exit(0);
        }
    }

    public static void calcController() {
        int input = sc.nextInt();
        while (!(input <= 5 && input > 0)) {
            OutputCLI.errorMessage();
            input = sc.nextInt();
        }
        if (input == 1) {
            OutputCLI.squareMenu();
            squareRes();
        } else if (input == 2) {
            OutputCLI.rectangleMenu();
            rectangleRes();
        } else if (input == 3) {
            OutputCLI.triangleMenu();
            triangleRes();
        } else if (input == 4) {
            OutputCLI.circleMenu();
            circleRes();
        } else {
            OutputCLI.mainMenu();
            mainController();
        }
    }

    public static void squareRes() {
        float input = sc.nextFloat();
        Square mySquare = new Square(input);
        OutputCLI.squareResult(mySquare.getArea(), mySquare.getPerimeter());
        OutputCLI.calcMenu();
        calcController();
    }

    public static void rectangleRes() {
        float inputA = sc.nextFloat();
        float inputB = sc.nextFloat();
        Rectangle myRectangle = new Rectangle(inputA, inputB);
        OutputCLI.rectangleResult(myRectangle.getArea(), myRectangle.getPerimeter());
        OutputCLI.calcMenu();
        calcController();
    }

    public static void triangleRes() {
        float inputA = sc.nextFloat();
        float inputB = sc.nextFloat();
        float inputC = sc.nextFloat();
        float inputHeight = sc.nextFloat();
        Triangle myTriangle = new Triangle(inputA, inputB, inputC, inputHeight);
        OutputCLI.triangleResult(myTriangle.getArea(), myTriangle.getPerimeter());
        OutputCLI.calcMenu();
        calcController();
    }

    public static void circleRes() {
        float inputA = sc.nextFloat();
        float inputB = sc.nextFloat();
        Circle myCircle = new Circle(inputA, inputB);
        OutputCLI.circleResult(myCircle.getArea(), myCircle.getPerimeter());
        OutputCLI.calcMenu();
        calcController();
    }
}
