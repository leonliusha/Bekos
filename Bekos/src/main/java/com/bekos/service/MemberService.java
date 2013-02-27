package com.bekos.service;
import java.util.List;
import com.bekos.form.Member;

public interface MemberService {
	public void addMember(Member member);
	public List<Member> listMember();
	public void removeMember(Integer id);
}
