import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Project_Juriko_Misua {
        public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"));

            while (fileScanner.hasNextLine()) {
                String line = "";
                do {
                    if (!fileScanner.hasNextLine()) break;
                    line = fileScanner.nextLine().trim();
                } while (line.isEmpty());

                if (line.isEmpty()) break;

                int policyNumber = Integer.parseInt(line);
                String providerName = fileScanner.nextLine().trim();
                String firstName = fileScanner.nextLine().trim();
                String lastName = fileScanner.nextLine().trim();
                int age = Integer.parseInt(fileScanner.nextLine().trim());
                String smokingStatus = fileScanner.nextLine().trim();
                double height = Double.parseDouble(fileScanner.nextLine().trim());
                double weight = Double.parseDouble(fileScanner.nextLine().trim());

                PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
                Policy policy = new Policy(policyNumber, providerName, holder);
                policies.add(policy);

                if (smokingStatus.equalsIgnoreCase("smoker")) smokerCount++;
                else nonSmokerCount++;
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return;
        }

        for (Policy policy : policies) {
            System.out.println("\n" + policy);
        }

        System.out.println("\nThere were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount); //step 7 
    }
}
