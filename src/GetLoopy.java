public class GetLoopy {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\nTask 2:");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\nTask 3:");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\nTask 4:");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\nTask 5:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nTask 6:");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nTask 7:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
