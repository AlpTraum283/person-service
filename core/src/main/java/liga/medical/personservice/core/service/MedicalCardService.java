package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.entity.MedicalCard;
import liga.medical.personservice.core.repository.MedicalCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalCardService {
    @Autowired
    MedicalCardRepository repository;

    public Optional<MedicalCard> getMedicalCardById(Long id) {
        return repository.findById(id);
    }
}
