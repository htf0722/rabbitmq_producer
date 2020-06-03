package com.htf.rabbitmq_producer.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：贺天峰
 * @date ：Created in 2019/6/10 14:41
 * @description：直接模式
 * @modified By：修改人
 * @version: $
 *
 */
@Controller
public class DirectProducer {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping("testSend")
    @ResponseBody
    public String testSend(){
        String name = "123";
        String name2 = "321";
        rabbitTemplate.convertAndSend("test","测试一条消息");
        return "ok";
    }
}
