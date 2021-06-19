package kr.ac.inha.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.ac.inha.service.MemberService;
import kr.ac.inha.vo.MemberVO;

@Controller
public class MemberController {
	
	private static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberService memberservice;
	
	@RequestMapping("/welcome.do")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
	@RequestMapping("/member/addMember.do")
	public ModelAndView addMember() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/addMember");
		return mv;
	
	}
	
	@RequestMapping("/member/login.do")
	public ModelAndView loginMember() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/loginMember");
		return mv;
	
	}
	
	@RequestMapping("/member/updateMember.do")
	public ModelAndView updateMember() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/updateMember");
		return mv;
	
	}
	
	@RequestMapping("/member/processAddMember.do")
	public String joinPOST(MemberVO member) throws Exception{
		Logger.info("join 진입");
		System.out.println(member.getUserId());
		memberservice.memberJoin(member);
		
		Logger.info("join Service 성공");
		
		return "redirect:/welcome.do";
		}
	
	@RequestMapping("/member/processLogin.do")
	public String loginPOST(HttpServletRequest request, MemberVO member, RedirectAttributes rttr) throws Exception{
        
        //System.out.println("login 메서드 진입");
        System.out.println("전달된 데이터 : " + member);
        HttpSession session = request.getSession();
        MemberVO lvo = memberservice.memberLogin(member);
        System.out.println(lvo);
        if(lvo == null) {                                // 일치하지 않는 아이디, 비밀번호 입력 경우
            
            int result = 0;
            rttr.addFlashAttribute("result", result);
            return "redirect:/welcome.do";
            
        }
        
        session.setAttribute("member", lvo);   
        System.out.println("login 메서드 끝");
        return "redirect:/welcome.do";
        
    }
	
	@RequestMapping("/member/logout.do")
	public String logoutMainGET(HttpServletRequest request) throws Exception{
		Logger.info("logoutMainGET메서드 진입");
        
        HttpSession session = request.getSession();
        
        session.invalidate();
        
        return "redirect:/welcome.do";   
	}
	
	@RequestMapping("/member/processUpdateMember.do")
	public String updateMemberPOST(HttpSession session, MemberVO member) throws Exception{
		MemberVO session_member = (MemberVO)session.getAttribute("member");
		System.out.println(session_member.getUserId());
		Logger.info("update member 진입");
		memberservice.memberUpdate(member, session_member.getUserId());
		Logger.info("update member 성공");
		
		return "redirect:/welcome.do";
	}
}
