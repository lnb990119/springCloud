package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        String a = "hello";
        String b = "he" + new String("llo");
        System.out.println(a == b);

        Thread t = new Thread() {
          public void  run() {
                pong();
          }
        };
        t.run();
        System.out.println("ping");
    }
    static void pong() {
        System.out.println("pong");
    }

}
