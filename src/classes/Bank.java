package classes;

public class Bank {

    private String accountNumber;
    private float accountBalannce;
    private String customerName;

    private String email;

    private String phoneNumber;

    public void depositFund(double depositAmount)
    {
//        int accountBalance +=  depositAmount;

    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalannce() {
        return accountBalannce;
    }

    public void setAccountBalannce(float accountBalannce) {
        this.accountBalannce = accountBalannce;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
