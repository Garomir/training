package task2;

public class App {
    public static void main(String[] args) {
        /*Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.*/
        //int[] arr = new int[99];
        for (int i = 2; i < 101; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }
    }
}
