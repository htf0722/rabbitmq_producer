package com.htf.rabbitmq_producer.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：贺天峰
 * @date ：Created in 2019/6/10 15:22
 * @description：主题模式
 * @modified By：修改人
 * @version: $
 */
@Controller
public class TopicProducer {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping("sendTopicValue")
    @ResponseBody
    public String sendTopicValue(){
        rabbitTemplate.convertAndSend("topicExchange","video.test","主题模式发布一条消息");
        return "ok";
    }
    @RequestMapping("sendTopicValue2")
    @ResponseBody
    public String sendTopicValue2(){
        rabbitTemplate.convertAndSend("topicExchange","content.log","主题模式发布一条消息");
        return "ok";
    }
    @RequestMapping("sendTopicValue3")
    @ResponseBody
    public String sendTopicValue3(){
        rabbitTemplate.convertAndSend("topicExchange","video.log","主题模式发布一条消息");
        return "ok";
    }
}
