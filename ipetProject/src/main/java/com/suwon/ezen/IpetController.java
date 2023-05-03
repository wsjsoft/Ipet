package com.suwon.ezen;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;


@Controller
@RequestMapping("/sample/*")
@Log4j
public class IpetController {
	@GetMapping(value = "/a")
	public String getText() {
		
		return "index1"; //index.jsp瑜� �뿰�떎 
	}
	
//	@GetMapping(value = "/question")
//	public String getText2(SampleVO vo ,Model model) { 
//		System.out.println(vo);
//		RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:5000/hello";
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<SampleVO> request = new HttpEntity<SampleVO>(vo, headers);
//        String response = restTemplate.postForObject(url, request, String.class);
//        System.out.println(response);
//		model.addAttribute("answer", response);
//		return "answer";
//	}
	@GetMapping(value = "/index")
	public String index() {
		return "index";
	}
	@GetMapping(value = "/pro")
	public String pro() {
		return "left-sidebar";
	}
	@GetMapping(value = "/hos")
	public String hos() {
		return "right-sidebar";
	}
	@GetMapping(value = "/commu")
	public String commu() {
		return "two-sidebar";
	}
	@GetMapping(value = "/test")
	public String test() {
		return "no-sidebar";
	}
	
	
	
	
}
