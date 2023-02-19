package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculadora {
    public static void main(String[] args){
        LogicaCalculadora calculator = new LogicaCalculadora();
        Scanner reader = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();
        boolean isNumber = true;

        while (true){
            if(isNumber){
                System.out.println("Enter a number: ");
                String num = reader.nextLine();
                if(calculator.numCheck(num)){
                    numbers.add(Double.parseDouble(num));
                    isNumber = false;
                }else{
                    System.out.println("Invalid Number");
                }
            }else{
                System.out.println("Enter an operator: ");
                String op = reader.nextLine();
                if(op.length()==0){op=" ";}
                if(op.charAt(0)=='+'||op.charAt(0)=='-'||op.charAt(0)=='*'||op.charAt(0)=='/'||op.charAt(0)=='='){
                    operators.add(op.charAt(0));
                    if(op.charAt(0)=='='){
                        System.out.println(calculator.orderOperations(numbers, operators));
                        break;
                    }
                    isNumber = true;
                }else{
                    System.out.println("Invalid Operator");
                }
            }
        }
        reader.close();
    }

}