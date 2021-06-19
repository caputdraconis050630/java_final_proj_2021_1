package kr.ac.inha.mapper;

import kr.ac.inha.vo.MemberVO;

public interface MemberMapper {
	public void memberJoin(MemberVO member);
	
	public MemberVO memberLogin(MemberVO member);
	
	public void memberUpdate(MemberVO member, String session_id);
}
