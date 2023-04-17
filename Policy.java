public class Policy {

    // * Attributes
    private int number;
    private String provider;
    private PolicyHolder policyHolder;

    // * Constructors

    /**
     * No-arg constructor
     */
    public Policy() {
    }

    /**
     * Constructor to create and initialize a Policy object
     * @param number The policy number
     * @param provider The name of the policy provider
     * @param policyHolder The PolicyHolder object containing the policy holder's info
     */
    public Policy(int number, String provider, PolicyHolder policyHolder) {
        this.number = number;
        this.provider = provider;
        this.policyHolder = policyHolder;
    }

    // * Methods

    /**
     * Calculates the price of the policy based on the policyholder's information
     * @return The price of the policy
     */
    public double getPrice() {

        // Declare the base fee
        final double BASE_FEE = 600;

        // Initialize the extra fees
        double fees = 0;

        // If the BMI is more than 35, add a special fee
        if (this.policyHolder.getBMI() > 35) {
            fees += (this.policyHolder.getBMI() - 35) * 20;
        }

        // If the policyholder is older than 50, add a $75 fee
        if (this.policyHolder.getAge() > 50) {
            fees += 75;
        }

        // If the policyholder is a smoker, add a $100 fee
        if (this.policyHolder.getSmoker().equals("smoker")) {
            fees += 100;
        }

        // Return the final price
        return BASE_FEE + fees;

    }

    // * Getters & Setters

    /**
     * Returns the policy number
     * @return The policy number
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Sets the policy number
     * @param number The policy number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Returns the policy provider
     * @return The policy provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * Sets the policy provider
     * @param provider The policy provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Returns the policy holder
     * @return The policy holder
     */
    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(this.policyHolder);
    }

    /**
     * Sets the policy holder
     * @param policyHolder The policy holder
     */
    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = new PolicyHolder(policyHolder);
    }

}