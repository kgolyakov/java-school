/*
package classwork.lab2.mail;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.util.Random;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        design_patterns.never_use_switch.MailSender mailSender = new design_patterns.never_use_switch.MailSender();
        Faker faker = new Faker();
        Random random = new Random();
        while (true) {
            MailInfo mailInfo = MailInfo.builder()
                    .context(faker.chuckNorris().fact())
                    .mailType(random.nextInt(2) + 1)
                    .build();

            mailSender.send(mailInfo);
            Thread.sleep(2000);
        }
    }
}
*/
