package com.study.freeboard.service;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Slf4j
@Service
public class JwtTokenService {

    //    SHA-256으로 암호화
    private final Key key;
    //    토근 만료시간: 생성시간 + 30분
    private final long validTime = 30 * 60 * 1000L;

    public JwtTokenService(@Value("${jwt.secret}") String secretKey) {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        this.key = Keys.hmacShaKeyFor(keyBytes);
    }

    /**
     * JWT Token을 생성한다.
     * 만료기간: 생성시간 + 30분
     * body에 userId 주입
     * 알고리즘: SHA-256
     *
     * @param userId userId
     * @return Token
     */
    public String generateToken(String userId) {
        Date now = new Date();

        Claims claims = Jwts.claims().setSubject("authorization");
//        TODO: Enum????
        claims.setAudience("user");
        claims.setIssuedAt(now);
        claims.setExpiration(new Date(now.getTime() + validTime));
        claims.put("userId", userId);

        return Jwts.builder()
                .setClaims(claims)
                .signWith(key)
                .compact();
    }

    /**
     * 토큰에서 userId를 추출해 반환한다.
     *
     * @param token Jwt Token
     * @return userId
     */
    public String getUserId(String token) {
        JwtParser build = Jwts
                .parserBuilder()
                .setSigningKey(key)
                .build();
        return (String) build.parseClaimsJws(token).getBody().get("userId");
    }
}
