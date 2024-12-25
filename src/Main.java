//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50, 60};
        int targetElement = 50;
        int targetElement2 = 250;

        int result = linearSearch(myArray, targetElement);
        int result2 = linearSearch(myArray, targetElement2);


        if (result != -1) {
            System.out.println("Элемент " + targetElement + " найден индекс: " + result);
        } else {
            System.out.println("Элемент " + targetElement + " не найден в массиве:" + "-1");
        }

        if (result2 != -1) {
            System.out.println("Элемент " + targetElement2 + " найден индекс: " + result2);
        } else {
            System.out.println("Элемент " + targetElement2 + " не найден в массиве:" + "-1");
        }
    }
}
