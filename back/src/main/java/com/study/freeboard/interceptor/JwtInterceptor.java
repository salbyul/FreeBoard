package com.study.freeboard.interceptor;

import com.study.freeboard.service.JwtTokenService;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.security.SignatureException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
@RequiredArgsConstructor
public class JwtInterceptor implements HandlerInterceptor {

    private final JwtTokenService jwtTokenService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("[JwtInterceptor PreHandle]");
        try {
            String token = extractToken(request);
            String userId = jwtTokenService.getUserId(token);
            request.setAttribute("userId", userId);
        } catch (NullPointerException e) {
            log.error("NullPointerException");
            request.getRequestDispatcher("/api/errors/token/null").forward(request, response);
            return false;
        } catch (ExpiredJwtException e) {
            log.error("Expired Token");
            request.getRequestDispatcher("/api/errors/token/expiration").forward(request, response);
            return false;
        } catch (MalformedJwtException e) {
            log.error("MalformedJwtException");
            request.getRequestDispatcher("/api/errors/token/malformed").forward(request, response);
            return false;
        } catch (SignatureException e) {
            log.error("SignatureException");
            request.getRequestDispatcher("/api/errors/token/signature").forward(request, response);
            return false;
        } catch (Exception e) {
            log.error("정의되지 않은 토큰 오류");
            e.printStackTrace();
            request.getRequestDispatcher("/api/errors/token/unknown").forward(request, response);
            return false;
        }
        return true;
    }

    private String extractToken(HttpServletRequest request) {
        String authorization = request.getHeader("authorization");
        if (authorization == null) {
            throw new NullPointerException();
        }
        return authorization.split(" ")[1];
    }
}
