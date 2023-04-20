import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadacha_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int size = input.nextInt();
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt());
        }
        System.out.println(numbers);
        int min = numbers.get(0);
        int max = numbers.get(0);
        int sr = 0;

        for (Integer i: numbers) {
            sr = sr+i;
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }

        sr = sr/numbers.size();

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("среднее число: " + sr);
    }
}
