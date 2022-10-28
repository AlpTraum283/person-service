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
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "illness")
public class Illness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private BigInteger id;

    @Column(name = "medical_card_id")
    @NotNull
    private BigInteger medicalCardId;

    @Column(name = "type_id")
    @NotNull
    private BigInteger typeId;

    @NotNull
    private char heaviness;

    @Column(name = "appearance_dttm")
    @NotNull
    private Timestamp appearanceDttm;

    @Column(name = "recovery_dt")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private Date recoveryDt;
}
