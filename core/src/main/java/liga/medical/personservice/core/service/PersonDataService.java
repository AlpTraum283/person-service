package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.dto.PersonDataDto;
import liga.medical.personservice.core.model.entity.Address;
import liga.medical.personservice.core.model.entity.Contact;
import liga.medical.personservice.core.model.entity.Illness;
import liga.medical.personservice.core.model.entity.MedicalCard;
import liga.medical.personservice.core.model.entity.PersonData;
import liga.medical.personservice.core.repository.AddressRepository;
import liga.medical.personservice.core.repository.ContactRepository;
import liga.medical.personservice.core.repository.IllnessRepository;
import liga.medical.personservice.core.repository.MedicalCardRepository;
import liga.medical.personservice.core.repository.PersonDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PersonDataService {
    @Autowired
    PersonDataRepository personDataRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    ContactRepository contactRepository;
    @Autowired
    IllnessRepository illnessRepository;
    @Autowired
    MedicalCardRepository medicalCardRepository;

    public PersonDataDto buildPersonDataDtoById(Long id) {
        PersonDataDto personDataDto = new PersonDataDto();
        Optional<PersonData> personData = personDataRepository.findById(id);
        Optional<MedicalCard> medicalCard = medicalCardRepository.findById(personData.get().getMedicalCardId());
        Optional<Contact> contact = contactRepository.findById(personData.get().getContactId());
        Address address = addressRepository.findByContactId(contact.get().getId());
        Illness illness = illnessRepository.getByMedicalCardId(medicalCard.get().getId());
        personDataDto.setPersonData(personData.get());
        personDataDto.setAddress(address);
        personDataDto.setContact(contact.get());
        personDataDto.setIllness(illness);
        personDataDto.setMedicalCard(medicalCard.get());
        return personDataDto;
    }
}
