package com.bekos.dao;
import java.util.List;

import com.bekos.form.Member;


public interface MemberDAO {
	public void addMember(Member member);
	public List<Member> listMember();
	public void removeMember(Integer id);
}
