package Study.JavaCore.Seminars.Seminar_02.task_03;

public class Main {

    /*
    Написать метод, в который передается не пустой одномерный
    целочисленный массив, метод должен вернуть true если в массиве есть
    место, в котором сумма левой и правой части массива равны. Примеры:
    checkBalance([1, 1, 1, || 2, 1]) → true,
    checkBalance([2, 1, 1, 2, 1]) → false,
    checkBalance([10, || 1, 2, 3, 4]) → true.
    Абстрактная граница показана символами ||, эти символы в массив не
    входят.
     */

    public static void main(String[] args) {
        int[] arr = new int[] {10, 1, 2, 3, 4};
        System.out.println(checkArray(arr));
    }

    public static boolean checkArray(int[] arr) {
        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sumLeft += arr[i];
            sumRight = 0;

            for (int j = i + 1 ; j < arr.length; j++) {
                sumRight += arr[j];
            }

            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    /*
    В этом решении мы используем два вложенных цикла. Внешний цикл проходит по элементам массива от начала до
    предпоследнего элемента и на каждой итерации вычисляет сумму левой части (от начала массива до текущего элемента).
    Затем внутренний цикл начинается с элемента, следующего за текущим внешнего цикла, и вычисляет сумму правой части
    (от текущего элемента до конца массива). Если левая и правая суммы равны, возвращается true.
    Если после всех итераций нет места, где суммы равны, возвращается false.
     */

}
