//Student: Jose Daniel Medrano Guadamuz

package uh.ac.cr;

import uh.ac.cr.calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        //Creates a new instance of Calculator class.
        Calculator calculator = new Calculator();
        float result = 0;

        //The program ends once the option 5 is chosen.
        while (calculator.getChosenOperation() != 5) {

            //The chooseOperation method is called to decide what operation is to be performed.
            calculator.chooseOperation();

            if (calculator.getChosenOperation() > 0 && calculator.getChosenOperation() < 5) {
                calculator.askFirstOperator();
                calculator.askSecondOperator();
                //This block of code is to validate whether or not the second operator is 0
                while (calculator.getChosenOperation() == 3 && calculator.secondOperator == 0) {
                    System.out.println("The second operator for the division cannot be 0"+"\n"+"Please enter another value different from 0:");
                    calculator.askSecondOperator();
                }
            }

            if (calculator.getChosenOperation() == 1) {
                //Add
                result = calculator.add();
            } else if (calculator.getChosenOperation() == 2) {
                //Subtract
                result = calculator.subtract();
            } else if (calculator.getChosenOperation() == 3) {
                //Divide
                result = calculator.divide();

            } else if (calculator.getChosenOperation() == 4) {
                //Multiply
                result = calculator.multiply();
            } else {
                System.out.println("Invalid option");
            }

            if (calculator.getChosenOperation() > 0 && calculator.getChosenOperation() < 5) {
                System.out.println("The result of the operation is: " + result + "\n");
            }

        }
        //Final print
        System.out.println("\n" + "Program has been ended" + "\n");


    }

}