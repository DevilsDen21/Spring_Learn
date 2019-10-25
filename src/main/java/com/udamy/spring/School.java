package com.udamy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/udamy/beans/beans.xml");
        SubjectClass mathClass = (SubjectClass) context.getBean("mathClass");
        SubjectClass physicsClass = (SubjectClass) context.getBean("physicsClass");
        System.out.println(mathClass);
        System.out.println(physicsClass);
    }
}
