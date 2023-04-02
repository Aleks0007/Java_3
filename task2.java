// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.*;

class RemoveEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(11));
        }
        System.out.println("Исходный список: " + numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Список без чётных чисел: " + numbers);
    }
}