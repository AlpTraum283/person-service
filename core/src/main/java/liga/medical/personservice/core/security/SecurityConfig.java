package liga.medical.personservice.core.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static liga.medical.personservice.core.settings.Roles.ADMIN;
import static liga.medical.personservice.core.settings.Roles.USER;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private JwtFilter jwtFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/person/**", "/address/**", "/contact/**", "/illness/**", "medicalCard/**").hasAnyAuthority(ADMIN.toString(), USER.toString())
                .antMatchers(HttpMethod.POST, "/person/**", "/address/**", "/contact/**", "/illness/**", "medicalCard/**").hasAuthority(ADMIN.toString())
                .antMatchers(HttpMethod.PUT, "/person/**", "/address/**", "/contact/**", "/illness/**", "medicalCard/**").hasAuthority(ADMIN.toString())

                .antMatchers(HttpMethod.GET, "/auth/login").permitAll()
                .and()
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
