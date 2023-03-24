import java.util.Scanner;

public class Project_jon_rees {

    public static void main(String[] args) {
        
        // * Initialization

        Scanner scnr = new Scanner(System.in);

        // * Input

        // Get the policy number
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = scnr.nextInt();

        // Get the policy provider name
        System.out.print("Please enter the Provider Name: ");
        scnr.nextLine(); // Consume extra linebreak char
        String policyProvider = scnr.nextLine();

        // Get the policyholder's first name
        System.out.print("Please enter the Policyholder's First Name: ");
        String policyFirst = scnr.nextLine();

        // Get the policyholder's last name
        System.out.print("Please enter the Policyholder's Last Name: ");
        String policyLast = scnr.nextLine();

        // Get the policyholder's age
        System.out.print("Please enter the Policyholder's Age: ");
        int policyAge = scnr.nextInt();

        // Get the policyholder's smoking status
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        scnr.nextLine(); // Consume extra linebreak char
        String policySmoker = scnr.nextLine();

        // Get the policyholder's height
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double policyHeight = scnr.nextDouble();

        // Get the policyholder's weight
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double policyWeight = scnr.nextDouble();

        // * Create Object
        Policy myPolicy = new Policy(policyNumber, policyProvider, policyFirst, policyLast, policyAge, policySmoker, policyHeight, policyWeight);

        // * Output

        // ? Spacing
        System.out.println();

        // ? Data
        // Policy number output
        System.out.println("Policy Number: " + myPolicy.getNumber());

        // Policy provider output
        System.out.println("Provider Name: " + myPolicy.getProvider());

        // Policyholder first name output
        System.out.println("Policyholder's First Name: " + myPolicy.getFirstName());

        // Policyholder last name output
        System.out.println("Policyholder's Last Name: " + myPolicy.getLastName());

        // Policyholder age output
        System.out.println("Policyholder's Age: " + myPolicy.getAge());

        // Policyholder smoking status output
        System.out.println("Policyholder's Smoking Status: " + myPolicy.getSmoker());

        // Policyholder height output
        System.out.println("Policyholder's Height: " + String.format("%.1f", myPolicy.getHeight()) + " inches");

        // Policyholder weight output
        System.out.println("Policyholder's Weight: " + String.format("%.1f", myPolicy.getWeight()) + " pounds");

        // Policyholder BMI output
        System.out.println("Policyholder's BMI: " + String.format("%.2f", myPolicy.getBMI()));

        // Policy price output
        System.out.println("Policy Price: $" + String.format("%.2f", myPolicy.getPrice()));

    }

}