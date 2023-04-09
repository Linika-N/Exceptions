package Practice_1;

import java.util.Random;

// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class Ex001 {
    
    public static void main(String[] args) {
        int[] array = makeArray();
        printArray(array);
        String result = checkArray(array);
        if (result.length() == 0) 
            System.out.println("В массиве нет нулевых элементов");
        else
            System.out.printf("Индексы элементов массива с нулевыми значениям: %s",result);
    }

    public static int[] makeArray() {
        Random rnd = new Random();
        int[] numArray = new int[rnd.nextInt(5,12)];
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
    public static String checkArray(int[] arr) {
        String checks = "";
        for (int y = 0; y < arr.length; y++){
            if (arr[y] == 0) checks += y +" "; 
        }
        return checks;
    }
}