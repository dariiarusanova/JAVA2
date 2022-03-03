package Les3;

import java.util.ArrayList;

public class Box<T extends Fruit>{


    public Box(int i) {

    }

    // Класс Box, в который можно складывать фрукты.
    public void addFruits(T fruit){
        fruits.add(fruit);
    }

    /*Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    Для хранения фруктов внутри коробки можно использовать ArrayList<T>*/
    public ArrayList <T> fruits;
    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    /*Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);*/
    public float getWeight(){
        float result = 0;
        for (T fruit : fruits) {
            result += fruit.weight;
        }
        return result;
    }

    /*Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
    которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;*/
      public void compare(Box<?> another) {
          float thisBoxWeight = getWeight();
          float anotherBoxWeight = another.getWeight();

          if (thisBoxWeight > anotherBoxWeight) {
              System.out.println("Эта коробка тяжелее другой");
          } else if (thisBoxWeight < anotherBoxWeight) {
              System.out.println("Эта коробка легче другой");
          } else {
              System.out.println("Коробки одинаковые");
          }
      }

    /*Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    Не забываем про метод добавления фрукта в коробку.*/

    public void ChangeFruits(Box<T> other) {
        other.fruits.addAll(fruits);
        fruits.clear();
    }

}
