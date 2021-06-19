package kr.ac.inha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.inha.mapper.MemberMapper;
import kr.ac.inha.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberMapper membermapper;
	
	
	@Override
	public void memberJoin(MemberVO member) throws Exception{
		membermapper.memberJoin(member);
	}
	
	@Override
	public MemberVO memberLogin(MemberVO member) throws Exception{
		return membermapper.memberLogin(member);
	}
	
	@Override
	public void memberUpdate(MemberVO member, String session_id) throws Exception{
		membermapper.memberUpdate(member, session_id);
	}
}
