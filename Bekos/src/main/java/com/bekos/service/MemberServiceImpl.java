package com.bekos.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bekos.dao.MemberDAO;
import com.bekos.form.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	@Transactional
	public void addMember(Member member){
		memberDAO.addMember(member);
	}

	@Transactional
	public List<Member> listMember(){
		return memberDAO.listMember();
	}
	
	@Transactional
	public void removeMember(Integer id){
		memberDAO.removeMember(id);
	}
}
