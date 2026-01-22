import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize an object of the class IceCreamRecommendation
        IceCreamRecommendation recommendation = new IceCreamRecommendation();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. List all sales");
            System.out.println("2. Add a sale");
            System.out.println("3. List top three flavours");
            System.out.println("4. Recommend a flavour by age");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    recommendation.listAllSales();
                    break;
                case 2:
                    System.out.println("Available flavours:");
                    String[] flavours = recommendation.getPermittedFlavours();
                    for (int i = 0; i < flavours.length; i++) {
                        System.out.println((i + 1) + ". " + flavours[i]);
                    }
                    System.out.print("Enter flavour number: ");
                    int flavourChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (flavourChoice > 0 && flavourChoice <= flavours.length) {
                        System.out.print("Enter number of items sold: ");
                        int itemsSold = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        recommendation.addSale(flavours[flavourChoice - 1], itemsSold);
                        System.out.println("Sale added successfully.");
                    } else {
                        System.out.println("Invalid flavour number.");
                    }
                    break;
                case 3:
                    String[] topFlavours = recommendation.getTopThreeFlavours();
                    System.out.println("Top three flavours:");
                    for (String flavour : topFlavours) {
                        System.out.println(flavour);
                    }
                    break;
                case 4:
                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Recommended flavour: " + recommendation.recommendByAge(age));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
