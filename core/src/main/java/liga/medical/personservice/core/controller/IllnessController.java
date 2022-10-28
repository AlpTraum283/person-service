package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.Illness;
import liga.medical.personservice.core.service.IllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IllnessController {
    @Autowired
    IllnessService service;

    @GetMapping("/illness")
    public List<Illness> getIllnesses() {
        return service.getIllnesses();
    }

    @GetMapping("/illnessbatis")
    public List<Illness> getIllnessesBatis() {
        return service.getIllnessesMyBatis();
    }
}
