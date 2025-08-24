package app.domain.ports;

import app.domain.model.DiagnosticAidOrder;
import java.util.List;
import app.domain.model.Patient;

public interface DiagnosticOrderPort {

    public DiagnosticOrderPort findById(DiagnosticOrderPort diagnosticorder) throws Exception;

    public List<DiagnosticAidOrder> findByPatient(Patient patient) throws Exception;

    public void save(DiagnosticOrderPort diagnosticOrder) throws Exception;
}
