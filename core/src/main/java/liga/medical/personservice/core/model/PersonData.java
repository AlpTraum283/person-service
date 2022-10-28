package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "person_data")
public class PersonData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private BigInteger id;

    @Column(name = "last_name")
    @NotNull
    private String lastName;

    @Column(name = "first_name")
    @NotNull
    private String firstName;

    @Column(name = "birth_dt")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private Date birthDt;

    @NotNull
    private short age;

    @NotNull
    private char sex;

    @Column(name = "contact_id")
    @NotNull
    private BigInteger contactId;

    @Column(name = "medical_card_id")
    @NotNull
    private BigInteger medicalCardId;

    @Column(name = "parent_id")
    @NotNull
    private BigInteger parentId;
}
