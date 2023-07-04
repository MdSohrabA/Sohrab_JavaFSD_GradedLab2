package Lab2;

import java.util.*;

class CurrencyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of currency denominations: ");
        int size = scanner.nextInt();
        
        int[] denominations = new int[size];
        System.out.println("Enter the currency denominations value: ");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();
        
        int[] paymentApproach = findMinimumNotes(denominations, amount);
        
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (int i = 0; i < size; i++) {
            if (paymentApproach[i] > 0) {
                System.out.println(denominations[i] + ":" + paymentApproach[i]);
            }
        }
    }
    
    private static int[] findMinimumNotes(int[] denominations, int amount) {
        int[] paymentApproach = new int[denominations.length];
        
        // Sort the denominations in descending order
        Arrays.sort(denominations);
        reverseArray(denominations);
        
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                paymentApproach[i] = amount / denominations[i];
                amount %= denominations[i];
            }
        }
        
        return paymentApproach;
    }
    
    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}


