package com.bekos.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import com.bekos.form.Member;
import java.util.Map;
import com.bekos.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/index4", method=RequestMethod.GET)
	public String listContacts(Map<String, Object> map){
		map.put("member", new Member());
		map.put("memberList", memberService.listMember());
		return "member";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addMember(@ModelAttribute("member") Member member, BindingResult result){
		memberService.addMember(member);
		return "redirect:/index";
	}
	
	@RequestMapping("/delete/{memberId}")
	public String deleteMember(@PathVariable("memberId") Integer memberId){
		memberService.removeMember(memberId);
		return "redirect:/index";
	}
}
