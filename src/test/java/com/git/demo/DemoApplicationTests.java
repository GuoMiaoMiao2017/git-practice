package com.git.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    class User {
        private String name;
        private long age;
        public User(String name, long age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public long getAge() {
            return age;
        }
        public void setAge(long age) {
            this.age = age;
        }
    }

    @Test
    public void ArrayTest() {

        long[] a ={20,80,30};
//        int []b={10,20,30};
        Arrays.sort(a);

        User user1 = new User("daxiong", 8);
        User user2 = new User("ermiao", 9);
        User user3 = new User("张三", 23);
        User user4 = new User("李四", 45);
        User user5 = new User("王五", 2);
        User user6 = new User("赵六", 34);
        User[] user = {user1, user2, user3, user4, user5, user6};
        Arrays.sort(user);
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i]);
        }

    }

}
