package cn.dayu.UserDao;

import java.util.List;

import cn.dayu.bean.User;

public interface UserDao {
	void insertUser(User user);
	void deleteUserById(Integer id);
	void updateUser(User user);
	User selectUserById(Integer id);
	List<User>selectAll();
}
