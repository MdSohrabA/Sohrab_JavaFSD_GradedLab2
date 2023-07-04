package Lab2;

import java.util.Scanner;

public class PayMoneyTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the transaction array: ");
        int transactionSize = scanner.nextInt();
        int[] transactions = new int[transactionSize];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < transactionSize; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();
        for (int i = 0; i < numTargets; i++) {
            System.out.print("Enter the value of target: ");
            int target = scanner.nextInt();
            int sum = 0;
            int j;
            for (j = 0; j < transactionSize; j++) {
                sum += transactions[j];
                if (sum >= target) {
                    System.out.println("Target achieved after " + (j + 1) + " transactions");
                    break;
                }
            }
            if (j == transactionSize) {
                System.out.println("Given target is not achieved");
            }
        }

        scanner.close();
    }
}

