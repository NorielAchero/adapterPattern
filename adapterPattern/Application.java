package adapterPattern;
import java.util.*;

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopOut = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOut = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneOut = new SmartphoneAdapter(smartphoneCharger);

        while(true) {
            System.out.println("\n\nPlug In your devices!");
            System.out.println("\nAvailable Home Devices: ");
            System.out.println("[1] Laptop");
            System.out.println("[2] Refrigerator");
            System.out.println("[3] SmartPhone");
            System.out.println("[4] Exit App");

            System.out.print("\nChoose Appliance: ");
            String choice = scan.nextLine();

            if(choice.equals("1")) {
                System.out.println(laptopOut.plugIn());
            }
            else if (choice.equals("2")) {
                System.out.println(refrigeratorOut.plugIn());
            }
            else if (choice.equals("3")) {
                System.out.println(smartphoneOut.plugIn());
            }
            else if (choice.equals("4")) {
                System.out.println("Thank you for using the application");
                break;
            }
            else{
                System.out.println("Invalid Input!");
            }
        }
    }
}