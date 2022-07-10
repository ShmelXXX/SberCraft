package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Компания из N дворфов решила сплавиться по реке в бочках из-под вина до ближайшей таверны. i-й дворф имеет массу dwarfs[i]. Бочки могут выдержать массу не более limit.
//        Каждая бочка вмещает не более 2 дворфов при условии что их суммарная масса не превышает limit.
//        Напишите функцию, определяющую минимальное количество бочек, которое потребуется опустошить, чтобы дворфы смогли продолжить веселье в таверне.
//
//        На входе:
//
//        dwarfs - массив дворфов, каждое значение определяет массу дворфа
//        limit - максимальная масса, которую выдержит бочка
//        Примечание: масса каждого дворфа меньше или равна limit
//        На выходе: целое число - минимальное количество бочек
//        Примечание: 1 <= dwarfs[i] <= limit
//
//        Пример:
//
//        dwarfs = [3,2,2,1]
//        limit = 3
//        getNumberOfBoats( dwarfs, limit ) -->  3

public class Main {

    public static int getNumberOfBoats2(List<Integer> dwarfs, int limit) {
        // Напишите ваш код здесь...
        System.out.println("Dwarfs before = " + dwarfs);
        Collections.sort(dwarfs, Collections.reverseOrder());
        System.out.println("Dwarfs after = " + dwarfs);
        List<Integer> boats = new ArrayList<>();
        int boatsCount = 0;
        for (int i = 0; i < dwarfs.size(); i++) {
            boolean needNewBoat = true;
            int findedBoat = -1;
            int maxFilled = 0;

            for (int j = 0; j < boatsCount; j++) {
                if (boats.get(j) + dwarfs.get(i) <= limit) {
                    //boats.set(j, boats.get(j) + dwarfs.get(i));
                    if (boats.get(j) + dwarfs.get(i) > maxFilled) {
                        maxFilled = boats.get(j) + dwarfs.get(i);
                        findedBoat = j;
                        needNewBoat = false;
                    }
                }
            }
            if (!needNewBoat) {
                boats.set(findedBoat, maxFilled);
            } else {
                boats.add(dwarfs.get(i));
                boatsCount++;
            }
        }
        System.out.println("Boats = " + boats);
        return boatsCount;
    }

    public static int getNumberOfBoats(List<Integer> dwarfs, int limit) {
        // Напишите ваш код здесь...
        System.out.println("Dwarfs before = " + dwarfs);
        Collections.sort(dwarfs, Collections.reverseOrder());
        System.out.println("Dwarfs after = " + dwarfs);
        List<Integer> boats = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        int boatsCount = 0;
        for (int i = 0; i < dwarfs.size(); i++) {
            boolean needNewBoat = true;
            for (int j = 0; j < boatsCount; j++){
                if ((boats.get(j) + dwarfs.get(i) <= limit) && (counts.get(j) < 2)) {
                    boats.set(j, boats.get(j) + dwarfs.get(i));
                    counts.set(j,  counts.get(j) + 1);
                    needNewBoat = false;
                    break;
                }
            }
            if (needNewBoat){
                boats.add(dwarfs.get(i));
                counts.add(1);
                boatsCount++;
            }
        }
        System.out.println("Boats = " + boats);
        System.out.println("Counts = " + counts);
        return boatsCount;
    }

    public static void main(String[] args) {
	// write your code here
        // Напишите ваш код здесь...
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        int limit = 10;
        System.out.println(list);
        System.out.println("Limit = " + limit);
        System.out.println("Count = " + getNumberOfBoats(list, limit ));
    }
}
