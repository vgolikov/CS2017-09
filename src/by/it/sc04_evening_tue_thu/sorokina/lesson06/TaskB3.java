package by.it.sc04_evening_tue_thu.sorokina.lesson06;

/*
Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли типа int
3. выводит на экран максимальное, минимальное и среднее арифметическое из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку "Minimum = " минимальное число в формате int.
3. Программа должна выводить строку "Maximum = " максимальное число в формате int.
4. Программа должна выводить строку "Average = " среднее арифметическое в формате double.
 */


import java.util.Scanner;

/* public class TaskB3 {
    public static void main( String[] args ) {
        Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();

            int min=0;
            int max=0;
            int a;

        double c =0;

            for(a=0; a<i; a++){
                int number = sc.nextInt();
                if (i == 0) {
                    min = number;
                    max = number;
                             }
                          if (number < min)
                              min = number;
                          if (number > max)
                              max = number;

                c = c + number;
                      }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + c/i);

            }
      //


    }
    */

import java.util.Scanner;

         public class TaskB3 {
     public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
               int Number = sc.nextInt();
                int min = 0;
               int max = 0;
                int sum = 0;
                int i;
                double avg;
                for (i = 0; i < Number; i++) {
                        int num = sc.nextInt();
                        if (i == 0) {
                                min = num;
                                max = num;
                            }
                        if (num < min)
                                min = num;
                        if (num > max)
                                max = num;

                                sum = sum + num;
                    }
               avg = (double) sum / (double) i;
                System.out.println("Minimum = " + min);
                System.out.println("Maximum = " + max);
                System.out.println("Average = " + avg);
            }
 }

