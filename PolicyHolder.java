import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    @Override
    public String toString() {
        return "Policyholder's First Name: " + firstName + "\n" +
               "Policyholder's Last Name: " + lastName + "\n" +
               "Policyholder's Age: " + age + "\n" +
               "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n" +
               "Policyholder's Height: " + height + " inches\n" +
               "Policyholder's Weight: " + weight + " pounds\n" +
               String.format("Policyholder's BMI: %.2f\n", calculateBMI());
    }
}
