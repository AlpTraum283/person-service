package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.service.PersonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonDataController {
    @Autowired
    PersonDataService service;

    @GetMapping("/person")
    public List<PersonData> getPersonData() {
        return service.getPersonData();
    }

    @GetMapping("/personbatis")
    public List<PersonData> getPersonDataBatis() {
        return service.getPersonDataMyBatis();
    }
}
