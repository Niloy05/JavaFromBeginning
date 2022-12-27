package workingWithVariables;

import java.util.Scanner;   //Scanner package is essential of taking input in java

public class InputInJava {

    public void takingInputInJava() {

        Scanner takingInput = new Scanner(System.in);

        System.out.println("Enter Int: ");
        int myInt = takingInput.nextInt();

        System.out.println("Enter Float: ");
        float myFloat = takingInput.nextFloat();

        System.out.println("Enter Double: ");
        double myDouble = takingInput.nextDouble();

        System.out.println("Enter String: ");
        String myString = takingInput.next();

        System.out.println("Entered Integer: " +myInt);
        System.out.println("Entered float: "+myFloat);
        System.out.println("Entered double: "+myDouble);
        System.out.println("Entered String: "+myString);

    }

    //output
    public static void main(String[] args) {
        InputInJava iij=new InputInJava();

        iij.takingInputInJava();

    }
}
