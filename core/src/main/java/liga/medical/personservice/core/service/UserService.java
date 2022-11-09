package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.entity.User;
import liga.medical.personservice.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User getUserByLogin(String login) {
        return repository.findByLogin(login);
    }
}
