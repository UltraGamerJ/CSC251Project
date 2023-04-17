public class PolicyHolder {

    // * Attributes
    private String firstName;
    private String lastName;
    private int age;
    private String smoker;
    private double height;
    private double weight;

    // * Constructors

    /**
     * Empty contructor
     */
    public PolicyHolder() {
    }

    /**
     * Initializes a PolicyHolder object
     * @param firstName The policyholder's first name
     * @param lastName The policyholder's last name
     * @param age The policyholder's age
     * @param smoker The policyholder's smoking status
     * @param height The policyholder's height
     * @param weight The policyholder's weight
     */
    public PolicyHolder(String firstName, String lastName, int age, String smoker, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smoker = smoker;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Copy constructor
     * @param copy PolicyHolder object to copy from
     */
    public PolicyHolder(PolicyHolder copy) {
        this.firstName = copy.getFirstName();
        this.lastName = copy.getLastName();
        this.age = copy.getAge();
        this.smoker = copy.getSmoker();
        this.height = copy.getHeight();
        this.weight = copy.getWeight();
    }

    // * Methods

    /**
     * Calculates the policyholder's BMI
     * @return The policyholder's BMI
     */
    public double getBMI() {

        return (this.getWeight() * 703) / (this.getHeight() * this.getHeight());

    }

    // * Getters and Setters

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