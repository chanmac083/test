package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.hello.form.HelloForm;

@Controller
public class HelloController {

	@RequestMapping("/hello")
    public String index(Model model) {
		ListView list = new ListView();
		list.setNo(1);
		list.setMessage("message1");
		model.addAttribute("msg", list);
        return "hello/index";
    }
	
	@RequestMapping("/start")
	public String helloStart() {
		return "redirect:" + "hello";
	}
		
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String po(@ModelAttribute HelloForm helloForm,
//			@RequestParam String text1, Model model, RedirectAttributes redirectAttrs) {
//		model.addAttribute("val", text1);
//		model.addAttribute("check", text1.equals ("test"));
//		model.addAttribute("trueVal", "すでにニックネームが使用されています。");
//		model.addAttribute("falseVal", "使用できるニックネームです。");
//		model.addAttribute("val2", helloForm.getButtonValue());
//		System.out.println("テストテストテストテストテストテストテストテストテストテスト" + helloForm.getButtonValue());		
//		System.out.println("テストテストテストテストテストテストテストテストテストテスト" + helloForm.getNickName());
//		model.addAttribute("temp", helloForm.getNickName());
//		if (helloForm.getNickName().equals("ボタン")) {
//			System.out.println("値とったよ！！！");
//			return "hello/form";
//		} else if (helloForm.getNickName().equals("あゆみ")) {
//			System.out.println("あゆみ大好き！！！");
//			//redirectAttrs.addAttribute("val", text1);
//			return "hello/edit";
//		}
//		
//		return "hello/form";
//	}

//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String ge(Model model) {
//		model.addAttribute("val", "please type...");
//		model.addAttribute("check1", true);
//		return "hello/form";
//	}

	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String id(@PathVariable int id, Model model) {
		model.addAttribute("check", id >= 0);
		model.addAttribute("trueVal", "すでにニックネームが使用されています。");
		model.addAttribute("falseVal", "使用できるニックネームです。");
		
		return "hello/form";
	}
	
	@RequestMapping(value="hello/index", method=RequestMethod.GET)
	public String ind(Model model) {
		return "hello/index";
	}
	@RequestMapping(value="hello/edit", method=RequestMethod.GET)
	public String edi(Model model) {
		return "hello/edit";
	}
	
	
	class ListView {
		private int number;
		private String message;
		
		public void setNo(int number) {
			this.number = number;
		}
		
		public void setMessage(String message) {
			this.message = message;
		}
		
		public int getNo() {
			return number;
		}
		
		public String getMessage() {
			return message;
		}
	}
}