package ai.msg.modules.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ai.msg.security.auth.JwtAuthenticationToken;
import ai.msg.security.model.UserContext;

@RequestMapping(value="api/v1")
@RestController
public class AnalyticsController {
	
	@Autowired
	RestTemplate restTemplate;
	
	public AnalyticsController(){
		
	}
	@RequestMapping(value="/analytics/dashboard",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody String fetchAnalyticsData(HttpServletRequest request,JwtAuthenticationToken token){
		System.out.println("inside the dashboard");
		
		 return "hello";
	}
	@RequestMapping(value="/user/profile",method={RequestMethod.GET,RequestMethod.POST})
	 public @ResponseBody UserContext get(JwtAuthenticationToken token) {
	        return (UserContext) token.getPrincipal();
	    }
}
