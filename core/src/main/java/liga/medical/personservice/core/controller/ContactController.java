package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.Contact;
import liga.medical.personservice.core.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactService service;

    @GetMapping("/contact")
    public List<Contact> getContacts() {
        return service.getContacts();
    }
    @GetMapping("/contactbatis")
    public List<Contact> getContactsBatis() {
        return service.getContactsMyBatis();
    }
}
