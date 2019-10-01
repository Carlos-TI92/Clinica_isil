package clinica.com.clinica.controller;

import clinica.com.clinica.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class DoctorController implements GenericClinicController<Doctor,String> {
    @Override
    public String getList(Model model) {
        return null;
    }

    @Override
    public String save(Doctor doctor, Model model) {
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
    public String update(String s, Doctor doctor, Model model) {
        return null;
    }

    @Override
    public String delete(String s, Model model) {
        return null;
    }
}
