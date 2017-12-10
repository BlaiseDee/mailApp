package com.blaise.demko.reader;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Configuration
public class AppConfig {

    @Bean
    public MailScanner mailScanner() {
        return new MailScanner("skaner blaisa");
    }


/*    @Bean
    public IntegrationFlow mailListener() {
        return IntegrationFlows.from(Mail.imapInboundAdapter("imaps://[username]:[password]@imap.gmail.com/INBOX")
                        .shouldDeleteMessages(true).get(),
                e -> e.poller(Pollers.fixedRate(5000).maxMessagesPerPoll(1)))
                .<Message>handle((payload, header) -> logMail(payload))
                .get();
    }*/



}
