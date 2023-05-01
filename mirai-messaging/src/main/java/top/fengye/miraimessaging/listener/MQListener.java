package top.fengye.miraimessaging.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author: 風楪
 * @date: 2023/5/2 6:03
 */
@Component
@RocketMQMessageListener(consumerGroup = "summerbot",topic = "summerbot")
public class MQListener implements RocketMQListener<MQMessage> {
    @Override
    public void onMessage(MQMessage message) {

    }
}
