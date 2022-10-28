package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.MedicalCard;
import liga.medical.personservice.core.repository.MedicalCardMapper;
import liga.medical.personservice.core.repository.MedicalCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCardService {
    @Autowired
    MedicalCardRepository repository;
    @Autowired
    MedicalCardMapper mapper;

    public List<MedicalCard> getMedicalCards(){
        return repository.findAll();
    }
    public List<MedicalCard> getMedicalCardsMyBatis(){
        return mapper.getMedicalCardMyBatis();
    }
}
