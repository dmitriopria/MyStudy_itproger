package com.itproger.studying;

public class Lesson_10_End {
    public static void main(String[] args) {

// Возведение в степень и округление числа
        double num = 1.4234f;
        // Возведение в степень 3
        num = Math.pow(num, 3);
        // Округление числа к большему; Целое число можно записать внутри типа данных int
        int result = (int) Math.ceil(num);
        System.out.println(result);


// 2 варианта создания одномерного массива данных (первый более верный)
        char[] symbols = new char[]{'J', 'a', 'v', 'a', '!'};
        // Выводим 3 элемент; По индексу он 2
        System.out.println("Element 3: " + symbols[2]);

        char[] symbol = new char[5];
        symbol[0] = 'J';
        symbol[1] = 'a';
        symbol[2] = 'v';
        symbol[3] = 'a';
        symbol[4] = '!';
        System.out.println("Element 3: " + symbol[2]);

// Функции / Методы

        info("Hello");
        String java = "Java";
        info(java);
        info("");

//        short number1 = 7;
//        summa((short) 5, number1);
//        short number2= 8;
//        summa((short) 4, number2);

        short number1 = 7;
        int result1 = summa((short) 5, number1);
        short number2 = 8;
        int result2 = summa((short) 4, number2);
        info(String.valueOf(result2));

//Практический пример
        byte[] number3 = new byte[]{5, 6, 8};
        int summ1 = summaArray(number3);
        System.out.println("Summ 1: " + summ1);

        byte[] number4 = new byte[]{5, 7, 3, 7, 6, 8};
        int summ2 = summaArray(number4);
        System.out.println("Summ 2: " + summ2);
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }

//        public static void summa(short a, short b) {
//        int res = a + b;
//        System.out.println("Result: " + res);
//    }
//        public static void summa(short a, short b) {
//        int res = a + b;
//        String result = "Result: " + res;
//        info(result);
//    }
    public static int summa(short a, short b) {
        int resPlus = a + b;
        String result = "Result: " + resPlus;
        info(result);
        return resPlus;
    }

    public static int summaArray(byte[] array) {
        int summArray = 0;
        for (byte i = 0; i < array.length; i++)
            summArray += array[i];
        return summArray;
    }
}
    /* Функции что записаны вне классов называют функциями, а функции что записаны внутри классов называются методами.
    Поскольку Java это объектно ориентированный язык, то лучше говорить методы, хотя это не имеет никакого значения.
    В классах переменные называются полями, а вне классов - переменными.
    Для создания функций необходимо указать возвращаемый тип данных, указать название и параметры.
    В случае когда функция ничего не возвращает, то указывается тип данных void.
    Поскольку мы хотим обращаться к функциям напрямую без создания объекта, то мы прописываем ключевое слово static.
    Оно говорит компилятору, что функция принадлежит всему классу, а не конкретным объектам.

    ООП простыми словами (объектно-ориентированного программирования)
    4 концепции ООП: полиморфизм, абстракция, инкапсуляция и наследование
    полиморфизм - переопределение данных
    абстракция - описание лишь скелета объекта без реализации
    инкапсуляция - защита данных от внешнего доступа к ним
    наследование - возможность наследовать данные из классов-родителей

    описать робота:
    класс - это как чертеж робота
    объект - это как сам робот со значениями и данными, который создан по чертежу (классу)
    наследование - добавление полезных опций к чертежу робота
    полиморфизм - общий функционал для всех роботов
    инкапсуляция - броня, защищающая робота (защита внутренних данных самого класса)
    поле == переменная
    в классах - поле
    вне классов - переменная

    ООП нужно для описания всего функционала объекта в одном месте */