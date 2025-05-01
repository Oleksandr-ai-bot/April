/*
Задача 3. Є масив строк. Необхідно відсортувати по першій літері слів(по алфавіту, ігноруючи регістр)
Ввід: ["banana", "Apple", "cherry", "avocado"]
Вивід: ["Apple", "avocado", "banana", "cherry"]
 */
public class Zadacha3 {
    public static void main(String[] args) {
        String[] arr = {"banana", "Apple", "cherry", "avocado"};
        sortByFirstLetter(arr);

        System.out.print("Результат: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    static void sortByFirstLetter(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                char firstLetter1 = Character.toLowerCase(arr[j].charAt(0));
                char firstLetter2 = Character.toLowerCase(arr[j + 1].charAt(0));

                if (firstLetter1 > firstLetter2) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}