public class Person2 {
    private String telephoneNumber;
    private String telephonePrefix;

    /**
     * getter for telephone number
     *
     * @return teh tel no as a String
     */
    String getTelephoneNumber() {
        return telephonePrefix + "." + telephoneNumber;
    }

    /**
     * setter for the tel no
     *
     * @param telephoneNumber a number composed of a prefix and a number separated by a dot e.g. "011.234234"
     */
    void setTelephoneNumber(String telephoneNumber) {
        String[] splitNumber = splitTelephoneNumber(telephoneNumber);
        this.telephonePrefix = splitNumber[0];
        this.telephoneNumber = splitNumber[1];
    }

    private String[] splitTelephoneNumber(String telephoneNumber) {
        return telephoneNumber.split("\\.");
    }

    /**
     * the getter for the prefix
     *
     * @return teh prefix (e.g. "011")
     */
    public String getTelephonePrefix() {
        return telephonePrefix;
    }

    /**
     * the setter for the prefix
     *
     * @param telephonePrefix the prefix, e.h. "011"
     */
    public void setTelephonePrefix(String telephonePrefix) {
        this.telephonePrefix = telephonePrefix;
    }

    @Override
    public String toString() {
        return "prefix='" + telephonePrefix +", number='" + telephoneNumber  ;
    }

    public static void main(String[] args) {
        Person2 pers = new Person2();
        pers.setTelephoneNumber("011.234234");
        System.out.println(pers);
        System.out.println("The full number is"+ pers.getTelephoneNumber());
    }

}
