import java.util.LinkedList;
import java.util.Scanner;

/*
Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name. (Challenge)
 */
public class Question08 {
    public static void main(String[] args) {
        Question08 question08 = new Question08();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line name: ");
        String tube = scanner.next();
        LinkedList<String> elizabeth = new LinkedList();
        elizabeth.add("Liverpool Street");
        elizabeth.add("Farringdon");
        elizabeth.add("Tottenham Court Road");
        elizabeth.add("Bond Street");
        elizabeth.add("Paddington");

        LinkedList<String> overground = new LinkedList();
        overground.add("Liverpool Street");
        overground.add("Shoreditch High Street");
        overground.add("Euston");

        LinkedList<String> piccadilly = new LinkedList();
        piccadilly.add("King's Cross");
        piccadilly.add("Russell Square");
        piccadilly.add("Holborn");
        piccadilly.add("Covent Garden");
        piccadilly.add("Leicester Square");
        piccadilly.add("Piccadilly Circus");
        piccadilly.add("Green Park");
        piccadilly.add("Hyde Park Corner");
        piccadilly.add("Knightsbridge");
        piccadilly.add("South Kensington");
        piccadilly.add("Gloucester Road");

        while (true) {
            if (tube.equalsIgnoreCase("elizabeth")) {
                System.out.println("Stations of Elizabeth Line in Zone 1 are: ");
                System.out.println(elizabeth);
            }
            else if (tube.equalsIgnoreCase("overground")) {
                System.out.println("Stations of Overground Line in Zone 1 are: ");
                System.out.println(overground);
            } else if (tube.equalsIgnoreCase("piccadilly")){
                System.out.println("Stations of Piccadilly Line in Zone 1 are: ");
                System.out.println(piccadilly);
            }
            System.exit(0);
        }
    }
}
/*
Chancery Lane: Central
Temple: District, Circle
Old Street: Northern Line
Barbican: Hammersmith and City, Circle, Metropolitan
Green Park: Jubilee, Piccadilly, Victoria
Paddington: Circle, District, Hammersmith and City, Bakerloo, Elizabeth
St. John's Wood: Jubilee

Elizabeth: Liverpool Street, Farringdon, Tottenham Court Road, Bond Street, Paddington
Overground: Liverpool Street, Shoreditch High Street, Euston
Piccadilly: King's Cross, Russell Square, Holborn, Covent Garden, Leicester Square,
Piccadilly Circus, Green Park, Hyde Park Corner, Knightsbridge, South Kensington, Gloucester Road
 */