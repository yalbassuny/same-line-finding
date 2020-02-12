package com.restoratio.monaco.ruletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan
public class RuleTestApp {

    private List<String> sample1;
    private List<String> sample2;


    public void nonCompliantFail() {
        if (sample1.size() == 0 || sample2.size() == 0) {
                System.out.println("Found empty collections");
        }


    }

    public static void main(String[] args) {

        new RuleTestApp().nonCompliantFail();

        SpringApplication.run(RuleTestApp.class, args);
    }

}
