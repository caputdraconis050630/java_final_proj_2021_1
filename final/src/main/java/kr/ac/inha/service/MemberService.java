package kr.ac.inha.service;

import kr.ac.inha.vo.MemberVO;

public interface MemberService {
	public void memberJoin(MemberVO member) throws Exception;
	
	public MemberVO memberLogin(MemberVO member) throws Exception;
	
	public void memberUpdate(MemberVO member, String session_id) throws Exception;
}
