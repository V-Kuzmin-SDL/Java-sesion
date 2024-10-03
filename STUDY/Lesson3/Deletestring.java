package STUDY.Lesson3;

import java.util.LinkedList;
import java.util.Iterator;

public class Deletestring {
    
            //  удаление строк с нечетной длиной
    public static void removeOddLengthStrings(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            String str = iterator.next();
            // Удаляем, если длина строки нечетная
            if (str.length() % 2 != 0) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        // Пример использования
        LinkedList<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.add("GeekBrains");
        strings.add("java");
        strings.add("programming");
        strings.add("code");

        System.out.println("Исходный список: " + strings);
        removeOddLengthStrings(strings);
        System.out.println("Список после удаления нечетных строк: " + strings);
    }
}