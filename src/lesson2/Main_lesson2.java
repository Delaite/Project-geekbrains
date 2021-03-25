package lesson2;

import java.util.Arrays;

public class Main_lesson2<left, right> {
    public static void main(String[] args) {

        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        MinMaxElement();
        checkBalance();

    }


    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { arr[i] = 1; }
            else arr[i] = 0;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

   // Задать пустой целочисленный массив размером 8.
   // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
   public static void fillArray() {
       int[] arr = new int[8];
       int x = 0;
       for (int i = 0; i < arr.length; i++) {
           arr[i] = x;
           x=x+3;
           System.out.println("arr[" + i + "] = " + arr[i]);
       }
   }


   //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
   // пройти по нему циклом, и числа меньшие 6 умножить на 2;
   public static void changeArray() {
       int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
       for (int i = 0; i < w.length; i++) {
           if (w[i] < 6) { w[i] = w[i]*2; }
           System.out.println("w[" + i + "] = " + w[i]);
       }
   }



    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
               arr[i][j] = 1;
               System.out.println("arr[" + i + ","+ j +"] = " + arr[i][j]);
               i=i+1;
            }
        }
    }



//Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
public static void MinMaxElement() {
    int[] w = { 1, 5, 3, 2, 11};
    int max = w[w.length - 1];
    int min = w[0];
    for (int i = 0; i < w.length; i++) {
        Arrays.sort(w);
        if (w[i] < w[0]) {
            min = w[i];
        }

    }
    System.out.println("max = " + max);
    System.out.println("min = " + min);
    }



//Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой
// и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    public static void checkBalance() {
        int[] w = { 1, 5, 3, 2, 11,7};
        int granica = 3;
        int right = 0;
        int left = 0;


        for (int i = 0; i < granica; i++) {
            right =  right + w [i];
            }

        for (int i = 0; i <= w.length; i++) {
            i = granica;
            left = left + w[i];

        }
        System.out.println("left = " + left);
        System.out.println("right = " + right);

        if (left == right) { System.out.println("true");}
        else {System.out.println("false");}
        }

    }

