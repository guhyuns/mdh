package com.mdh.core.main.service.impl;

import com.mdh.core.main.service.MainService;
import com.mdh.core.main.service.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017-05-02.
 */
@Service(value = "mainService")
public class MainServiceImpl implements MainService {

	@Resource(name = "mainMapper")
	private MainMapper mainMapper;

	@Override
	public List<UserVO> selectUserList() {
		return mainMapper.selectUserList();
	}
}
