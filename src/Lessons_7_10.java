
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Lessons_7_10 {
    public static void main(String[] args) {

//Циклы for (хорош в работе с массивами) / while / do while (задаем условие, выполняем/или нет его)

        for(int i = 0; i <=3; i++) {
            System.out.println("Element for 1: " + i);
        }
        for(float i = 10; i > 0; i -= 2) {
            System.out.println("Element for 2: " + i);
        }
        int i = 1;
        while(i <= 3) {
            System.out.println("Element while 1: " + i);
            i++;
        }
        int i1 = 100;
        while(i1 > 5) {
            System.out.println("Element while 2: " + i1);
            i1 -= 25;
        }
        int i2 = 10;
        do {
            System.out.println("Element do while: " + i2);
            i2 *=2;
        } while(i2 < 200);

/* Операторы в циклах
break - служит для выхода из цикла полностью;
return - выполняет ту же функцию, что и оператор break, но для циклов лучше использовать break;
continue - пропускает лишь одну итерацию и не выходит из цикла.*/
        for(int i3 = 0; i3 <=10; i3++) {
            if(i3 % 3 != 0)
                continue;
            if(i3 >= 9)
                break;
            System.out.println("Element break/continue: " + i3);
        }
/* Массивы данных
Массивы позволяют хранить большой объем информации в одном месте.
Для массивов существует несколько дополнительных методов, что позволяют проводить действия над массивом.
Рассмотрим несколько из них:
length - возвращает количество элементов в массиве. К примеру, создадим массив arr и укажем для него 3 элемента.
При вызове функции будет выдано число 3: arr.length;
Arrays.copyOf - копирует один массив в другой. Пример:
int[] arr = new int[] { 1, 2, 3, 5 };
int[] some_new = Arrays.copyOf(arr, arr.length);
Arrays.sort - сортировка массива. Пример:
int[] numbers = new int[] { 1, 7, 3, 5, 2, 6, 4 };
Arrays.sort(numbers); */

        int[] numArray = new int[5];
        numArray[0] = 45;
        numArray[1] = 4;
        numArray[2] = 5;
        numArray[3] = 451;
        numArray[4] = 15;
        int resArray = numArray[1] + numArray[2];
        System.out.println(resArray);

        float[] numArray2 = new float[] {5.0f, 6.45f, 89.984f};
        System.out.println(numArray2[1]);

        for(int i3 = 0; i3 < numArray2.length; i3++) {
            System.out.println("Massive Element: " + numArray2[i3]);
        }

// Пример
        int[] minInArray = new int[4];
        Scanner scannerArray = new Scanner(System.in);

        for(int i4 = 0; i4 < minInArray.length; i4++) {
            System.out.print("Array value " + i4 + ": ");
            int value = scannerArray.nextInt();
            minInArray[i4] = value;
        }
        int minArray = minInArray[0];
        for(int i4 = 0; i4 < minInArray.length; i4++) {
            if(minInArray[i4] < minArray)
                minArray = minInArray[i4];
        }
        System.out.println("Minimum array value: " + minArray);

/*Многомерные массивы данных (двумерный)
в котором каждый элемент является другим массивом. На практике очень редко используются массивы с более
чем третьим уровнем вложенности. То есть массивы, в которых все элементы являются другими массивами,
и в котором все элементы также другие массивы.
Для создания двумерных массивов необходимо использовать двойные квадратные скобки после типа данных.
Выглядит такой массив как матрица, а записывается следующим образом:
int[][] x = { { 0, 34, 2 }, { 3, 4, 5 } };
Мы видим, что элементы первого массива являются другими массивами. Чтобы выбрать какой-либо объект,
используйте ту же структуру, что и для одномерных массивов, вот только теперь указывайте индекс как первого
массива, так и второго:
x[0][1] = 1; - Вместо 34 теперь будет 1  */

        char[][] MultiArray = new char[2][2];       //Multidimensional array - многомерный массив
        MultiArray[0][0] = 't';
        System.out.println(MultiArray[0][0]);

        byte[][] MultiArray2 = new byte[][] {
                {2, 7},
                {7, 3},
                {2, 0}
        };
        MultiArray2[1][1] = 67;
        System.out.println(MultiArray2[1][1]);

        int[] maxInArray = new int[3];
        Scanner finScan = new Scanner(System.in);

        for(int i5 = 0; i5 < maxInArray.length; i5++) {
            System.out.print("Array value " + i5 + ": ");
            int value = finScan.nextInt();
            maxInArray[i5] = value;
        }
        int maxArray = maxInArray[0];
        for(int i6 = 0; i6 < maxInArray.length; i6++) {
            if(maxInArray[i6] > maxArray)
                maxArray = maxInArray[i6];
        }
        System.out.println("Maximum array value: " + maxArray);

        int[] array = new int[] {-14, 23, 9, -4, 12, -1};
        int maxArray2 = 0;
        for (int i7 = 0; i7 < array.length; i7++) {
            if (array[i7] > maxArray2)
                maxArray2 = array[i7];
        }
        System.out.println("Maximum element: " + maxArray2);

/*Коллекции в Джава представляют собой связку из нескольких классов, что дают возможность для создания
структур данных. ArrayList и LinkedList для создания динамических массивов данных.
При создании коллекции необходимо указать тип данных, имя, а также выделение памяти */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        //System.out.println(numbers.size());
        System.out.println("Array List Element: " + numbers.get(1));
        //numbers.clear();
        for(Integer ArrayListElement : numbers) {
            System.out.println("Array List Elements: " + ArrayListElement);
        }

        LinkedList<Float> numbers2 = new LinkedList<>();
        numbers2.add(5.6f);
        numbers2.add(5.6f);
        numbers2.add(6.15616f);
        for (Float LinkedListElement : numbers2)
            System.out.println("Linked List Elements: " + LinkedListElement);

/*Помимо главного интерфейса Collection есть три других главных формата:
List - коллекция для создания массивов данных, где индексами являются числа (0, 1, 2 и так далее);
Set - то же самое что List, вот только в Set нельзя установить повторяющиеся элементы;
Map - коллекция для создания массивов данных, где индексами являются ключи ("one", "2", "three" и так далее).
Наиболее часто используемые методы:
        add() - добавление элемента в конец массива;
        remove() - удаление элемента из массива по его индексу;
        clear() - очистка всего массива;
        size() - получение размера массива (количество элементов);
        addFirst() - добавление элемента в начало массива;
        addLast() - добавление элемента в конец;
        clone() - выполняет клонирование массива;
        get() - возвращает элемент по индексу;
        getFirst() - возвращает первый элемент в массиве;
        getLast() - возвращает последний элемент в массиве;
        set(index, element) - меняет значение элемента по индексу.
        */

    }
}