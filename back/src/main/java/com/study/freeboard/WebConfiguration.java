package com.study.freeboard;

import com.study.freeboard.validator.MemberValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Bean
    public MemberValidator memberValidator() {
        return new MemberValidator();
    }
}
