package Practice_1;

import java.util.Random;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Ex002 {
    public static void main(String[] args) {
        int[] array1 = makeArray();
        printArray(array1);
        int[] array2 = makeArray();
        printArray(array2);
        int[] result = arraysSum(array1,array2);
        printArray(result);
    }

    public static int[] makeArray() {
        Random rnd = new Random();
        int[] numArray = new int[rnd.nextInt(5,7)];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = rnd.nextInt(0,5);
        }
        return numArray;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1){
                System.out.print(arr[i] + "\t");
            }
            else{
                System.out.println(arr[i]+"]");
            }
        }
    }
    public static int[] arraysSum(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            throw new RuntimeException("Размеры массивов неравны!");
        int[] sumOfArrays = new int[arr1.length];
        for (int y = 0; y < arr1.length; y++){
            sumOfArrays[y] = arr1[y] + arr2[y]; 
        }
        return sumOfArrays;
    }

}
