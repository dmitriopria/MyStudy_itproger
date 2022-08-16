package com.itproger.studying;

import java.util.Scanner;

public class Lessons_1_6 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("\t\'Hello\'\\\n\t\"World!\"");

/*При создании первого Java файла вы можете заметить большой набор кода, который изначально
покажется совершенно неизвестным и пугающим. В таком файле находятся подключенные библиотеки,
основной класс и основная функция main().
Поскольку Java является объектно ориентированным языком программирования, то все файлы представляют
собой классы. Для обращения к классам необходимо создавать объекты и через объекты можно получать
данные из класса.
Вывод фразы «Hello World!» представлен:
System.out.print("Hello World!");
Здесь сперва происходит обращение к классу System, после чего берем его объекты и методы.
Поскольку в System создан объект out, а у него есть метод print и println, то мы можем обратиться
к ним через точку.*/

        int outsideTemp = 22;
        System.out.println("Outside temperature is: " + outsideTemp + ".");
        outsideTemp = -10;
        System.out.println("Outside temperature is: " + outsideTemp + ".");

/*Целые числа
byte - предназначен для хранения целых чисел. Диапазон чисел от -128 до 127 - 1 байт
short - предназначен для хранения целых чисел. Диапазон чисел от -32768 до 32767 - 2 байт
int - предназначен для хранения целых чисел. Диапазон чисел от -2147483648 до 2147483647 - 4 байт
long - Диапазон чисел от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 - 8 байт

Разница между типами заключается только в диапазоне чисел, который можно записать в переменную.
Также не используйте большие типы данных по типу long, если число маленькое, так как чем больше
диапазон, тем больше памяти требуется компьютеру на конкретную переменную.*/

        byte a = 126, b = 127;
        short num1 = 128;
        int num2 = 56;
        long num3 = 4567;

/*Числа с точкой
float - для создания чисел с плавающей точкой. Диапазон чисел от от -3.4*10^38 до 3.4*10^38;
double - для создания чисел с плавающей точкой. Диапазон чисел от от ±4.9*10^-324 до ±1.8*10^308;*/

        float num4 = 4.4321f;
        double num5 = 8.87654321;

/*Символ
char - тип данных для работы с символами. Позволяет поместить в одинарных кавычках какой-либо символ;
String - тип данных для текста. В двойных кавычках можно сохранить одно или множество слов.*/

        char ch = '%';
        String myName = "Dmytro Opria";
        System.out.println("My name is: " + myName);

/*TRUE or FALSE
bool - логический тип данных. Предназначен для записи истинного (true) или ложного (false) значения;*/

        boolean isHappy = false;
        System.out.println(isHappy);
        System.out.println(!isHappy);

/*Получение данных от пользователя
Scanner some_name = new Scanner(System.in); Создаем объект с именем some_name
На этом этапе мы еще не просим пользователя ввести что-либо с клавиатуры.
Мы просто создаем объект при помощи которого сможем просить пользователя ввести какое-то значение.
Чтобы получить данные от пользователя мы используем метод класса:
int val = some_name.nextInt();
Если мы хотим получить не число, а строку или число с плавающей точкой, то необходимо использовать
другие методы:
nextLine () - для ввода строки. Возвращаемый тип данных String;
nextInt () - для ввода целых чисел. Возвращаемый тип данных int;
nextFloat () - для ввода чисел с плавающей точкой. Возвращаемый тип данных float;
nextDouble () - для ввода больших чисел с плавающей точкой. Возвращаемый тип double.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: \n");            //print with \n
        String userName = scan.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("Enter your age:");              //println without \n - is better
        int userAge = scan.nextInt();
        System.out.println(userName + " is " + userAge + " years old.");

// Математические значения

        short x = 50, y = 33;
        int summ = x + y;
        System.out.println("x + y = " + summ);

        float z = 50, c = 33;
        float div = z / c;
        System.out.println("z / c = " + div);

        float divReminder = z % c;                     //Reminder of the division (остаток от деления)
        System.out.println("z % c = " + divReminder);

        summ = summ + 10;
        summ++;
        System.out.println(summ);

        div -= 10;
        div--;
        System.out.println(div);

// Простой калькулятор - Simple calculator

        System.out.print("Enter 1 number: ");
        float n1 = scan.nextFloat();

        System.out.print("Enter 2 number: ");
        float n2 = scan.nextFloat();

        float res1 = n1 + n2;
        float res2 = n1 - n2;
        float res3 = n1 * n2;
        float res4 = n1 / n2;

        System.out.println("Results: ");
        System.out.println("+: " + res1 + "\n" + "-: " + res2 + "\n" + "*: " + res3 + "\n" + "/: " + res4);

// Условные конструкции if, else

        int o = 15, p = 15;
        char sim1 = 'A', sim2 = 'a';
        boolean isHasCar = true;
        if (o != p) ;
        if (sim1 == sim2) ;
        if (isHasCar == true) {
            System.out.println("Mazda 3");
        }
        if (!isHasCar) {
            System.out.println("BMW");
        } else if (o != p) {
            System.out.println("15!=15");
        } else if (o == p) {
            System.out.println("15=15");
        } else {
            System.out.println("Mazda 3");
        }
// ИЛИ ИЛИ
        if (isHasCar || o == p) ;
// И то И то
        if (!isHasCar && o != p || sim1 == sim2) ;

        Scanner scanForIf = new Scanner(System.in);
        System.out.print("Login: ");
        String log = scanForIf.nextLine();
        System.out.print("Password: ");
        String pass = scanForIf.nextLine();
        if (log.equals("Dima") && pass.equals("1111"))
            System.out.println("Hello");
        else System.out.println("Error");

//Условные конструкции switch-case

        Scanner scanForSwitch = new Scanner(System.in);
        System.out.println("Number for switch case: ");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number 1");
                break;
            case 2:
                System.out.println("Number 2");
                break;
            default:
                System.out.println("Default");
        }

//Калькулятор / Calculator

        Scanner scanForCalc = new Scanner(System.in);
        System.out.print("Calculator number 1: ");
        int number1 = scan.nextInt();

        System.out.print("Calculator number 2: ");
        int number2 = scan.nextInt();

        int res;

        System.out.print("Chose action (+, -, *, /): ");
        String action = scan.next();

        switch (action) {
            case "+":
                res = number1 + number2;
                System.out.println("Result: " + res);
                break;
            case "-":
                res = number1 - number2;
                System.out.println("Result: " + res);
                break;
            case "*":
                res = number1 * number2;
                System.out.println("Result: " + res);
                break;
            case "/":
                if (number2 == 0)
                    System.out.println("Error");
                else {
                    res = number1 / number2;
                    System.out.println("Result: " + res);
                }
                break;
            default:
                System.out.println("Error");
        }
/*Тернарная операция - Это сокращенная форма if else. Записывается следующим образом:
Мы проверяем, если "w" будет меньше чем "e", то мы в переменную result устанавливаем их сумму,
а иначе - их разницу.*/

        int w = 3, e = 12;
        int result = w < e ? (w + e) : (w - e);
        System.out.println(result);

    }
}
