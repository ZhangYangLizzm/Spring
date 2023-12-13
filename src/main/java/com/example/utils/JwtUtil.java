package com.example.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtil {
    private static final String jwtSecretKey = "example";

    public static String generateToken(Map<String, Object> claims) {
        return JWT.create()
                .withClaim("user", claims)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                .sign(Algorithm.HMAC256(jwtSecretKey));
    }

    public static Map<String, Object> parseToken(String token) {
        return JWT.require(Algorithm.HMAC256(jwtSecretKey))
               .build()
               .verify(token)
               .getClaim("user")
               .asMap();
    }
}
