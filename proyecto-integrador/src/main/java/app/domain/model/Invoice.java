package app.domain.model;

import java.util.Date;
import java.util.List;

public class Invoice {

    private String patientName;
    private int patientAge;
    private String patientId;
    private String attendingPhysicianName;
    private String insuranceCompanyName;
    private String policyNumber;
    private long policyValidityDays;
    private Date policyExpirationDate;
    private String diagnosis;
    private List<MedicationOrder> medications;
    private List<ProcedureOrder> procedures;
    private List<DiagnosticAidOrder> diagnosticAids;

    public Invoice(String patientName, int patientAge, String patientId, String attendingPhysicianName, String insuranceCompanyName, String policyNumber, long policyValidityDays, Date policyExpirationDate, String diagnosis, List<MedicationOrder> medications, List<ProcedureOrder> procedures, List<DiagnosticAidOrder> diagnosticAids) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientId = patientId;
        this.attendingPhysicianName = attendingPhysicianName;
        this.insuranceCompanyName = insuranceCompanyName;
        this.policyNumber = policyNumber;
        this.policyValidityDays = policyValidityDays;
        this.policyExpirationDate = policyExpirationDate;
        this.diagnosis = diagnosis;
        this.medications = medications;
        this.procedures = procedures;
        this.diagnosticAids = diagnosticAids;
    }

    // Getters and setters
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAttendingPhysicianName() {
        return attendingPhysicianName;
    }

    public void setAttendingPhysicianName(String attendingPhysicianName) {
        this.attendingPhysicianName = attendingPhysicianName;
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public long getPolicyValidityDays() {
        return policyValidityDays;
    }

    public void setPolicyValidityDays(long policyValidityDays) {
        this.policyValidityDays = policyValidityDays;
    }

    public Date getPolicyExpirationDate() {
        return policyExpirationDate;
    }

    public void setPolicyExpirationDate(Date policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<MedicationOrder> getMedications() {
        return medications;
    }

    public void setMedications(List<MedicationOrder> medications) {
        this.medications = medications;
    }

    public List<ProcedureOrder> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<ProcedureOrder> procedures) {
        this.procedures = procedures;
    }

    public List<DiagnosticAidOrder> getDiagnosticAids() {
        return diagnosticAids;
    }

    public void setDiagnosticAids(List<DiagnosticAidOrder> diagnosticAids) {
        this.diagnosticAids = diagnosticAids;
    }
}
