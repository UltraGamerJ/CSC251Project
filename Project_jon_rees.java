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
            Policy myPolicy = new Policy(policyNumber, policyProvider, new PolicyHolder(policyFirst, policyLast, policyAge, policySmoker, policyHeight, policyWeight));

            // Insert the object into the list
            policies.add(myPolicy);

        }

        // * Output

        for (Policy myPolicy : policies) {

            // ? Data
            // Output policy info
            System.out.println(myPolicy);

            // Smoking counter
            if (myPolicy.getPolicyHolder().getSmoker().equals("smoker")) {
                smokers++;
            } else {
                nonSmokers++;
            }

            // ? Spacing
            System.out.println();

        }

        // ? Policy counter output
        System.out.println("There were " + Policy.getObjects() + " Policy objects created.");

        // ? Smoker counter output
        System.out.println("The number of policies with a smoker is: " + smokers + " \nThe number of policies with a non-smoker is: " + nonSmokers);

        // * Cleanup
        scnr.close();

    }

}