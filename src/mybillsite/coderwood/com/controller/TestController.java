package mybillsite.coderwood.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest httpservletrequest,
			HttpServletResponse httpservletresponse) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","hello world!");
		mv.setViewName("hello");
		return  mv;
	}
}
