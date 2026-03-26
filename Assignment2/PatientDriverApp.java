/*
 * Class: CMSC203
 * Instructor:
 * Description: Driver application that manages the interaction between the user,
 * the Patient class, and the Procedure class.
 * Due: 07/27/2024
 * Platform/compiler: Java
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: __________
*/

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Patient Information");
        System.out.print("First Name: ");
        String first = keyboard.nextLine();
        System.out.print("Middle Name: ");
        String middle = keyboard.nextLine();
        System.out.print("Last Name: ");
        String last = keyboard.nextLine();
        System.out.print("Street Address: ");
        String address = keyboard.nextLine();
        System.out.print("City: ");
        String city = keyboard.nextLine();
        System.out.print("State: ");
        String state = keyboard.nextLine();
        System.out.print("ZIP Code: ");
        String zip = keyboard.nextLine();
        System.out.print("Phone Number: ");
        String phone = keyboard.nextLine();
        System.out.print("Emergency Contact Name: ");
        String emergencyName = keyboard.nextLine();
        System.out.print("Emergency Contact Phone: ");
        String emergencyPhone = keyboard.nextLine();

        Patient patient = new Patient(first, middle, last, address, city, state, zip, phone, emergencyName, emergencyPhone);

        // Creating three procedures as per rubric requirements
        Procedure proc1 = new Procedure("X-Ray", "07/20/2024", "Dr. Smith", 250.00);

        Procedure proc2 = new Procedure("Blood Test", "07/21/2024");
        proc2.setPractitionerName("Dr. Adams");
        proc2.setCharges(150.00);

        Procedure proc3 = new Procedure();
        proc3.setProcedureName("MRI");
        proc3.setProcedureDate("07/22/2024");
        proc3.setPractitionerName("Dr. Lehan");
        proc3.setCharges(1200.00);

        // Display results
        displayPatient(patient);

        System.out.println("\nProcedures:");
        displayProcedure(proc1);
        displayProcedure(proc2);
        displayProcedure(proc3);

        double total = calculateTotalCharges(proc1, proc2, proc3);
        System.out.printf("\nTotal Charges: $%,.2f\n", total);

        System.out.println("\nThe program was developed by Student: Vinh Khang Than <02/25/2026>");

        keyboard.close();
    }

    public static void displayPatient(Patient p) {
        System.out.println("\nPatient Information:");
        System.out.println(p);
    }

    public static void displayProcedure(Procedure proc) {
        System.out.println(proc);
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}