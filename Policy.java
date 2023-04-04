public class Policy {

    // * Attributes
    private int number;
    private String provider;
    private String firstName;
    private String lastName;
    private int age;
    private String smoker;
    private double height;
    private double weight;

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
     * @param firstName The policyholder's first name
     * @param lastName The policyholder's last name
     * @param age The policyholder's age
     * @param smoker The policyholder's smoking status ("smoker" or "non-smoker")
     * @param height The policyholder's height in inches
     * @param weight The policyholder's weight in pounds
     */
    public Policy(int number, String provider, String firstName, String lastName, int age, String smoker, double height, double weight) {
        this.number = number;
        this.provider = provider;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smoker = smoker;
        this.height = height;
        this.weight = weight;
    }

    // * Methods

    /**
     * Calculates the policyholder's BMI
     * @return The policyholder's BMI
     */
    public double getBMI() {

        return (this.getWeight() * 703) / (this.getHeight() * this.getHeight());

    }

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
        if (this.getBMI() > 35) {
            fees += (this.getBMI() - 35) * 20;
        }

        // If the policyholder is older than 50, add a $75 fee
        if (this.getAge() > 50) {
            fees += 75;
        }

        // If the policyholder is a smoker, add a $100 fee
        if (this.getSmoker().equals("smoker")) {
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
     * Returns the policyholder's first name
     * @return The policyholder's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the policyholder's first name
     * @param firstName The policyholder's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the policyholder's last name
     * @return The policyholder's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets the policyholder's last name
     * @param lastName The policyholder's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the policyholder's age
     * @return The policyholder's age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Sets the policyholder's age
     * @param age The policyholder's age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the policyholder's smoking status
     * @return The policyholder's smoking status
     */
    public String getSmoker() {
        return this.smoker;
    }

    /**
     * Sets the policyholder's smoking status
     * @param smoker The policyholder's smoking status
     */
    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    /**
     * Returns the policyholder's height
     * @return The policyholder's height
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Sets the policyholder's height
     * @param h The policyholder's height
     */
    public void setHeight(double h) {
        this.height = h;
    }

    /**
     * Returns the policyholder's weight
     * @return The policyholder's weight
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Sets the policyholder's weight
     * @param w The policyholder's weight
     */
    public void setWeight(double w) {
        this.weight = w;
    }

}