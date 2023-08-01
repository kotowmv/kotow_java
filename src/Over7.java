import java.util.Scanner;

public class Over7 {
    //Задание 1: составить алгоритм - если введенное число больше 7, то вывести “Привет”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет!");
        }
    }
}
