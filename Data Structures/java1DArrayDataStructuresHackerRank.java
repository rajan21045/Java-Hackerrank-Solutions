import java.util.*;

public class java1DArrayDataStructuresHackerRank {
    public static void main(String[] args) {
        /*
          An array is a simple data structure used to store a collection of data in a
          contiguous block of memory. Each element in the collection is accessed using
          an index, and the elements are easy to find because they're stored
          sequentially in memory.
          
          Because the collection of elements in an array is stored as a big block of
          data, we typically use arrays when we know exactly how many pieces of data
          we're going to have. For example, you might use an array to store a list of
          student ID numbers, or the names of state capitals. To create an array of
          integers named myArray that can hold four integer values, you would write the
         following code:
          int[] myArray = new int[4];
          This sets aside a block of memory that's capable of storing 4 integers. Each
          integer storage cell is assigned a unique index ranging from 0 to one less
          than the size of the array, and each cell initially contains a 0. In the case
          of , we can store integers at indices 0, 1, 2, and 3. Let's say we wanted the
          last cell to store the number 12; to do this, we write:
          myArray[3] = 12;
          
        Input Format
        The first line contains a single integer, n, denoting the size of the array.
        Each line i of the n subsequent lines contains a single integer denoting the value of element ai.

        Output Format
        You are not responsible for printing any output to stdout. Locked code in the editor loops through array a and prints each sequential element on a new line.
        
        Sample Input
        5
        10
        20
        30
        40
        50
        
        Sample Output
        10
        20
        30
        40
        50    
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
