import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* попробовать вариант с умножением веса фрукта на fruits.size


 */

public class Box<F extends Fruit> {

    private float weight;
    ArrayList<F> fruits;



    public Box() {
        this.fruits=new ArrayList<>();
    }

    // выводим вес
    public float getWeight() {
        return weight;
    }

    //добавляем фрукты к колекции
    public void add(F fruit) {
        fruits.add(fruit);

        //запоминаем вес для box
        weight+=fruit.getWeight();
    }

    //сравниваем текущий и указанный бокс
    public boolean compare(Box box) {
        if(this.weight==box.getWeight()){
            return true;
        } else {
            return false;
        }
    }

    //перекидываем фрукты и очищаем коробку
    public void boxToBox(Box<? super F> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    //вывод всей коллекции
    public void outputBox() {
        System.out.println(fruits);
    }

}


