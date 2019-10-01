package clinica.com.clinica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {

    private String documentNumber;
    private String name;
    private String fatherLastName;
    private String motherLastName;
    private String phone;
    private String specialty;
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

}
