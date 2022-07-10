package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//С целью выведения самой жизнеспособной расы ученые умы решили провести селекцию на основе проверенного временем древнего теста ДНК (Драки с Непобедимыми Кентаврами).
//        Для этого сильнейшие представители каждой расы heroes в порядке очереди вступают в бой с одним из n древних Кентавров. Каждый герой может продержаться в бою heroes[i] минут. Количество кентавров не уменьшается (не зря их прозвали Непобедимыми). Определите время, за которое все бои будут завершены.
//
//        На входе:
//
//        heroes - массив целых неотрицательных чисел. Каждое число обозначает время поединка героя в очереди  (всегда больше 0)
//        n - количество Кентавров (всегда больше 0)
//        На выходе: число (int) - время, за которое завершатся все поединки
//
//        Пример:
//        1. если кентавр один, то общее время равно сумме времени каждого участника
//
//        total_time([6, 2, 9], 1) --> 17
//        2.  кентавров два, поэтому первый и второй герои вступают в бой одновременно, затем, после второго, третий и четвертый сражаются по очереди со вторым кентавром
//
//        total_time([11, 2, 3, 4], 2) --> 11
//        3. кентавров два, первый и второй герои одновременно вступают в бой, после первого героя третий будет биться с тем же кентавром
//
//        total_time([3, 5, 10], 2) --> 13

public class Main {
    public static int minTime(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int getTotalTime(List<Integer> heroes, int n) {
        // Напишите ваш код здесь...
        int[] arr = new int[n];
        for (int i = 0; i < heroes.size(); i++) {
            int min = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            arr[min] = arr[min] + heroes.get(i);
            System.out.println("min = " + min);
        }
        System.out.println("Begin = " + arr);
        Arrays.sort(arr);
        System.out.println("End = " + arr);
        return arr[arr.length - 1];
        }

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        int n = 5;
        System.out.println("List = " + list);
        System.out.println("n = " + n);
        System.out.println(getTotalTime(list, n));
    }
}
