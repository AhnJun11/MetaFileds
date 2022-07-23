package metaFileds.co.kr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class URIController {
	@GetMapping("/")
	public String goIndex() {
		return "login";
	}
	
	@GetMapping("loginPage/idPwdFind")
	public void goIdPwdFind() {
	}
	
	@GetMapping("member/memberManagement")
	public void goMemberManagement() {
	}
	
	@GetMapping("member/memberDetail")
	public void goMemberDetail() {
	}

	@GetMapping("programManagement/productManagement")
	public void goproductDetail() {
	}
	
	@GetMapping("programManagement/curriculumManagement")
	public void gocurriculumDetail() {
	}
	

}
