/*
Задача 1. Дано масив невідсортованих цілих чисел.
В масиві замінити максимальні значення мінімальними.
Приклад. масив: 1, 5, 3, 56, 56, 34, 56
після заміни: 1, 5, 3, 1, 1, 34, 1
тобто відбулись заміни значень 56 на 1
 */
public class Zadacha1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 56, 56, 34, 56};
        replaceMaxWithMin(arr);

        System.out.print("Результат: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    static void replaceMaxWithMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = min;
            }
        }
    }
}