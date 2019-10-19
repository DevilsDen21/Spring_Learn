package com.udamy.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/udamy/beans/beans.xml");
        Second second = (Second) context.getBean("second");
        Second second1 = (Second) context.getBean("second");
        second.print();
        second1.setEmpId(222);
        System.out.println(second);
        System.out.println(second1);
    }
}
