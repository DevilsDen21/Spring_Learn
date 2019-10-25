package com.udamy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/udamy/beans/beans.xml");
        SubjectClass subjectClass = (SubjectClass) context.getBean("subjectClass");
        System.out.println(subjectClass);
    }
}
