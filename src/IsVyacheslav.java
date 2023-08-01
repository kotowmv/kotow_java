import java.util.Scanner;

public class IsVyacheslav {
    //Задание 2: составить алгоритм - если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
    // если нет, то вывести "Нет такого имени"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        String expected = "Вячеслав";
        if (name.equals(expected)) {
            System.out.println("Привет, " + expected);
        } else {
            System.out.println("Нет такого имени!");
        }
    }
}
