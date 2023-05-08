package Practice_3;


// 1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо
// бросить исключение MyArraySizeException.
// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива
// преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException –
// с детализацией, в какой именно ячейке лежат неверные данные.
// 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат
// расчета (сумму элементов, при условии что подали на вход корректный массив).

public class Main {

    public static void main(String[] args) {

        String[][] array = new String[][]{{"4", "9", "3", "6"}, {"5", "7", "1", "4"}, {"3", "4", "5", "6"}, {"8", "7", "9", "0"}};
        try {
            try {
                int answer = parseAndSum(array);
                System.out.println(answer);
            } catch (MyArraySizeException e) {
                System.out.println("Массив неправильного размера!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Не удалось преобразовать элемент массива в ячейке: "+ e.a + "x" + e.b);
        }

    }


    public static int parseAndSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
