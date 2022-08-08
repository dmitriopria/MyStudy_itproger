package com.itproger;

import com.itproger.db.DB;

public class Main {
    public static void main(String[] args) {

//ООП - Создание классов и объектов

        Transport bmw = new Car();
        bmw.setValues(250.5f, 2500, "White", new byte[]{0, 0, 0});
        String bmwRes = bmw.getValues();
        System.out.println(bmwRes);

//        bmw.speed = 250.5f;
//        bmw.weight = 2500;
//        bmw.color = "White";
//        bmw.coordinate = new byte[] {0, 0, 0};

        Truck truck1 = new Truck(false);
        truck1.speed = 140.5f;
        truck1.weight = 5600;
        truck1.color = "Red";
        truck1.coordinate = new byte[]{100, 0, 100};
        String truckRes = truck1.getValues();
        System.out.println(truckRes);

        truck1.setLoaded(true);
        truck1.getLoaded();

        System.out.println("com.itproger.Truck speed: " + truck1.speed + ", BMW speed: " + bmw.speed);

        Truck truck2 = new Truck(150.5f, 4500, "White", new byte[]{0, 0, 100}, true);
        System.out.println(truck2.getValues());

        Car bike = new Car(60.0f, 500, "White", new byte[]{0, 100, 0});
        bike.engine.setValues(true, 10);
        bike.engine.info();           //Вложенность

//Анонимный класс:
//Анонимные классы позволяют описать новый функционал для создаваемого объекта.
//Анонимные классы - это классы, что не имеют имени и их создание происходит в момент инициализации объекта.

        Car flyCar = new Car(600.0f, 200, "White", new byte[]{0, 100, 0}) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);
                this.engine.isReady(true);
                System.out.println("com.itproger.Car is flying");
            }
        };
        flyCar.moveObject(450);

        Car Mazda = new Car();
        Mazda.setLight(true);
        Mazda.blinkLight();

// Благодаря "static" мы можем создать переменную или метод, что будет принадлежать к классу в целом. Это означает,
// что можно обратиться к статическому методу или статическому полю напрямую через класс без создания объекта.

        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person obj4 = new Person();

        Person.getCount();
//Это с использованием static - через этот метод вывели его номер
//(метод в классе com.itproger.Person обратились к классу)

        obj2.getCount();
//Создали объекты и через этот метод вывели его номер (метод в классе com.itproger.Person)
//это без использования static (обратились напрямую к объекту)
        Person.count = 5;
//Обратились к методу в классе и присвоили ему значение
        System.out.println(Person.count + " Persons");

// Пакеты
// Пакетная область - это небольшая строчка кода вверху программы, что говорит компилятору в какой области
// храниться данный файл. Все файлы из одной области можно спокойно использовать без явного импорта.

// Область видимости - это область, в которой будет видна переменная. Если переменная создана внутри класса,
// то она видна повсюду в пределах классах. Если переменную создать внутри метода, то она видно исключительно
// внутри метода, где она была создана.

        DB db = new DB();   // Выделили память под новый пакет (класс)

// Перегрузка методов
//За счёт перегрузки методов мы можем создать множество методов, что будут принимать разное количество
//параметров или разный тип данных и при этом будут иметь одно и то же имя.

        info();                                  // I метод

        info("Back Off");                   // II метод

        info("Back Off", 2.4f);     // III метод
    }

    public static void info() {                                     // I
        System.out.println("test 1");
    }

    public static void info(String word) {                          // II
        System.out.println("test 2");
    }

// Использование final
    public static final void info(String word, float number) {      // III
        System.out.println("test 3");
// Тут мы добавили final к методу, это означает, что
// его теперь нельзя переопределить (использовать в других
// классах @Override)
    }

//  Если присвоить "final" к классу, то он не сможет иметь наследников

    final int count = 10;        //  Модификатор доступа final - создает константу
}