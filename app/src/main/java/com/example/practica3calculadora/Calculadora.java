package com.example.practica3calculadora;

public class Calculadora {
    public String calculate(String cadena) {
        int posMas;
        String num1, num2;
        try {
            if (cadena.contains("+")) {
                posMas = cadena.lastIndexOf("+");
                num1 = cadena.substring(0, posMas);
                num2 = cadena.substring(posMas + 1);
                return String.valueOf(Integer.parseInt(calculate(num1)) + Integer.parseInt(calculate(num2)));
            } else if (cadena.contains("*")) {
                posMas = cadena.indexOf("*");
                num1 = cadena.substring(0, posMas);
                num2 = cadena.substring(posMas + 1);
                return String.valueOf(Integer.parseInt(calculate(num1)) * Integer.parseInt(calculate(num2)));
            } else if (cadena.contains("-")) {
                posMas = cadena.lastIndexOf("-");
                num1 = cadena.substring(0, posMas);
                num2 = cadena.substring(posMas + 1);
                if (num1.length() > 2 && num1.charAt(2) == '-') {
                    return String.valueOf(Integer.parseInt(calculate(num1)) + Integer.parseInt(calculate(num2)));
                } else {
                    if (Integer.parseInt(calculate(num1)) < Integer.parseInt(calculate(num2))) {
                        return "-" + String.valueOf(Integer.parseInt(calculate(num2)) - Integer.parseInt(calculate(num1)));
                    } else {
                        return String.valueOf(Integer.parseInt(calculate(num1)) - Integer.parseInt(calculate(num2)));
                    }
                }
            } else {
                if (cadena.isEmpty()) {
                    return "0";
                } else {
                    return cadena;
                }
            }
        } catch (Exception e) {
            return "Syntax Error";
        }
    }
}
