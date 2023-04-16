package top.fengye.miraimessaging.bot;

import lombok.extern.slf4j.Slf4j;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.event.EventKt;
import net.mamoe.mirai.event.events.BotOnlineEvent;
import net.mamoe.mirai.utils.BotConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import top.fengye.miraimessaging.listener.handler.CustomerEventHandler;

/**
 * @author: 風楪
 * @date: 2023/4/17 0:42
 */
@Component
@Slf4j
public class QQbot {
    @Value("${bot.username}")
    public Long username;
    @Value("${bot.password}")
    public String password;
    @Autowired
    private CustomerEventHandler customerEventHandler;

    private static Bot bot;

    public static Bot getBot() {
        return bot;
    }

    //设备认证信息文件
    private static final String deviceInfo = "device.json";

    /**
     * 启动BOT
     */
    public void startBot() {
        if (null == username || null == password) {
            log.warn("*****未配置账号或密码*****");
        }
        bot = BotFactory.INSTANCE.newBot(username, password, new BotConfiguration() {
            {
                //保存设备信息到文件deviceInfo.json文件里相当于是个设备认证信息
                fileBasedDeviceInfo(deviceInfo);
                setProtocol(MiraiProtocol.ANDROID_PHONE); // 切换协议
            }
        });
        bot.login();

        //添加监听器
        bot.getEventChannel().registerListenerHost(customerEventHandler);

        //广播登录事件
        EventKt.broadcast(new BotOnlineEvent(bot));
    }
}
