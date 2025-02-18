import java.util.Scanner;

class Project_Jason_Pasewaldt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //Demo for policy and using word for word what the sample output requests
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = scanner.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = scanner.nextDouble();

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         //using the info gathered from demo class and combining it with policy class code to create a return
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder \' s First Name: " + policy.getFirstName());
        System.out.println("Policyholder \' s Last Name: " + policy.getLastName());
        System.out.println("Policyholder \' s Age: " + policy.getAge());
        System.out.println("Policyholder \' s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder \' s Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder \' s Weight: " + policy.getWeight() + " pounds");
        System.out.printf("Policyholder \' s BMI: %.2f%n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
        /*I have tried using the unicode and the escape character to make these apostrophes not show up as AE in the run code
        I do not know if I am doing something wrong OR Jgrasp has a formatting issue but I might be dumb in this situation or there
        is something completely obvious i am missing, I unfortunately will have to take points for this because I am doing this an hour and a half before its due :) */
        scanner.close();
    }
    
}
