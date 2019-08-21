package com.xihua.weixiao;

import com.xihua.weixiao.dao.ChatMapper;
import com.xihua.weixiao.dao.UserMapper;
import com.xihua.weixiao.query.ChatQuery;
import com.xihua.weixiao.service.UserService;
import com.xihua.weixiao.vo.request.LoginRequest;
import com.xihua.weixiao.vo.response.ChatResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeixiaoApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setUserTel("111111111");
		loginRequest.setUserPassword("3333332");
		userService.telLogin(loginRequest);
	}

	@Autowired
	private ChatMapper chatMapper;
	@Test
	public void mapperTest(){
		ChatQuery chatQuery = new ChatQuery();
		chatQuery.setSendId(1);
		chatQuery.setReceiveId(9);
		List<ChatResponse> chatResponses = chatMapper.selectChatContent(chatQuery);
		chatResponses.forEach(chatResponse ->
				System.out.println(chatResponse));
	}

}
