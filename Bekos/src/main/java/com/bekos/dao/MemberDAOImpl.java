package com.bekos.dao;
import java.util.List;
import com.bekos.form.Member;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addMember(Member member){
		sessionFactory.getCurrentSession().save(member);
	}
	
	public List<Member> listMember(){
		return sessionFactory.getCurrentSession().createQuery("from member").list();
	}
	
	public void removeMember(Integer id){
		Member member = (Member)sessionFactory.getCurrentSession().load(Member.class, id);
		if(null != member){
			sessionFactory.getCurrentSession().delete(member);
		}
	}
}
