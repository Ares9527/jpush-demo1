package com.jpushdemo;

import com.jpushdemo.sevice.MyJPushClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JPushApplicationTests {

    @Autowired
    private MyJPushClient jPushClient;

    @Test
    public void testJPush() {
        List<String> aliasList = Arrays.asList("239");
        String notificationTitle = "notification_title";
        String msgTitle = "msg_title";
        String msgContent = "msg_content";
        jPushClient.sendToAliasList(aliasList, notificationTitle, msgTitle, msgContent, "exts");
    }
}
