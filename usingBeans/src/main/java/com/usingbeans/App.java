package com.usingbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.print.Book;

public class App {

    public static void main(String[] args) {

        // MANAGED SPRING BEANS FACTORY
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        BookModel book = factory.getBean(BookModel.class);
        book.setDescription("Clean Code");
        book.setId("S13G3");

        AuthorModel authorModel = factory.getBean(AuthorModel.class);
        authorModel.setName("Uncle Bob");

        book.showInformations();
    }
}
