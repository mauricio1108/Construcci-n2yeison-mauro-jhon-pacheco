package app.domain.services;

import app.domain.model.MedicalInsurance;
import app.domain.model.User;
import app.domain.ports.UserPort;

public class CreateUser{

    private UserPort userPort;
    private MedicalInsurance medicalInsurance;

    public void create(User user) throws Exception {
        if (userPort.findByMedicalInsurance(medicalInsurance) != null) {
            throw new Exception("ya existe una persona registrada con esa cedula");
        }

        if (userPort.findByUserName(user) != null) {
            throw new Exception("ya existe una persona registrada con ese nombre de usuario");
        }
        userPort.save(user);
    }
}