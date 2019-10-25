package com.udamy.spring;

public class SubjectClass {
    private int startTime;
    private int endTime;
    private String subject;

    public SubjectClass(){}
    public SubjectClass(int startTime, int endTime, String subject){
        this.startTime = startTime;
        this.endTime = endTime;
        this.subject = subject;
    }

    @Override
    public String toString(){
        return subject + " Class will begin at "+ startTime + " and it will end at "+ endTime;
    }
}
