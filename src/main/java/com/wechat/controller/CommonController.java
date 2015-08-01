package com.wechat.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
