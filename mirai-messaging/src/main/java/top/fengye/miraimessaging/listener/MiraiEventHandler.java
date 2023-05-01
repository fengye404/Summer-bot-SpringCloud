package top.fengye.miraimessaging.listener;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.SimpleListenerHost;
import net.mamoe.mirai.event.events.MessageEvent;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: 風楪
 * @date: 2023/5/2 6:01
 */
@Component
public class MiraiEventHandler extends SimpleListenerHost {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @EventHandler
    public void onMessage(@NotNull MessageEvent event){

    }
}
