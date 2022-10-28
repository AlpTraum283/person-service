package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.Contact;
import liga.medical.personservice.core.repository.ContactMapper;
import liga.medical.personservice.core.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactRepository repository;
    @Autowired
    ContactMapper mapper;

    public List<Contact> getContacts() {
        return repository.findAll();
    }
    public List<Contact> getContactsMyBatis() {
        return mapper.getContactsMyBatis();
    }
}
