package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapper.IllnessMapper;
import liga.medical.personservice.core.model.Illness;
import liga.medical.personservice.core.repository.IllnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllnessService {
    @Autowired
    IllnessRepository repository;
    @Autowired
    IllnessMapper mapper;

    public List<Illness> getIllnesses() {
        return repository.findAll();
    }

    public List<Illness> getIllnessesMyBatis() {
        return mapper.getIllnessesMyBatis();
    }
}
