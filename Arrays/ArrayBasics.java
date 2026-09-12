public class ArrayBasics {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Print all elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Access an element
        System.out.println("First element: " + numbers[0]);

        // Update an element
        numbers[2] = 100;

        System.out.println("Updated third element: " + numbers[2]);
    }
}
