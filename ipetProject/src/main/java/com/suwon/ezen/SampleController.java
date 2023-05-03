package com.suwon.ezen;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.suwon.ezen.VO.SampleVO;

import lombok.extern.log4j.Log4j;

//produce는 공급하다 response에 공급한다 , 순수한 문자를 utf-8로 보낸다 
//consume은 소비하다 ,받아들이다(browser/client) 
@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	@GetMapping(value = "/a")
	public String getText() {
		
		return "index1"; //index.jsp를 연다 
	}
	
//	@GetMapping(value = "/question")
//	public String getText2(SampleVO vo ,Model model) { //플라스크와 연동 
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
	
	
	
}
