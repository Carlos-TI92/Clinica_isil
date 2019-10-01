package clinica.com.clinica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedicalStories {

    private String storiesNumber;
    private String patient;
    private String doctor;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;
    private String queries;
    private String diseases;
    private String medicines;
    private String operations;
    private String observations;

}
