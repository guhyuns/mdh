package com.mdh.core.member.service.impl;

import com.mdh.core.member.service.MemberVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017-05-13.
 */
@Repository(value = "memberMapper")
public interface MemberMapper {

	List<MemberVO> selectMemberAllList(MemberVO memberVO);

	int insertMember(MemberVO memberVO);

}
