import java.util.*;

public class Main {

    public static void main(String[] args) {


       outputForTasks();
        System.out.println();
        System.out.println("Третье задание: ");
       thirdTask();

    }

    //метод для вывода результатов 3-го задания. сделан, чтобы удобно комментить и не потеряться в main
    private static void thirdTask() {
        Box<Apple> appleFirstBox = new Box();
        Box<Orange> orangeFirstBox = new Box();
        Box<Apple> appleSecondBox = new Box();
        Box<Orange> orangeSecondBox = new Box();

        //заполнение на true
        appleFirstBox.add(new Apple());
        appleFirstBox.add(new Apple());
        appleFirstBox.add(new Apple());

        orangeFirstBox.add(new Orange());
        orangeFirstBox.add(new Orange());

        //заполнение на false
        appleSecondBox.add(new Apple());
        appleSecondBox.add(new Apple());
        appleSecondBox.add(new Apple());
        appleSecondBox.add(new Apple());
        appleSecondBox.add(new Apple());

        orangeSecondBox.add(new Orange());
        orangeSecondBox.add(new Orange());
        orangeSecondBox.add(new Orange());
        orangeSecondBox.add(new Orange());
        orangeSecondBox.add(new Orange());
        orangeSecondBox.add(new Orange());
        orangeSecondBox.add(new Orange());
        orangeSecondBox.add(new Orange());






        //вывод содержимого
        appleFirstBox.outputBox();
        orangeFirstBox.outputBox();

        System.out.println();
        //выводим размеры боксов
        System.out.println(appleFirstBox.getWeight());
        System.out.println(orangeFirstBox.getWeight());

        //сравниваем на true
        System.out.println(appleFirstBox.compare(orangeFirstBox));

        //сравнение на false
        System.out.println(appleSecondBox.compare(orangeSecondBox));

        //перекидываем яблоки из первой коробки во вторуб и выводим.
        appleFirstBox.boxToBox(appleSecondBox);
        orangeFirstBox.boxToBox(orangeSecondBox);
        appleSecondBox.outputBox();
        appleFirstBox.outputBox();
    }

    //метод для вывода результатов 1 и 2 задания. сделан, чтобы удобно комментить и не потеряться в main
    private static void outputForTasks() {
        //массивы для заданий
        Integer[] arrInt = {1,2,3,4,5};
        String[] arrStr = {"One","Two","Three","Four","Five"};

        //первое задание.
        System.out.print("Числа: \n");
        arrayOperations.swapElements(arrInt);
        System.out.println();
        System.out.print("Строки: \n");
        arrayOperations.swapElements(arrStr);
        System.out.println();

        //второе задание.
        System.out.println("Коллекция из массива с числами: ");
        System.out.println(arrayOperations.arrToList(arrInt));
        System.out.println();
        System.out.println("Коллекция из массива с строками: ");
        System.out.println(arrayOperations.arrToList(arrStr));
    }

    //класс для удобства, может он и лишний ¯\_(ツ)_/¯
    static class  arrayOperations {

        //метод, который меняет местами элементы массива
        public static <E> void swapElements(E[] elements) {

            int firstElement = 0;
            int secondElement = 0;
            E temp;

            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Введите элемент, который нужно заменить: -->");
                firstElement = sc.nextInt();
                if (firstElement >= elements.length || firstElement<0) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.println();

                System.out.print("Введите элемент на замену: -->");
                secondElement = sc.nextInt();
                if(secondElement >=elements.length || secondElement<0) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.println();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Такого элемента не существует");
            }

                temp = elements[firstElement];
                elements[firstElement] = elements[secondElement];
                elements[secondElement] = temp;


            //выводим массив
            for (E element : elements) {
                System.out.println(element);
            }
        }

        //метод, который заполняет коллекцию значениями из массива с помощью addAll и выдает обратно List
        public static  <T> List arrToList(T[] array) {
            List<T> list = new ArrayList<T>();

            Collections.addAll(list,array);

            return list;


        }
    }
}
