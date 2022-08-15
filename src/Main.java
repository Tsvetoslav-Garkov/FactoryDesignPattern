import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printFactoryChoices();

        String command = scan.nextLine();
        while (!command.equals("Stop")){
            factoryShowcase(command);
            command = scan.nextLine();
        }
    }

    private static void printFactoryChoices() {
        System.out.println("Choose type of transport for your delivery: ");
        System.out.println("1. Truck");
        System.out.println("2. Ship");
        System.out.println("3. Airplane");
    }

    private static void factoryShowcase(String transportType) {
        TransportFactory factory = new TransportFactory();

        Transport transport = factory.getTransport(transportType);

        System.out.println(transport.deliver());
        System.out.println("-".repeat(50));
    }
}
