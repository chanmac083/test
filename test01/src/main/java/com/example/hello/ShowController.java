package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.session.form.SessionForm;

@Controller
@SessionAttributes("sessionForm")
public class ShowController {
	
	/**
	 * コンテンツ一覧を表示する
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/index/contents/")
	public String indexContents(Model model, SessionForm sessionForm) {
		
		sessionForm.setTitle("inputTitle");
		sessionForm.setUrl("inputUrl");
		sessionForm.setMemo("inputMemo");

		return "content/index";
	}

}
