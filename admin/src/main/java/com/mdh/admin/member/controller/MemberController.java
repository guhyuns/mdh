package com.mdh.admin.member.controller;

import com.mdh.core.member.service.MemberService;
import com.mdh.core.member.service.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberController.class);

	@Resource(name = "memberService")
	private MemberService memberService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(@ModelAttribute("memberVO") MemberVO memberVO, Model model) {

		List<MemberVO> result = memberService.selectMemberAllList(memberVO);

		model.addAttribute("result", result);

		return "member/list";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(@ModelAttribute("memberVO") MemberVO memberVO, Model model) {
		return "member/insert";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertProc(@ModelAttribute("memberVO") MemberVO memberVO, Model model) {

		memberService.insertMember(memberVO);

		return "member/insert";
	}

}
