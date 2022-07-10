package com.company;


public class Main {

    public static int brokenDevice(int x, int y) {
        // – Почти дописал эту функцию. Пока непонятно как это работает, надо не забыть переписать.

        // – Черт, что я тут написать то хотел, говорил мне ПМ: пиши документацию. Напишу завтра после рейса в Нарнию

        // – Не стоит трогать эту магию: один раз долетел, значит и всегда долетит
        System.out.println("begin = " + x + " end = " + y);
        int i = 0;
        if (x >= y){
            return x - y;
        };
        if (y % 2 != 0){
            y++;
            i++;
            System.out.println("i = " + i + " x = " + x + " y = " + y);
        }

        while (x < y) {
            if (x * 2 > y) {
                x--;
            } else {
                x *= 2;
            }
            i++;
            System.out.println("i = " + i + " x = " + x + " y = " + y);
        }
        return i;






//        int i = 0;
//        while ( y >= x) {
//            if (( y % 2 != 0 )) {
//                y += 1;
////              x += 1;
//                i++;
//            } else {
//                y /= 2;
//            }
//            i++;
//            System.out.println("x = " + x + " y = " + y);
//        }
//        System.out.println("i = " + i);
//        return x - y;
        // – Так, кто там будет это править - кажется я напортачил, беру парашют и прыгаю, всем пока
    }

    public static void main(String[] args) {
        // Данный метод будет вызван из метода main
        // Вы можете писать здесь произвольный код для дебага вашего кода
        System.out.println(brokenDevice(2, 17));
//        System.out.println(brokenDevice(2, 3));
//        System.out.println(brokenDevice(2, 3));
//        System.out.println(brokenDevice(5, 8));
    }
}
