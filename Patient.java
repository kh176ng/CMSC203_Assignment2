/*
 * Class: CMSC203
 * Instructor:
 * Description: Data model class representing a patient's personal and emergency information.
 * Due: 07/27/2024
 * Platform/compiler: Java
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: __________
*/


public class Patient {

    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyName;
    private String emergencyPhone;

    public Patient() {
    }

    public Patient(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    public Patient(String first, String middle, String last,
                   String address, String city, String state, String zip,
                   String phone, String emergencyName, String emergencyPhone) {
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;
        this.streetAddress = address;
        this.city = city;
        this.state = state;
        this.zipCode = zip;
        this.phoneNumber = phone;
        this.emergencyName = emergencyName;
        this.emergencyPhone = emergencyPhone;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String first) { firstName = first; }
    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middle) { middleName = middle; }
    public String getLastName() { return lastName; }
    public void setLastName(String last) { lastName = last; }
    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String address) { streetAddress = address; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getZipCode() { return zipCode; }
    public void setZipCode(String zip) { zipCode = zip; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phone) { phoneNumber = phone; }
    public String getEmergencyName() { return emergencyName; }
    public void setEmergencyName(String name) { emergencyName = name; }
    public String getEmergencyPhone() { return emergencyPhone; }
    public void setEmergencyPhone(String phone) { emergencyPhone = phone; }

    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }

    @Override
    public String toString() {
        return "Patient Name: " + buildFullName() +
                "\nAddress: " + buildAddress() +
                "\nPhone: " + phoneNumber +
                "\nEmergency Contact: " + buildEmergencyContact();
    }
}