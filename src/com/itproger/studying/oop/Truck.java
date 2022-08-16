package com.itproger.studying.oop;

public class Truck extends Transport {

    private boolean isLoaded;

    public Truck() {}

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String getLoaded() {
        if(isLoaded)
            return "com.itproger.oop.Truck is loaded";
        else
            return "com.itproger.oop.Truck isn't loaded";
    }

    public Truck(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }
//Наследование:
    // Наследование является одним из ключевых понятий ООП. За счёт наследования можно создать один общий класс
    // (класс родитель) и создать множество других классов (классы наследники), что будут наследовать все поля,
    // методы и конструкторы из главного класса.
    // Для создания наследования мы прописали ключевое слово extends после имени класса, и указали какой класс
    // будет родительским. Если необходимо из класса наследника получить данные из родительского класса, то
    // всегда можно обращаться к значению super.

//Полиморфизм:
    // Полиморфизм является одним из ключевых понятий в ООП. При помощи полиморфизма мы можем выполнить переопределение
    // родительского метода в классах наследниках.
    // Благодаря полиморфизму мы можем переопределять методы родительского класса в классах наследниках.

    public Truck(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    @Override
    public void moveObject(float speed) {}      //Реализация Абстрактного метода от com.itproger.oop.Transport

    public Engine engine = new Engine();        //Работа с Вложенным классом

}
