class Policy {
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int policyCount = 0;

    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(
            policyHolder.getFirstName(),
            policyHolder.getLastName(),
            policyHolder.getAge(),
            policyHolder.getSmokingStatus(),
            policyHolder.getHeight(),
            policyHolder.getWeight()
        );
        policyCount++;
    }

    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public PolicyHolder getPolicyHolder() { return new PolicyHolder(
        policyHolder.getFirstName(),
        policyHolder.getLastName(),
        policyHolder.getAge(),
        policyHolder.getSmokingStatus(),
        policyHolder.getHeight(),
        policyHolder.getWeight()
    ); }

    public double calculatePolicyPrice() {
        double price = 600.0;
        if (policyHolder.getAge() > 50) price += 75.0;
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) price += 100.0;
        double bmi = policyHolder.calculateBMI();
        if (bmi > 35) price += (bmi - 35) * 20;
        return price;
    }

    public static int getPolicyCount() {
        return policyCount;
    }

    
}
//I do not know if you still wanted the comments but since I was moving stuff I just deleted them//