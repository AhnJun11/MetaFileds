package metaFileds.co.kr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class URIController {
	@GetMapping("/")
	public String goIndex() {
		return "login";
	}

}
