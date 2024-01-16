package cc.taketo.test;

import cc.taketo.entity.User;

import java.lang.reflect.RecordComponent;

public class UserTest {

    @org.junit.jupiter.api.Test
    public void printUser(){
        User user = new User("张三",18,"男","123456@gmail.com");

        // User[name=张三, age=18, gender=男, email=123456@gmail.com]
        System.out.println(user);

        // name
        System.out.println(user.name());
    }

    @org.junit.jupiter.api.Test
    public void recordFunction(){
        User user = new User("张三",18,"男","123456@gmail.com");
        boolean record = user.getClass().isRecord();
        System.out.println("isRecord = " + record);

        RecordComponent[] recordComponents = user.getClass().getRecordComponents();
        for (RecordComponent recordComponent : recordComponents) {
            System.out.println("recordComponent = " + recordComponent);
        }

    }
}
