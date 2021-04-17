package com.company;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.function.LongToDoubleFunction;

public class Action {
    static String text="";
    static double resultOperation;
    static int countEqual = 0;
    static boolean isZero = false;

    static ArrayList<String> number = new ArrayList<>();
    static ArrayList<String> operator = new ArrayList<>();
    static String result;

    public static void insert(String x){

        if(x=="+" || x=="*" || x=="/" || x=="-" || x=="C" || x=="x2" || x=="=") {

            if(countEqual>0){
                number.add(result);
                countEqual = 0;
            }
            else
                number.add(text);

            text="";

            switch(x){
                case "+":
                    operator.add("+");
                    break;

                case "-":
                    operator.add("-");
                    break;

                case "*":
                    operator.add("*");
                    break;

                case "/":
                    operator.add("/");
                    break;

                case "=":
                    isEguals();
                    break;

                case "C":
                    number.clear();
                    operator.clear();
                    text = "";
                    Main.insertToDisplay("0");
                    break;

                case "x2":
                    resultOperation = Math.pow(Double.parseDouble(number.get(0)),2);

                    if(resultOperation%1==0) {
                        long resultOperationLong = Math.round(resultOperation);
                        text = Long.toString(resultOperationLong);
                    }
                    else
                        text = Double.toString(resultOperation);

                    Main.insertToDisplay(text);
                    text = "";
                    number.clear();
                    operator.clear();
                    break;

                default:break;
            }
        }
        else {
            if(text.length()!=11){
                text += x;
                Main.insertToDisplay(text);
            }
        }
    }

    //----- Function used to define operator= ------

    public static void isEguals(){
        resultOperation = Double.parseDouble(number.get(0));
        result="";

        for(int i=1; i<number.size(); i++){
            switch(operator.get(i-1)) {
                case "+":
                    resultOperation += Double.parseDouble(number.get(i));
                    break;
                case "-":
                    resultOperation -= Double.parseDouble(number.get(i));
                    break;
                case "*":
                    resultOperation *= Double.parseDouble(number.get(i));
                    break;
                case "/":
                    if (number.get(i).equals("0")){
                        isZero = true;
                        Main.insertToDisplay("x/0 zakazane!");
                    }
                    else
                        resultOperation /= Double.parseDouble(number.get(i));
                    break;
                default:break;
            }
        }
        if(resultOperation%1==0) {
            long resultOperationLong = Math.round(resultOperation);
            text = Long.toString(resultOperationLong);
        }
        else {
            text = Double.toString(resultOperation);
        }

        result = text;
        if(isZero == false) {
            Main.insertToDisplay(text);
            text = "";
            number.clear();
            operator.clear();
            countEqual++;
        }
        else
            isZero = false;
    }
}
