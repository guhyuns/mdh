package com.mdh.admin.main.controller;

import com.mdh.core.main.service.MainService;
import com.mdh.core.main.service.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017-05-03.
 */
@Controller
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

	@Resource(name = "mainService")
	private MainService mainService;

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public String main(Model model) {

		List<UserVO> userVOList = mainService.selectUserList();

		//model.addAttribute("userVOList", userVOList);0
		return "member/list";
	}

}
