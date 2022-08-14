package com.itproger.oop;

public class Car extends Transport implements ILights {

    private boolean isOn;

    public Car(float speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);
    }

    public Car() {}

    @Override
    public void moveObject(float speed) {}      //Реализация Абстрактного метода от com.itproger.oop.Transport

    public Engine engine = new Engine();        //Работа с Вложенным классом

    @Override
    public void setLight(boolean set) {         //Реализация Интерфейса ILight
        this.isOn = set;
    }

    @Override
    public void blinkLight() {                  //Реализация Интерфейса ILight
        System.out.println("BLINK LIGHT");
    }
}
