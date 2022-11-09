package liga.medical.personservice.core.settings;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Constants {
    public static final String JWT_SECRET = new String(
            Base64.getEncoder().encode("secret".getBytes(StandardCharsets.UTF_8))
    );
    public static final String AUTHORIZATION = "Authorization";
}
