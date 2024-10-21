
package Laptop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();

        // Добавление нескольких ноутбуков 
        store.addLaptop(new Laptop("Windows", 8, 512, "Black"));
        store.addLaptop(new Laptop("Linux", 16, 256, "Silver"));
        store.addLaptop(new Laptop("Windows", 4, 1024, "White"));
        store.addLaptop(new Laptop("macOS", 16, 512, "Space Gray"));
        store.addLaptop(new Laptop("Windows", 8, 1024, "Blue"));

        // Запрос фильтрации
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> criteria = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ (RAM)");
        System.out.println("2 - Объем ЖД (HDD)");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        boolean addingCriteria = true;
        while (addingCriteria) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите минимальное значение ОЗУ (в ГБ): ");
                    int ramMin = scanner.nextInt();
                    criteria.put("ram", ramMin);
                    break;
                case 2:
                    System.out.print("Введите минимальное значение объема жесткого диска (в ГБ): ");
                    int hddMin = scanner.nextInt();
                    criteria.put("hdd", hddMin);
                    break;
                case 3:
                    System.out.print("Введите операционную систему: ");
                    String os = scanner.next();
                    criteria.put("os", os);
                    break;
                case 4:
                    System.out.print("Введите цвет: ");
                    String color = scanner.next();
                    criteria.put("color", color);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    continue;
            }

            System.out.print("Хотите добавить еще один критерий? (да/нет): ");
            String response = scanner.next();
            addingCriteria = response.equalsIgnoreCase("да");
        }

        
        Set<Laptop> filteredLaptops = store.filterLaptops(criteria);
        System.out.println("Ноутбуки, соответствующие фильтрации:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }

        scanner.close(); 
    }
}