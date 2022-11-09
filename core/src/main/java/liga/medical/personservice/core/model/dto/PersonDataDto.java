package liga.medical.personservice.core.model.dto;

import liga.medical.personservice.core.model.entity.PersonData;
import liga.medical.personservice.core.model.entity.Address;
import liga.medical.personservice.core.model.entity.Contact;
import liga.medical.personservice.core.model.entity.Illness;
import liga.medical.personservice.core.model.entity.MedicalCard;
import lombok.Data;

@Data
public class PersonDataDto {

    private PersonData personData;

    private Address address;

    private Contact contact;

    private Illness illness;

    private MedicalCard medicalCard;

    public PersonData getPersonData() {
        return personData;
    }

    public void setPersonData(PersonData personData) {
        this.personData = personData;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }
}
