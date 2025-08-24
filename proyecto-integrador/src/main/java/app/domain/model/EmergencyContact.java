package app.domain.model;

public class EmergencyContact {

    private String contactName; // Split name and last name
    private String relationship;
    private String phoneNumber; // 10 digits, numbers only

    public EmergencyContact(String contactName, String relationship, String phoneNumber) {
        this.contactName = contactName;
        this.relationship = relationship;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
