package liga.medical.personservice.core.controller;

import liga.medical.common.dto.annotations.DbLog;
import liga.medical.personservice.core.model.entity.Contact;
import liga.medical.personservice.core.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    ContactRepository repository;

    @PutMapping
    @DbLog
    public Contact updateContact(Contact contact) {
        return repository.save(contact);
    }

    @PostMapping
    @DbLog
    public Contact saveContact(Contact contact) {
        return repository.save(contact);
    }
}
