package app.domain.model;

import java.util.Date;

public class MedicalInsurance {

    private String companyName;
    private String policyNumber;
    private boolean isActive; // Boolean
    private Date expirationDate; // dd/mm/yyyy

    public MedicalInsurance(String companyName, String policyNumber, boolean isActive, Date expirationDate) {
        this.companyName = companyName;
        this.policyNumber = policyNumber;
        this.isActive = isActive;
        this.expirationDate = expirationDate;
    }

    // Getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
