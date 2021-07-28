import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number for the array size : \n");
        int N = scan.nextInt();
        int[][] arr = new int[N][N];
        create2dArray(arr, scan);
        printArray(arr);
        System.out.println("result : " + calculateDiagonally(arr));
    }

    public static void create2dArray(int[][] arr, final Scanner scan) {
        System.out.print("Enter " + (arr.length * arr.length) + " Array Elements : \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length;) {
                int number = scan.nextInt();
                if (number > -100 && number < 100) {
                    arr[i][j] = number;
                    j++;
                } else {
                    System.out.print("Number invalid \n");
                }
            }
        }
    }

    public static void printArray(final int[][] arr) {
        System.out.print("The Array is : \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int calculateDiagonally(final int[][] arr) {
        int leftToRight = 0, rightToLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    leftToRight = leftToRight + arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    rightToLeft = rightToLeft + arr[i][j];
                }
            }
        }
        if (leftToRight > rightToLeft) {
            return leftToRight - rightToLeft;
        } else {
            return rightToLeft - leftToRight;
        }
    }
}
