package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapper.PersonDataMapper;
import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.repository.PersonDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDataService {
    @Autowired
    PersonDataRepository repository;
    @Autowired
    PersonDataMapper mapper;

    public List<PersonData> getPersonData() {
        return repository.findAll();
    }

    public List<PersonData> getPersonDataMyBatis() {
        return mapper.getPersonDataMyBatis();
    }
}
