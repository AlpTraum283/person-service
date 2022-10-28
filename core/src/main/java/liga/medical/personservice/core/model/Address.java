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
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private BigInteger id;

    @Column(name = "contact_id")
    @NotNull
    private BigInteger contactId;

    @Column(name = "country_id")
    @NotNull
    private BigInteger countryId;

    @NotNull
    private String city;

    @NotNull
    private Integer index;

    @NotNull
    private String street;

    @NotNull
    private String building;

    @NotNull
    private String flat;
}
