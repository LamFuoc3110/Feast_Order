
package models;

/**
 *
 * @author ACER
 */
public class Customers {
    String customerCode;
    String name;
    String phoneNumber;
    String Email;

    public Customers(String customerCode, String name, String phoneNumber, String Email) {
        if(checkCustomerCode(customerCode) && checkValidEmail(Email) && checkValidName(name) && checkValidPhone(phoneNumber)){
        this.customerCode = customerCode;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.Email = Email;
        }
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
    public boolean checkCustomerCode(String id) {
    if (id.length() != 5) {
        return false;
    }

    String firstCharacter = id.substring(0, 1);
    String lastFourCharacters = id.substring(1);

    if (!(firstCharacter.equalsIgnoreCase("C") || 
          firstCharacter.equalsIgnoreCase("G") || 
          firstCharacter.equalsIgnoreCase("K"))) {
        return false;
    }

    for (char c : lastFourCharacters.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false;
        }
    }

    return true;
}

  
    public boolean checkValidName(String name){
        if(name == null || name.isEmpty()){
            return false;
        }
        int length = name.length();
        if(length <= 2 || length >= 20){
            return false;
        }
        return true;
    }
    public boolean checkValidEmail(String email){
        if(email.contains("@gmail.com")){
            return true;
        }
        return false;
    }
    public boolean checkValidPhone(String phoneNum) {
    if (phoneNum.length() != 10) {
        return false;
    }

    for (char c : phoneNum.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false;
        }
    }

    String networkCode = phoneNum.substring(0, 2);
    return networkCode.equals("09") || networkCode.equals("08") || 
           networkCode.equals("03") || networkCode.equals("05") || 
           networkCode.equals("07");
    }

    @Override
    public String toString() {
        return "Customers{" + "customerCode=" + customerCode + ", name=" + name + ", phoneNumber=" + phoneNumber + ", Email=" + Email + '}';
    }
    
}
