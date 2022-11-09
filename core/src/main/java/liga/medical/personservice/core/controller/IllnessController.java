package liga.medical.personservice.core.controller;

import liga.medical.common.dto.annotations.DbLog;
import liga.medical.personservice.core.model.entity.Illness;
import liga.medical.personservice.core.repository.IllnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/illness")
public class IllnessController {
    @Autowired
    IllnessRepository repository;

    @PutMapping
    @DbLog
    public Illness updateIllness(Illness illness) {
        return repository.save(illness);
    }

    @PostMapping
    @DbLog
    public Illness saveIllness(Illness illness) {
        return repository.save(illness);
    }
}
