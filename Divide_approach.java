import java.util.Scanner;

public class Divide_approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt(); // User input for the number of elements
        int[] arr = new int[n];
        int sum = 0;
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // User input for each element
            sum += arr[i];
        }
        
        int avg = sum / n; // Calculate the average
        int steps = 0;
        for (int num : arr) {
            steps += Math.abs(num - avg); // Sum the differences
        }
        
        steps /= 2; // Each operation involves two elements, so divide by 2
        System.out.println("Number of steps required: " + steps);
        sc.close();
    }
}
