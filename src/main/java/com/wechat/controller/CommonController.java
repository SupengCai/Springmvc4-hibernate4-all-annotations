package com.wechat.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wechat.dao.IUserService;
import com.wechat.model.User;

/**
 * <p>
 * CommonController.java
 * </p>
 * 
 * <pre>
 * 用户相关控制层
 * </pre>
 * 
 * @author caisupeng
 */
@Controller
public class CommonController {

	@Resource  
    private IUserService userService; 
	
	/**
	 * 搜索地点提示
	 * 
	 * @param String
	 * @return String
	 */
	@RequestMapping( value = "/test" )
	public String test( String region, String query ) {
//	、、	org.springframework.ui.velocity.VelocityEngineFactory
//		org.codehaus.jackson.map.ObjectMapper
//		com.thoughtworks.xstream.converters.ConverterLookup
		//org.hibernate.SessionFactory
		User aUser=userService.load( 1 );
		System.out.println(aUser.getName());
		return "nuist/index";
	}


	/**
	 * 给开发者的建议
	 * 
	 * @return
	 */
	@RequestMapping( value = "/suggest", method = RequestMethod.POST )
	public String suggest( Model model, HttpServletRequest request ) {

		return "/infopage";
	}
}
