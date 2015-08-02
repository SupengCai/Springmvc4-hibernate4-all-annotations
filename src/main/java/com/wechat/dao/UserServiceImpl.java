package com.wechat.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wechat.model.User;

@Service( "userService" )
public class UserServiceImpl implements IUserService {

	private IUserDao stuDao;


	@Resource
	public void setStuDao( IUserDao stuDao ) {

		this.stuDao = stuDao;
	}


	@Override
	public void add( User stu ) {

		stuDao.add( stu );
	}


	@Override
	public void update( User stu ) {

		stuDao.update( stu );
	}


	@Override
	public void delete( long id ) {

		stuDao.delete( id );
	}


	@Override
	public User load( long id ) {

		return stuDao.load( id );
	}


	@Override
	public List<User> list() {

		return stuDao.list();
	}
}
