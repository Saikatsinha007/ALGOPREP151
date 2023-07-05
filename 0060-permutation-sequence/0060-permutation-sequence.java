class Solution {
    public String getPermutation(int n, int k) {
         List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        StringBuilder sb = new StringBuilder();

        // Create a list of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Calculate factorial values from 0! to n!
        calculateFactorial(factorial);

        k--; // Convert k to 0-indexing

        // Generate the kth permutation
        for (int i = n; i >= 1; i--) {
            int index = k / factorial[i - 1];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k %= factorial[i - 1];
        }

        return sb.toString();
    }

    private void calculateFactorial(int[] factorial) {
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }
    }
