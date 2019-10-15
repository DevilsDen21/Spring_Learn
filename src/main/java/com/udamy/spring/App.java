package com.udamy.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        Second second = (Second) context.getBean("second");
        second.print();
    }
}
