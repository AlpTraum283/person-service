package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.entity.Illness;
import liga.medical.personservice.core.repository.IllnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IllnessService {
    @Autowired
    IllnessRepository repository;

    public Optional<Illness> getIllnessById(Long id) {
        return repository.findById(id);
    }
}
