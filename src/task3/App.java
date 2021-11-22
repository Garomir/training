package task3;

public class App {
    public static int[] arr = new int[30];
    public static int testInt = 5;

    public static void main(String[] args) {
        //Дан массив целых чисел и ещё одно целое число.
        //Удалите все вхождения этого числа из массива (пропусков быть не должно).
        init();
        displayArr();
        removeTestInt();
        displayArr();
    }

    public static void init(){
        for (int i = 0; i < 30; i++) {
            arr[i] = (int) (Math.random() * 8)+1;
        }
    }

    public static void removeTestInt(){
        for (int i = 0; i < 30; i++) {
            if (arr[i] == testInt){
                for (int j = i+1; j < arr.length-1; j++) {
                    arr[j-1] = arr[j];
                    arr[j] = 0;
                }
            }
        }
    }

    public static void displayArr(){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
