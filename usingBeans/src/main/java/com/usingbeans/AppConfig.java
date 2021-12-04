package com.usingbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//CONFIG CLASS TO BEAN FACTORY
@Configuration
public class AppConfig {

    @Bean
    public BookModel getBookBean(){
        return new BookModel();
    }

    @Bean
    public AuthorModel getAuthorBean(){
        return new AuthorModel();
    }
}
