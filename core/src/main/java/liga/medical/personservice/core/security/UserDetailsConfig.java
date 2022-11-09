package liga.medical.personservice.core.security;

import liga.medical.personservice.core.model.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class UserDetailsConfig implements UserDetails {

    private String password;
    private String login;
    private String userId;
    private Collection<? extends GrantedAuthority> grantedAuthorities;

    public static UserDetailsConfig convertUserToUserDetailsConfig(User user) {
        UserDetailsConfig userDetailsConfig = new UserDetailsConfig();
        userDetailsConfig.password = user.getPassword();
        userDetailsConfig.login = user.getLogin();
        userDetailsConfig.userId = String.valueOf(user.getId());
        userDetailsConfig.grantedAuthorities = Collections.singletonList(
                new SimpleGrantedAuthority(user.getRole())
        );
        return userDetailsConfig;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return grantedAuthorities;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
