import java.util.Scanner;

public class MissingInventoryScans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] expected = new int[n];
        for (int i = 0; i < n; i++)
            expected[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] scanned = new int[m];
        for (int i = 0; i < m; i++)
            scanned[i] = sc.nextInt();
        System.out.println(missingCount(expected, scanned));
        sc.close();
    }

    public static int missingCount(int[] expected, int[] scanned) {
        // Write your code here
        if (expected.length == 0 || scanned.length == 0) {
            return expected.length + scanned.length;
        }
        int first = 0;
        int second = 0;
        int count = 0;
        while (first < expected.length && second < scanned.length) {
            if (expected[first] == scanned[second]) {
                first++;
                second++;
            } else if (expected[first] != scanned[second]) {
                second++;
                count++;
            }
        }
        return count;
    }
}