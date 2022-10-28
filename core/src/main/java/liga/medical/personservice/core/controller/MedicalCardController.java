package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.MedicalCard;
import liga.medical.personservice.core.service.MedicalCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MedicalCardController {
    @Autowired
    MedicalCardService service;

    @GetMapping("/medicalcard")
    public List<MedicalCard> getMedicalCards() {
        return service.getMedicalCards();
    }

    @GetMapping("/medicalcardbatis")
    public List<MedicalCard> getMedicalCardsBatis() {
        return service.getMedicalCardsMyBatis();
    }
}
