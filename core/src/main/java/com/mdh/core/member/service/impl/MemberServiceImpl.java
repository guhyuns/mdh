package com.mdh.core.member.service.impl;

import com.mdh.core.member.service.MemberService;
import com.mdh.core.member.service.MemberVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017-05-13.
 */
@Service(value = "memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name = "memberMapper")
	private MemberMapper memberMapper;

	@Override
	public List<MemberVO> selectMemberAllList(MemberVO memberVO) {
		return memberMapper.selectMemberAllList(memberVO);
	}

	@Override
	public int insertMember(MemberVO memberVO) {
		return memberMapper.insertMember(memberVO);
	}

}
