package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.print ( "Введите любое число: " );
        // TODO Auto-generated method stub
        Scanner scan = new Scanner ( System.in );

        int number1 = scan.nextInt ( );

        System.out.println ( number1 );
        System.out.print ( "Введите любое другое число: " );

        int number2 = scan.nextInt ( );

        System.out.println ( number2 );
        System.out.print ( "Выберите действие: +,-,/ или *" );
        String mathAction = scan.next ( );
        System.out.print ( mathAction );


        switch (mathAction) {
            case "+":
                int sum = number1 + number2;
                System.out.println ( " Results in " + sum );
                break;
            case "-":
                int sub = number1 - number2;
                System.out.print ( " Results in " + sub );
                break;
            case "*":
                int mult = number1 * number2;
                System.out.print ( " Results in " + mult );
                break;
            case "/":
                int div = number1 / number2;
                System.out.println ( " Results in " + div );
            default:
                System.out.print ( " is a wrong char" );


                break;
        }
    }
}






