package sesvdev.service;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaProducerService {

    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "test-topic";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
