package liga.medical.personservice.core.security;

import liga.medical.personservice.core.model.entity.User;
import liga.medical.personservice.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceConfig implements UserDetailsService {
    @Autowired
    UserService service;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = service.getUserByLogin(login);
        return UserDetailsConfig.convertUserToUserDetailsConfig(user);
    }
}
