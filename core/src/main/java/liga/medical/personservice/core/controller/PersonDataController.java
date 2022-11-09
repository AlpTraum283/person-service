package liga.medical.personservice.core.controller;

import liga.medical.common.dto.annotations.DbLog;
import liga.medical.personservice.core.model.dto.PersonDataDto;
import liga.medical.personservice.core.service.PersonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonDataController {
    @Autowired
    PersonDataService service;

    @GetMapping("/{id}")
    @DbLog
    public PersonDataDto buildPersonDataDtoById(@PathVariable Long id) {
        return service.buildPersonDataDtoById(id);
    }
}
