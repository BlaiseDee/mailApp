package com.blaise.demko.reader;

import org.springframework.scheduling.annotation.Scheduled;

public class MailScanner {

    @Scheduled(fixedRate = 5000)
    public void scanMail() {
        System.out.println("fafafafa");
    }

    private String name;

    public MailScanner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
