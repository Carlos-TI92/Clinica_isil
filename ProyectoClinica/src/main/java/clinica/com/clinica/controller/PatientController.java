package clinica.com.clinica.controller;

import clinica.com.clinica.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PatientController implements GenericClinicController<Patient,String> {
    @Override
    public String getList(Model model) {
        return null;
    }

    @Override
    public String save(Patient patient, Model model) {
        return null;
    }

    @Override
    public String add(Model model) {
        return null;
    }

    @Override
    public String getForUpdate(String s, Model model) {
        return null;
    }

    @Override
    public String update(String s, Patient patient, Model model) {
        return null;
    }

    @Override
    public String delete(String s, Model model) {
        return null;
    }
}
