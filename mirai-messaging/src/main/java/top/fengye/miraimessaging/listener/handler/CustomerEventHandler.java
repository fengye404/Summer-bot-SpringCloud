package top.fengye.miraimessaging.listener.handler;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.SimpleListenerHost;
import net.mamoe.mirai.event.events.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author: 風楪
 * @date: 2023/4/17 0:55
 */
@Component
public class CustomerEventHandler extends SimpleListenerHost {

    @EventHandler
    public void onMessage(@NotNull MessageEvent event){

    }
}
