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
        double secodnArray2 = array2[2];

        long[] array3 = new long[3];
        array3[0] = 567;
        array3[1] = 8372;
        array3[2] = 26904;
        long thirdArray0 = array3[0];
        long thirdArray1 = array3[1];
        long thirdArray2 = array3[2];

        // Задание 2
        System.out.println(String.format("%s %s %s %s %s %s %s %s %s", firstArray0, firstArray1, firstArray2, secondArray0, secondArray1, secodnArray2, thirdArray0, thirdArray1, thirdArray2));

    }


}