package sesvdev.api;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sesvdev.service.KafkaProducerService;

@RestController
@AllArgsConstructor
@Slf4j
public class MessageController {

   private KafkaProducerService kafkaProducerService;

   @PostMapping("/send")
    public void sendMessage(@RequestParam("message") String message) {
        kafkaProducerService.sendMessage(message);
        log.info("Sent message: {}", message);
    }
}
