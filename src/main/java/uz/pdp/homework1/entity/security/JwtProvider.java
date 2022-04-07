package uz.pdp.homework1.entity.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import uz.pdp.homework1.entity.Role;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Set;

@Component
public class JwtProvider {
    private static final long expireTime = 1000 * 3600 * 24;
    private static final String key = "secretKey01032020";

    public String generatedToken(String userName, Set<Role> roles) {
        Date expiredTime = new Date(System.currentTimeMillis() + expireTime);

        String token = Jwts
                .builder()
                .setSubject(userName)
                .setIssuedAt(new Date())
                .setExpiration(expiredTime)
                .signWith(SignatureAlgorithm.HS512, key)
                .claim("roles", roles)
                .compact();
        return token;
    }

    public String validatedToken(String token){
        try {
            return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody().getSubject();
        }catch (Exception e){
            return null;
        }

    }
}
