package app.domain.services;

import app.domain.model.MedicalInsurance;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;

public class CreatePatient {

    private UserPort userPort;
    private PatientPort patientPort;
    private MedicalInsurance medicalinsurance;

    public void create(Patient patient) throws Exception {
        MedicalInsurance medicalInsurance = userPort.findByMedicalInsurance(patient.getMedicalInsurance());
        if (medicalinsurance == null) {
            throw new Exception("el paciente debe tener un seguro medico");
        }
        patient.setMedicalInsurance(medicalinsurance);
        patientPort.save(patient);
    }
}
