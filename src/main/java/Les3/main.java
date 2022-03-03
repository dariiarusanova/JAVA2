package Les3;
/*1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        2. Задача:
       Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;*/

import java.util.ArrayList;
import java.util.Arrays;

    public class main {
        public static void main(String[] args) {
            System.out.println("********************************");
            String[] arr = {"коробка 1", "коробка 2"};
            changeArrayElements(arr, 0, 1);
            System.out.println("Я метод, меняющий коробки 1 и 2 местами, и получается " + Arrays.toString(arr));
            System.out.println("********************************");
            System.out.println("А я буду сравнивать коробки с яблоками и фруктами, смотри, что получилось:");

            Box<Apple> appleBox = new Box<>(makeNewApples(20));
            Box<Orange> orangeBox = new Box<>(makeNewOranges(50));
            Box<Orange> anotherBox = new Box<>(makeNewOranges(1));

            appleBox.compare(orangeBox);
            orangeBox.ChangeFruits(anotherBox);
            appleBox.compare(anotherBox);
            orangeBox.ChangeFruits(anotherBox);
            appleBox.compare(orangeBox);
            appleBox.compare(anotherBox);
        }

        public static ArrayList<Apple> makeNewApples(int count) {
            ArrayList<Apple> fruits = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                fruits.add(new Apple(40));
            }
            return fruits;
        }

        public static ArrayList<Orange> makeNewOranges(int count) {
            ArrayList<Orange> fruits = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                fruits.add(new Orange(50));
            }
            return fruits;
        }

        /*
        1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
         */
        public static <T>void changeArrayElements(T[] array, int firstIndex, int secondIndex) {
            if (firstIndex < 0 || array.length <= firstIndex || secondIndex < 0 || array.length <= secondIndex || array.length < 2) {
                System.out.println("Некорректные индексы");
                return;
            }

            // Если if-а не будет
            try {
                T arrayElement = array[firstIndex];
                array[firstIndex] = array[secondIndex];
                array[secondIndex] = arrayElement;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Некорректные индексы");
            }
        }
    }
