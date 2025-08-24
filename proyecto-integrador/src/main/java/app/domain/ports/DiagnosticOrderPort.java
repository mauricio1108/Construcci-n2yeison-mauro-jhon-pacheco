package app.domain.ports;

import java.util.List;
import app.domain.model.Patient;


public interface DiagnosticOrderPort {
    public DiagnosticOrderPort findById(DiagnosticOrderPort diagnosticorder) throws Exception;
	public List<DiagnosticOrderPort> findByPatient(Patient patient)throws Exception;
	public void save(DiagnosticOrderPort diagnosticOrder) throws Exception;
}
