package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.entity.Signal;
import liga.medical.personservice.core.repository.SignalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignalService {
    @Autowired
    SignalRepository repository;

    public Signal saveSignal(Signal signal) {

        return repository.save(signal);
    }
}
