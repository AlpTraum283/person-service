package liga.medical.personservice.core.controller;


import liga.medical.common.dto.annotations.DbLog;
import liga.medical.personservice.core.model.entity.User;
import liga.medical.personservice.core.security.JwtProvider;
import liga.medical.personservice.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    UserService service;

    @GetMapping("/login")
    @DbLog
    public String login(@RequestHeader("Authorization") String loginPasswordBase64) {
        String tmp = loginPasswordBase64.replace("Basic ", "");
        String[] credentials = new String(Base64.getDecoder().decode(tmp.getBytes()), UTF_8).split(":");
        User user = service.getUserByLogin(credentials[0]);
        String userPassword = new String(Base64.getDecoder().decode(user.getPassword().getBytes()), UTF_8);
        if (user != null && userPassword.equals(credentials[1])) {
            return new JwtProvider().generateToken(credentials[0]);
        }
        return null;
    }
}
