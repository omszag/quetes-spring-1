package com.wildcodeschool.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	 @RequestMapping("/")
	 @ResponseBody
	 public String actors() {
	    return "<ul>"
	    			+"<li>"+"<a href='/doctor/1'>William Hartnell</a>"+"</li>"
	    			+"<li>"+"<a href='/doctor/10'>David tennant</a>"+"</li>"
	    			+"<li>"+"<a href='/doctor/13'>Jodie whittaker</a>"+"</li>"
	    			+"<li>"+"<a href='/doctor/12'>Peter Capaldi</a>"+"</li>"
	    
	    	   +"</ul>";
	    }
	
	 @RequestMapping("/doctor/1")
	 @ResponseBody
	 public String actors1() {
	    return "William Hartnell";
	    }
	 @RequestMapping("/doctor/10")
	 @ResponseBody
	 public String actors2() {
	    return "David tennant";
	    }
	 @RequestMapping("/doctor/13")
	 @ResponseBody
	 public String actors3() {
	    return "Jodie whittaker";
	    }
	 @RequestMapping("/doctor/12")
	 @ResponseBody
	 public String actors4() {
	    return "Peter Capaldi";
	    }
	
}
