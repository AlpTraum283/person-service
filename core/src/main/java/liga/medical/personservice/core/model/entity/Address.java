package liga.medical.personservice.core.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private Long id;

    @Column(name = "contact_id")
    @NotNull
    private Long contactId;

    @Column(name = "country_id")
    @NotNull
    private Long countryId;

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
