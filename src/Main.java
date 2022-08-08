public class Main {
    public static void main(String[] args) {

        // Задание 1

        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        int firstArray0 = array1[0];
        int firstArray1 = array1[1];
        int firstArray2 = array1[2];


        double[] array2 = new double[]{1.57, 7.654, 9.986};
        double secondArray0 = array2[0];
        double secondArray1 = array2[1];
        double secondArray2 = array2[2];

        long[] array3 = new long[3];
        array3[0] = 5;
        array3[1] = 7;
        array3[2] = 9;
        long thirdArray0 = array3[0];
        long thirdArray1 = array3[1];
        long thirdArray2 = array3[2];

        // Задание 2
        System.out.println(String.format("%s, %s, %s", firstArray0, firstArray1, firstArray2));
        System.out.println(String.format("%s, %s, %s", secondArray0, secondArray1, secondArray2));
        System.out.println(String.format("%s, %s, %s", thirdArray0, thirdArray1, thirdArray2));

        // Задание 3
        System.out.println(String.format("%s, %s, %s", firstArray2, firstArray1, firstArray0));
        System.out.println(String.format("%s, %s, %s", secondArray2, secondArray1, secondArray0));
        System.out.println(String.format("%s, %s, %s", thirdArray2, thirdArray1, thirdArray0));

    }


}