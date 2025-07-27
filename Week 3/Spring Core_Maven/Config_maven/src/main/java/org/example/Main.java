package org.example;

import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Call method
        bookService.addBook("The Catcher in the Rye");
        System.out.println("The Creation and Configuration of Maven Project was Done");

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
    }
}