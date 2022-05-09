import java.util.Arrays;

public class Main {
    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        int[] arr = new int[30];
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
     }

    public static void main(String[] args) {
        //Задание 1

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц " + sum + " рублей");

        //Задание 2

        int max = 0;
        int min = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ){
                max = arr[i];
            }
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        //Задание 3

        double average = sum / 30d;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}



