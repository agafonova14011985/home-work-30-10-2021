import java.util.Arrays;

public class homeWork3 {

    // Практическая  3
    public static void main(String[] args) {

        System.out.println("---------------задание 1-------------------");
        //Массив из 0 и 1
        //заменить 1 на 0 и наоборот

        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int b = a.length;
        for (int i = 0; i < b; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
        for (int i = 0; i < b; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else a[i] = 1;
            {
                System.out.print(a[i]);
            }
        }
        System.out.println();

        System.out.println("---------------задание 2-------------------");
        //Пустой массив длиной 100
        //заполнить его значениями 1++до100

        int[] arr = new int[100];
        int j = 1;
        int с = arr.length;
        for (int i = 0; i < с; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < с; i++) //+j = j++
        {
            arr[i] = j++;
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.println("------------задание 3----------------------");
        //Массив из 1.5.3.2.11.4.5.2.4.8.9.1
        //числа меньше 6 умножить на 2

        int[] d = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int d1 = d.length;
        for (int i = 0; i < d1; i++) {
            System.out.print(d[i]);
        }
        System.out.println("");
        for (int i = 0; i < d1; i++) {
            if (d[i] < 6) {
                d[i] = d[i] * 2; }

            { System.out.print(d[i]); }
        }

        System.out.println();
        System.out.println("-------------задание 4---------------------");
        //Квадратный двумерный массив
        // с помощью цикла заполнить его диагональные элементы 1

        int counter = 1;
        int[][] table = new int[4][4];
        for (int i1 = 0; i1 < 4; i1++) {
            for (int j1 = 0; j1 < 4; j1++) {
                table[i1][j1] = counter;
                System.out.print(table[i1][j1] + " ");
                counter++;}
               System.out.println();}

            for ( int i1 = 0; i1 < 4; i1++) {
                for (int j1 = 0; j1 < 4; j1++) {
                    if (i1==j1){table[i1][j1] = 0;
                  System.out.print(table[i1][j1]);}}}
        System.out.println();
        System.out.println("-------------задание 5-------------");

        retLenArr(1, 2);
        System.out.println();

        System.out.println("----------------задание 6------------");

        int[] x = {1, 2,};
        int x1 = x.length;
        int min = 0;
        int max = 2;
        for (int i = 0; i < x1; i++) {
            if ( x[i] < min){ min = x[i];}
           if ( x[i] > min){ max = x[i]; }
           System.out.print( min + max ); }
        System.out.println();
        System.out.println("----------------задание 7------------");

        //checkbalance(); не могу правильно вызвать.
        System.out.println();
        System.out.println("----------------задание 8------------");

        //shiftArray(2,3); не могу правильно вызвать
    }

   

    public static int[] retLenArr(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){

            arr[i] = initialValue;


        System.out.print(arr[i]); }
        return arr; }

public static boolean checkbalance(int[] arr7){
      int leftSum = 0;
      for(int i = 0; i < arr7.length; i++){
           leftSum += arr7[i];
           int rightSum = 0;
           for (int j = 0; j < arr7.length; j++){
               rightSum += (j > i)? arr7[j] : 0; }
           if(leftSum == rightSum){
               return true; } }
        return false; }


    public static void shiftArray(int[] array, int array2) {
        boolean direction;
        if (array2 < 0) {
            direction = true;
            array2 = -array2;
        } else  {
            direction = false;
        }
        array2%= array.length;
        int last = array.length - 1;
        for (int i = 0; i < array2; i++) {
            int temp = (direction) ? array[0] : array[last];

            for (int j = 0; j < last; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[last - j] = array[last - j - 1];
            }

            if (direction)
                array[last] = temp;
            else
                array[0] = temp;
        }
    }
    }















