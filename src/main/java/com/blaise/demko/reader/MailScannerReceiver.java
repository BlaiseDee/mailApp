package com.blaise.demko.reader;


import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class MailScannerReceiver {

    @Inject
    private MailScanner mailScanner;


    public void testInject(){
        System.out.println(mailScanner.getName());
    }


}
