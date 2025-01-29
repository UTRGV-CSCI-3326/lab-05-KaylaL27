import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter your weight: ");
        double weight = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Are you a smoker? (yes/no): ");
        String response = scanner.nextLine();
        boolean smoker = response.equalsIgnoreCase("yes");

        System.out.println("Your name: " + name + " Your age: " + age + " Your weight: " + weight + " Smoker: " + smoker);

    }
}
