import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Проверка, открыты ли магазины
        boolean isEdekaOpen = true; // Замените на false, если магазин закрыт
        boolean isReweOpen = false; // Замените на true, если магазин открыт

        boolean canBuy = isEdekaOpen || isReweOpen; // Используем || для проверки, открыт ли хотя бы один магазин
        System.out.println("Я могу купить еду, это " + canBuy);

        // Задача 2: Проверка, является ли год високосным
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " isLeap: " + isLeap);

        // Задача 3: Нахождение максимума из трех чисел
        System.out.print("Введите три целых числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = num1; // Предполагаем, что первое число максимальное
        if (num2 > max) {
            max = num2; // Если второе число больше, обновляем max
        }
        if (num3 > max) {
            max = num3; // Если третье число больше, обновляем max
        }

        System.out.println("Максимум из трех чисел: " + max);

        // Закрываем сканер
        scanner.close();
    }
}