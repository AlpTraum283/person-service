package liga.medical.personservice.core.controller;

import liga.medical.common.dto.annotations.DbLog;
import liga.medical.personservice.core.model.entity.MedicalCard;
import liga.medical.personservice.core.repository.MedicalCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicalCard")
public class MedicalCardController {
    @Autowired
    MedicalCardRepository repository;

    @PutMapping
    @DbLog
    public MedicalCard updateMedicalCard(MedicalCard medicalCard) {
        return repository.save(medicalCard);
    }

    @PostMapping
    @DbLog
    public MedicalCard saveMedicalCard(MedicalCard medicalCard) {
        return repository.save(medicalCard);
    }
}
