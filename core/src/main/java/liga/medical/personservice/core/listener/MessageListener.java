package liga.medical.personservice.core.listener;

import liga.medical.common.dto.RabbitMessageDto;
import liga.medical.personservice.core.model.entity.Signal;
import liga.medical.personservice.core.service.SignalService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;
import java.util.logging.Logger;

@Component
public class MessageListener {
    Logger logger = Logger.getLogger(String.valueOf(MessageListener.class));

    @Autowired
    SignalService service;
    @Autowired
    AmqpTemplate template;

    @RabbitListener(queues = "daily_queue")
    public void dailyQueueListener(@RequestBody RabbitMessageDto rabbitMessageDto) {
        Signal signal = buildSignal(rabbitMessageDto);
        service.saveSignal(signal);
    }

    @RabbitListener(queues = "alert_queue")
    public void alertQueueListener(@RequestBody RabbitMessageDto rabbitMessageDto) {
        Signal signal = buildSignal(rabbitMessageDto);
        service.saveSignal(signal);
    }

    private Signal buildSignal(RabbitMessageDto rabbitMessageDto) {
        Signal signal = new Signal();
        signal.setId(UUID.randomUUID().toString());
        signal.setPersonDataId(rabbitMessageDto.getId());
        signal.setType(rabbitMessageDto.getType());
        signal.setDescription(rabbitMessageDto.getDescription());
        return signal;
    }
}
