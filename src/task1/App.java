package task1;

public class App {
    public static int[] arr = new int[10];

    public static void main(String[] args) {
        /*Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random(),
        который возвращает значение в промежутке [0, 1].*/
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        sort();
        System.out.println(arr[9]);
        System.out.println(arr[0]);
        System.out.println(arr[4]);
    }

    public static void sort(){
        for (int i = arr.length; i >= 0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }

    public static void swap(int index1, int index2){
        int variable = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = variable;
    }
}