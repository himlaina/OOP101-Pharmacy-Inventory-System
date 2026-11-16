import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void displayMenu() {
        
        System.out.print("\n    PharmaAssist    \n");
        System.out.print("  Pharmacy Management System  \n\n");

        System.out.println("[1] Medicine Management");
        System.out.println("[2] View All Medicine");
        System.out.println("[3] Search Medicine");
        System.out.println("[4] Filter by Category \n");
        System.out.println("[5] Record Stock In");
        System.out.println("[6] Record Sales");
        System.out.println("[7] Record Disposal \n");
        System.out.println("[8] View Batch Record");
        System.out.println("[9] Check Expiration Record");
        System.out.println("[10] View Low-Stock Medicines");
        System.out.println("[11] View Transaction Report");
        System.out.println("[12] Generate Inventory");
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
