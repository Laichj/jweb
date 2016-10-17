package cc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class TestAction {
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}

}
