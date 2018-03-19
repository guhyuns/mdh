package com.mdh.core.member.service;

import com.AbstractApplicationContextTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2017-05-13.
 */
public class MemberServiceTest extends AbstractApplicationContextTest {

	@Resource(name = "memberService")
	private MemberService memberService;

	@Test
	public void insertMember() throws Exception {
		MemberVO memberVO = new MemberVO();

		memberVO.setMemId("1");
		memberVO.setMemUserId("guhyun");
		memberVO.setMemEmail("guhyun@guhyun.com");
		memberVO.setMemPassword("aaaa");
		memberVO.setMemUserName("정구현");
		memberVO.setMemNickname("정의사회구현");
		memberVO.setMemLevel("1");
		memberVO.setMemPoint("0");
		memberVO.setMemHomepage("www.aaa.com");
		memberVO.setMemPhone("010-1111-2222");
		memberVO.setMemBirthday("1980-01-01");
		memberVO.setMemSex("1");
		memberVO.setMemZipcode("423812");
		memberVO.setMemAddress1("경기도 광명시 광명동");
		memberVO.setMemAddress2("");
		memberVO.setMemAddress3("");
		memberVO.setMemAddress4("");
		memberVO.setMemReceiveEmail("1");
		memberVO.setMemUseNote("1");
		memberVO.setMemReceiveSms("0");
		memberVO.setMemOpenProfile("0");
		memberVO.setMemDenied("0");
		memberVO.setMemEmailCert("0");
		memberVO.setMemRegisterDatetime(new Date());
		memberVO.setMemRegisterIp("127.0.0.1");
		//memberVO.setMemLastLoginDatetime("");
		memberVO.setMemLastloginIp("");
		memberVO.setMemIsAdmin("1");
		memberVO.setMemProfileContent("");
		memberVO.setMemAdminMemo("");
		memberVO.setMemFollowing("0");
		memberVO.setMemFollowed("0");
		memberVO.setMemIcon("");
		memberVO.setMemPhoto("");

		memberService.insertMember(memberVO);
	}

}