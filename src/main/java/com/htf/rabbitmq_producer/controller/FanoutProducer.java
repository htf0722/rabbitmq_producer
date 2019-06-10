package com.htf.rabbitmq_producer.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：贺天峰
 * @date ：Created in 2019/6/10 15:08
 * @description：分裂模式
 * @modified By：修改人
 * @version: $
 */
@Controller
public class FanoutProducer {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping("testSendFanout")
    @ResponseBody
    public String testSendFanout(){
        //1、交换机名字  2、不需要写routingkey，因为会往三个里面都发，所以不需要指定某个  3、发送的消息
        rabbitTemplate.convertAndSend("testExchange","", "分列模式走起");
        return "ok";
    }
}
