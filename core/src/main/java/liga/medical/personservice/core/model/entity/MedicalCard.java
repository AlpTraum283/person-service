package liga.medical.personservice.core.model.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name = "medical_card")
public class MedicalCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private Long id;

    @Column(name = "client_status")
    @NotNull
    private char clientStatus;

    @Column(name = "med_status")
    @NotNull
    private char medStatus;

    @Column(name = "registry_dt")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private Date registryDt;

    @NotNull
    private String comment;

}
