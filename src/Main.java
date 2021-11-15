import java.util.Arrays;

public class Main {

    //По 5 дз
    private static int getMinDigit(int[] array) {
        int digit;
        int minDigit = 10;
        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0) {
                digit = array[i] % 10;
                if (digit < minDigit) {
                    minDigit = digit;
                }
                array[i] = array[i] / 10;

            }


        }
        return minDigit;
    }

    //По 6 дз
    private static int getIndex(int[] array, int x) {
        int digit = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                digit = i;
            }
        }
        return digit;
    }


    private static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] == 0 & array[i+1]!=0) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {

        //По 5 ДЗ
        int[] a = {943, 87655, 5655, 934567768, -1};
        System.out.println(getMinDigit(a));

        //По 6 ДЗ
        int[] b = {34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20};
        System.out.println(getIndex(b, 18));

        bubbleSort(b);


    }
}