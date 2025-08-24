package app.domain.services;

import app.domain.ports.DiagnosticOrderPort;
import app.domain.model.DiagnosticAidOrder;
import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import java.util.List;

public class SearchDiagnosticAidOrderByPatient {
    private PatientPort patientPort;
    private DiagnosticOrderPort diagnosticAidOrder;
    
    public List<DiagnosticAidOrder> search(Patient patient) throws Exception{
        patient = patientPort.findById(patient);
        if (patient == null){
            throw new Exception("Debe contar con un paciente registrado");
        }
        return diagnosticAidOrder.findByPatient(patient);
    }
}
