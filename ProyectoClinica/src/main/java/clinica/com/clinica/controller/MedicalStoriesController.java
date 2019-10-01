package clinica.com.clinica.controller;

import clinica.com.clinica.model.MedicalStories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MedicalStoriesController implements GenericClinicController<MedicalStories,String> {
    @Override
    public String getList(Model model) {
        return null;
    }

    @Override
    public String save(MedicalStories medicalStories, Model model) {
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
    public String update(String s, MedicalStories medicalStories, Model model) {
        return null;
    }

    @Override
    public String delete(String s, Model model) {
        return null;
    }
}
