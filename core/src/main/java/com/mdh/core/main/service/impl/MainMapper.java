package com.mdh.core.main.service.impl;

import com.mdh.core.main.service.UserVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017-05-02.
 */
@Repository(value = "mainMapper")
public interface MainMapper {

	List<UserVO> selectUserList();

}
