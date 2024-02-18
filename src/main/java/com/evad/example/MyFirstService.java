package com.evad.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;


    public MyFirstService(
            MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String teeAStory(){
        return " the dependency is saying : " + myFirstClass.sayHello();
    }
}
