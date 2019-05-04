package com.kyexpress.ec.springboot_ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

/**
 * Copyright (c) 2019 KYE Company
 * 跨越速运集团有限公司版权所有
 *
 * @author xiejiqing
 * @create 2019/5/4 15:41
 */
@Service
public class SpringTaskService {

    @Autowired
    JavaMailSender javaMailSender;

    @Async//标注为异步方法
    @Scheduled(cron="0 4 16 * * ?")
    public void send(){
        try {
            MimeMessage mimeMessage=javaMailSender.createMimeMessage();
            MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
            //邮件设置
            helper.setFrom("2366562298@qq.com");
            helper.setTo("xjq111006@163.com");
            helper.setSubject("任务邮件测试");
            helper.setText("这是一封带有附件的邮件");
            helper.addAttachment("刘亦菲.jpg",new File("C:\\Users\\xiejiqing\\Desktop\\刘亦菲.jpg"));
            javaMailSender.send(mimeMessage);
            System.out.println("邮件发送成功！");
        } catch (MessagingException e) {
            System.out.println("发送邮件失败！");
        }
    }
}
