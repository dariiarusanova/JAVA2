package Les2;
public class Methods {


 /*1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
        Если в каком-то элементе массива преобразование не удалось
        (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException –
        с детализацией, в какой именно ячейке лежат неверные данные.*/

    public static int Method_Kvardrat(int arr) throws MyArraySizeException, MyArrayDataException {
        int[][] Kvadrat;
        int[] sum;

        Kvadrat = new int[4][4];

        Kvadrat[0][0] = 1;
        Kvadrat[0][1] = 2;
        Kvadrat[0][2] = 3;
        Kvadrat[0][3] = 4;
        Kvadrat[1][0] = 1;
        Kvadrat[1][1] = 2;
        Kvadrat[1][2] = 3;
        Kvadrat[1][3] = 4;
        Kvadrat[2][0] = 1;
        Kvadrat[2][1] = 2;
        Kvadrat[2][2] = 3;
        Kvadrat[2][3] = 4;
        Kvadrat[3][0] = 1;
        Kvadrat[3][1] = 2;
        Kvadrat[3][2] = 3;
        Kvadrat[3][3] = 4;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Kvadrat[i][j] + "\t");
            }

            System.out.println();
        }

        int x = Kvadrat.length;
        int summ = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                summ += Kvadrat[i][j];
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: ");
        return summ;

    }
}

