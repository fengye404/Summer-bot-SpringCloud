package top.fengye.miraimessaging;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiraiMessagingApplicationTests {

    @Test
    void contextLoads() {

    }


    @Test
    void rocketMQTest(){
        DefaultMQProducer producer = new DefaultMQProducer("testProducer");
    }

}
