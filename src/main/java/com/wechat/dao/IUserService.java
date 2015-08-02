package com.wechat.dao;

import java.util.List;

import com.wechat.model.User;


public interface IUserService {
	public void add(User stu);  
    public void update(User stu);  
    public void delete(long id);  
    public User load(long id);  
    public List<User> list();  
}
