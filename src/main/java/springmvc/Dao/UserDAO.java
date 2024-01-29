package springmvc.Dao;

import springmvc.Model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDAO {
	
	@Autowired
	private HibernateTemplate HibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		
		int id=(Integer)this.HibernateTemplate.save(user);
		
		return id;
		
	}

}
