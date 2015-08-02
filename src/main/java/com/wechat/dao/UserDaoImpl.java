package com.wechat.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wechat.model.User;

@Repository  
public class UserDaoImpl extends BaseDao implements IUserDao {
	 @Override  
	    public void add(User stu) {  
	        getHibernateTemplate().save(stu);  
	    }  
	  
	    @Override  
	    public void update(User stu) {  
	        getHibernateTemplate().update(stu);  
	    }  
	  
	    @Override  
	    public void delete(long id) {  
	        getHibernateTemplate().delete(this.load(id));  
	    }  
	  
	    @Override  
	    public User load(long id) {  
	        return getHibernateTemplate().get(User.class, id);  
//	      return getHibernateTemplate().load(Student.class, id);  
	    }  
	  
	    @SuppressWarnings( "unchecked" )
		@Override  
	    public List<User> list() {  
	        return (List<User>)this.getHibernateTemplate().find("from user");  
	    }  
	  
	    @Override  
	    public User loadByUsername(long id) {  
	        return getHibernateTemplate().load(User.class, id);  
	    }  
}
