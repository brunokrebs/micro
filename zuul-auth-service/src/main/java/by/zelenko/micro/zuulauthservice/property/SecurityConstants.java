package by.zelenko.micro.zuulauthservice.property;

public class SecurityConstants {
    public static final String SECRET = "SecretKey";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/gateway/user/sign-up/**";
}
