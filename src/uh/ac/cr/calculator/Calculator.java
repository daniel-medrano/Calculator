package uh.ac.cr.calculator;

import java.util.Scanner;

public class Calculator {

    public float firstOperator;
    public float secondOperator;
    private int operationChosen = 0;
    Scanner scanner;

    //Constructor
    public Calculator() {
        firstOperator = 0;
        secondOperator = 0;
        scanner = new Scanner(System.in);
    }
    //Option are displayed to the user and saves the input
    public void chooseOperation(){
        System.out.println("Select the number of the operation you would like to perform: ");
        System.out.println("1: Addition"+"\n"+"2: Subtraction"+"\n"+"3: Division"+"\n"+"4: Multiplication"+"\n"+"5: Exit"+"\n"+"Your answer: ");
        operationChosen = scanner.nextInt();
    }
    //When requested in the main you get the value of the option chosen by the user
    public int getChosenOperation() {
        return operationChosen;
    }

    //The first operator is asked to the user
    public void askFirstOperator() {
        System.out.println("Insert the first value: ");
        firstOperator = scanner.nextFloat();
    }
    //The second operator is asked to the user
    public void askSecondOperator() {
        System.out.println("Insert the second value: ");
        secondOperator = scanner.nextFloat();
    }

    //Method float add
    public float add() {
        return firstOperator + secondOperator;
    }

    //Method float subtract
    public float subtract() {
        return firstOperator - secondOperator;
    }

    //Method float multiply
    public float multiply() {
        return firstOperator * secondOperator;
    }

    //Method float divide
    public float divide() {
        return firstOperator / secondOperator;
    }

}

