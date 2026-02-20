public class Main {
    public static int[] deklarasiArray() {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        return arr;
    }

    public static int hitungPenjumlahan(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // c. Hitung rerata
    public static double hitungRerata(int[] arr) {
        int sum = hitungPenjumlahan(arr);
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = deklarasiArray();

        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum = hitungPenjumlahan(arr);
        System.out.println("Penjumlahan : " + sum);

        double average = hitungRerata(arr);
        System.out.println("Rerata : " + average);
    }
}