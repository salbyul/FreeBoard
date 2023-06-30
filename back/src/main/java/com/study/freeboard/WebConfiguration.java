package com.study.freeboard;

import com.study.freeboard.encryptor.Encryptor;
import com.study.freeboard.encryptor.SHA256Encryptor;
import com.study.freeboard.interceptor.JwtInterceptor;
import com.study.freeboard.validator.MemberValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class WebConfiguration implements WebMvcConfigurer {

    private final JwtInterceptor jwtInterceptor;

    @Bean
    public MemberValidator memberValidator() {
        return new MemberValidator();
    }

    @Bean
    public Encryptor encryptor() {
        return new SHA256Encryptor();
    }

    /**
     * JwtInterceptor
     * 토큰 검증 인터셉터 등록
     *
     * @param registry registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor)
                .order(1)
                .addPathPatterns("/");
    }
}
