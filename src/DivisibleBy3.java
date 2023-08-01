public class DivisibleBy3 {
    public static void main(String[] args) {
        //Задание 3: составить алгоритм - на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printDivisibleBy3(testArray);
    }

    public static void printDivisibleBy3 (int[] array) {
        System.out.println("Числа кратные 3: ");
        for (int num : array) {
            if (num != 0 && num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
