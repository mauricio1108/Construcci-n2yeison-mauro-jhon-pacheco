package app.domain.model;

import java.util.Date;
import java.util.Map;

public class ClinicalHistory {
    private String patientId; // Patient's ID ('cedula') as main key
    private Date consultationDate; // Subkey, 'fecha de atencion'
    private String physicianId; // Max 10 digits
    private String reasonForConsultation;
    private String symptoms;
    private String diagnosis;
    private Map<String, Object> details; // Unstructured data storage
 
    public ClinicalHistory(String patientId, Date consultationDate, String physicianId, String reasonForConsultation, String symptoms, String diagnosis, Map<String, Object> details) {
        this.patientId = patientId;
        this.consultationDate = consultationDate;
        this.physicianId = physicianId;
        this.reasonForConsultation = reasonForConsultation;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
        this.details = details;
    }
 
    // Getters and setters
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public Date getConsultationDate() { return consultationDate; }
    public void setConsultationDate(Date consultationDate) { this.consultationDate = consultationDate; }
    public String getPhysicianId() { return physicianId; }
    public void setPhysicianId(String physicianId) { this.physicianId = physicianId; }
    public String getReasonForConsultation() { return reasonForConsultation; }
    public void setReasonForConsultation(String reasonForConsultation) { this.reasonForConsultation = reasonForConsultation; }
    public String getSymptoms() { return symptoms; }
    public void setSymptoms(String symptoms) { this.symptoms = symptoms; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public Map<String, Object> getDetails() { return details; }
    public void setDetails(Map<String, Object> details) { this.details = details; }
}
