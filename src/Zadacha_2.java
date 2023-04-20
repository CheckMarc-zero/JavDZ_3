import java.util.*;

public class Zadacha_2 {
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

    }
        public static void remove (Set < Integer > ints) {
            Iterator<Integer> it = ints.iterator();

            while (it.hasNext()) {
                if (it.next() % 2 == 0) {    // удалить четные элементы
                    it.remove();
                }
            }
        }
    }
