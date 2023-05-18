import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Size of the sequence
            int[] sequence = new int[n];

            // Read the sequence
            for (int i = 0; i < n; i++) {
                sequence[i] = scanner.nextInt();
            }

            boolean isAPFree = isAPFree(sequence);
            System.out.println(isAPFree ? "Yes" : "No");
        }
    }

    private static boolean isAPFree(int[] sequence) {
        int n = sequence.length;

        // Iterate over all possible triplets of indices (i, j, k)
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((sequence[j] - sequence[i]) == (sequence[k] - sequence[j])) {
                        return false; // AP found, sequence is not AP-Free
                    }
                }
            }
        }

        return true; // No AP found, sequence is AP-Free
    }
}
