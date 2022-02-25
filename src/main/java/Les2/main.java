package Les2;


import static Les2.Methods.Method_Kvardrat;
//3. В методе main() вызвать полученный метод,
//        обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.

public class main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        try {
            int result = Method_Kvardrat(4);
            System.out.println(result);
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива превышен!");
        }
        catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке");
        }
        System.out.println();

    }

}