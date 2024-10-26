//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача №1 + 2

        int[] array1 = new int[3];
        System.out.println ( "Первый массив" );
        for (int index = 0; index < array1.length; index++) {
            array1[index] = index + 1;
            if ( index == array1.length - 1 ) {
                System.out.printf ( "" + array1[index] );
            } else System.out.printf ( array1[index] + ", " );
            ;
        }

        System.out.println ( "\nВторой массив " );
        float[] array2 = new float[3];
        array2[0] = 1.57f;
        array2[1] = 7.654f;
        array2[2] = 9.986f;
        for (int index = 0; index < array2.length; index++) {
            if ( index == array2.length - 1 ) {
                System.out.printf ( "" + array2[index] );
            } else System.out.printf ( array2[index] + ", " );
        }

        System.out.println ( "\nТретий массив" );
        int[] array3 = new int[5];
        for (int index = 0; index < array3.length; index++) {
            array3[index] = index * 5;
            if ( index == array3.length - 1 ) {
                System.out.printf ( "" + array3[index] );
            } else System.out.printf ( array3[index] + ", " );
        }

        //Задача 3

        System.out.println ( "\nПервый массив" );
        for (int index = array2.length - 1; index >= 0; index--) {
            if ( index == 0 ) {
                System.out.printf ( "" + array1[index] );
            } else System.out.printf ( array1[index] + ", " );
        }

        System.out.println ( "\nВторой массив " );
        for (int index = array2.length - 1; index >= 0; index--) {
            if ( index == 0 ) {
                System.out.printf ( "" + array2[index] );
            } else System.out.printf ( array2[index] + ", " );
        }

        System.out.println ( "\nТретий массив" );
        for (int index = array3.length - 1; index >= 0; index--) {
            if ( index == 0 ) {
                System.out.printf ( "" + array3[index] );
            } else System.out.printf ( array3[index] + ", " );
        }

        //Задача 4

        System.out.println ( "\nПервый массив" );
        for (int index = 0; index < array1.length; index++) {
            if ( array1[index] % 2 != 0 ) array1[index]++;
            if ( index == array1.length - 1 ) {
                System.out.printf ( "" + array1[index] );
            } else System.out.printf ( array1[index] + ", " );
        }
    }
}