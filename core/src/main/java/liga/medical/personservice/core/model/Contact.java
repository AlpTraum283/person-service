package liga.medical.personservice.core.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private BigInteger id;

    @Column(name = "phone_number")
    @NotNull
    private BigInteger phoneNumber;

    @NotNull
    private String email;

    @Column(name = "profile_link")
    @NotNull
    private String profileLink;
}
