import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Задание1
        int[] array = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45};
        Calculate(array);
        //Задание2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        Calculate(list);
    }

    private static void Calculate(int []array) {
        System.out.println("Задание 1.");
        int sum = 0;
        System.out.print("Элементы массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
            sum += array[i];
        }
        System.out.println();
        System.out.println("Сумма элементов: " + sum);
        double avg = (double) sum / array.length;
        System.out.println("Среднее значение: " + avg);
    }

    private static void Calculate(ArrayList<Integer> list) {
        System.out.println("Задание 2.");
        int sum = 0;
        System.out.print("Элементы массива:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("  " + list.get(i));
            sum += list.get(i);
        }
        System.out.println();
        System.out.println("Сумма элементов: " + sum);
        double avg = (double) sum / list.size();
        System.out.println("Среднее значение: " + avg);
    }
}