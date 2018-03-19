package com.mdh.core.member.service;

import java.util.List;

/**
 * Created by Administrator on 2017-05-13.
 */
public interface MemberService {

	List<MemberVO> selectMemberAllList(MemberVO memberVO);

	int insertMember(MemberVO memberVO);

}
