import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project_jon_rees {

    public static void main(String[] args) throws IOException {
        
        // * Initialization

        // ? File reader init
        File policyFile = new File("PolicyInformation.txt");
        Scanner scnr = new Scanner(policyFile);

        // ? Policy list init
        List<Policy> policies = new ArrayList<Policy>();

        // ? Smoker counters init
        int smokers = 0;
        int nonSmokers = 0;

        // * Input

        // While there are Policies to be read, load them into the list
        while (scnr.hasNext()) {

            // Get the policy number
            int policyNumber = scnr.nextInt();

            scnr.nextLine(); // Consume extra linebreak char

            // Get the policy provider name
            String policyProvider = scnr.nextLine();

            // Get the policyholder's first name
            String policyFirst = scnr.nextLine();

            // Get the policyholder's last name
            String policyLast = scnr.nextLine();

            // Get the policyholder's age
            int policyAge = scnr.nextInt();

            scnr.nextLine(); // Consume extra linebreak char

            // Get the policyholder's smoking status
            String policySmoker = scnr.nextLine();

            // Get the policyholder's height
            double policyHeight = scnr.nextDouble();

            // Get the policyholder's weight
            double policyWeight = scnr.nextDouble();

            // * Create Object
            Policy myPolicy = new Policy(policyNumber, policyProvider, policyFirst, policyLast, policyAge, policySmoker, policyHeight, policyWeight);

            // Insert the object into the list
            policies.add(myPolicy);

        }

        // * Output

        for (Policy myPolicy : policies) {

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

            // Smoking counter
            if (myPolicy.getSmoker().equals("smoker")) {
                smokers++;
            } else {
                nonSmokers++;
            }

            // ? Spacing
            System.out.println();

        }

        // ? Smoker counter output
        System.out.println("Number of smokers: " + smokers + " \nNumber of non-smokers: " + nonSmokers);

        // * Cleanup
        scnr.close();

    }

}