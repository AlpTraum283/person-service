package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.entity.Contact;
import liga.medical.personservice.core.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    ContactRepository repository;

    public Optional<Contact> getContactById(Long id) {
        return repository.findById(id);
    }
}
