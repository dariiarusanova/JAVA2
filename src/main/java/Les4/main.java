package Les4;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        ArrayList<String> New = new ArrayList<>();
        New.add("mom");
        New.add("dad");
        New.add("grandma");
        New.add("grandpa");
        New.add("sister");
        New.add("brother");
        New.add("uncle");
        New.add("unt");
        New.add("mom");
        New.add("stepsister");

        System.out.println(New);
        System.out.println("*****************");
        /*Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     Посчитать, сколько раз встречается каждое слово.*/
        for (int i = 0; i<10;i++){
            System.out.println(New.get(8) + " НЕ МОГУ НАПИСАТЬ КОД(((");
        }

        System.out.println("*****************");
        /*Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
                В этот телефонный справочник с помощью метода add() можно добавлять записи,
                а с помощью метода get() искать номер телефона по фамилии.
                Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
                тогда при запросе такой фамилии должны выводиться все телефоны.*/
        phoneNumbersMethod.Method();


    }
}






    

