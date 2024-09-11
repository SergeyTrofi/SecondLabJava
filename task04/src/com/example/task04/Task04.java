package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float firstNum = (float)a;
        float secondNum = (float)b;

        switch (operation){
            case "+":
                return (firstNum + secondNum);
            case "-":
                return (firstNum - secondNum);
            case "*":
                return (firstNum * secondNum);
            case "/":
                return (firstNum / secondNum);
            default:
                return Float.NaN;
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
