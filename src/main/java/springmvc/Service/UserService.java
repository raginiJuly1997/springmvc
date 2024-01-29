package springmvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.UserDAO;
import springmvc.Model.User;


@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	public int createUser(User user)
	{
		return userDAO.saveUser(user);
	}

}
