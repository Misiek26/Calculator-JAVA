package com.company;

import java.util.ArrayList;

public class Action {
    static String text="";
    static double resultOperation;
    static int countEqual = 0;
    static boolean isZero = false;
    static boolean insOperator = true;
    static boolean isPoint = false;

    static ArrayList<String> number = new ArrayList<>();
    static ArrayList<String> operator = new ArrayList<>();
    static String result;

    public static void insert(String x){
        if((x.equals("+") || x.equals("*") || x.equals("/") || x.equals("-") || x.equals("C") || x.equals("x2") || x.equals("=") || x.equals("√") || x.equals("%")) && (!insOperator)) {
            if(countEqual>0){
                number.add(result);
                countEqual = 0;
            }
            else
                number.add(text);

            text="";
            insOperator = true;
            isPoint = false;

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
                    result = text;
                    text = "";
                    number.clear();
                    operator.clear();
                    insOperator = false;
                    countEqual++;
                    break;

                case "√":
                    if(Double.parseDouble(number.get(0))>=0){
                        resultOperation = Math.sqrt(Double.parseDouble(number.get(0)));

                        if(resultOperation%1==0) {
                            long resultOperationLong = Math.round(resultOperation);
                            text = Long.toString(resultOperationLong);
                        }
                        else
                            text = Double.toString(resultOperation);

                        Main.insertToDisplay(text);
                        result = text;
                        text = "";
                        number.clear();
                        operator.clear();
                        insOperator = false;
                        countEqual++;
                    }
                    else{
                        Main.insertToDisplay("--> √(x<0) <-- ");
                    }
                    break;

                case "%":
                    resultOperation = Double.parseDouble(number.get(0)) * 0.01;

                    if(resultOperation%1==0) {
                        long resultOperationLong = Math.round(resultOperation);
                        text = Long.toString(resultOperationLong);
                    }
                    else
                        text = Double.toString(resultOperation);

                    Main.insertToDisplay(text);
                    result = text;
                    text = "";
                    number.clear();
                    operator.clear();
                    insOperator = false;
                    countEqual++;
                    break;

                default:break;
            }
        }
        else {
            if(text.length()!=11 && !x.equals("+") && !x.equals("-") && !x.equals("*") && !x.equals("/") && !x.equals("=") && !x.equals("%") && !x.equals("√") && !x.equals("x2") && !x.equals("C")){
                if(x.equals(".") && !isPoint) {
                    isPoint = true;
                    text += x;
                    insOperator = false;
                }
                else if(x.equals("."));
                else {
                    text += x;
                    insOperator = false;
                }

                if(x.equals(".") && text.equals("."))
                    text = "0.";

                Main.insertToDisplay(text);
            }
        }
    }

    //----- Function used to define operator= ------

    public static void isEguals(){
        resultOperation = Double.parseDouble(number.get(0));
        insOperator = false;
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
        if(!isZero) {
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
