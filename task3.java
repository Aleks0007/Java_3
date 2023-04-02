// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.*;

class ListMinMaxAvg {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));
        int min = Collections.min(list);
        int max = Collections.max(list);
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Заданный список: " + list);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + avg);
    }
}