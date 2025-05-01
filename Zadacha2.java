/*
Задача 2. Відсортувати в масиві цілих чисел тільки парні елементи за зростанням. 
Непарні елементи залишаємо на своїх місцях.
 */
public class Zadacha2 {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 4, 3, 6, 7};
        sortEvenNumbers(arr);

        System.out.print("Результат: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    static void sortEvenNumbers(int[] arr) {
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven = countEven + 1;
            }
        }

        int[] evenArr = new int[countEven];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[index] = arr[i];
                index = index + 1;
            }
        }

        for (int i = 0; i < evenArr.length - 1; i++) {
            for (int j = 0; j < evenArr.length - i - 1; j++) {
                if (evenArr[j] > evenArr[j + 1]) {
                    int temp = evenArr[j];
                    evenArr[j] = evenArr[j + 1];
                    evenArr[j + 1] = temp;
                }
            }
        }

        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evenArr[index];
                index = index + 1;
            }
        }
    }
}