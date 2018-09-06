package com.ris.rimsetting;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        try {
            new SpringApplicationBuilder(Application.class).web(false).run(args);
            new CountDownLatch(1).await();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
