package com.suwon.ezen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.suwon.ezen.VO.ProductVO;

@RequestMapping("/py")
@RestController
public class PythonController {
	
	  @GetMapping("/")
	    public ModelAndView list(ModelAndView model){
	        RestTemplate restTemplate = new RestTemplate();
	        String url = "http://localhost:5000/hello";
	        List<ProductVO> plist = new ArrayList<ProductVO>();
	        List<ProductVO> response = restTemplate.getForObject(url, plist.getClass());
	        System.out.println(response);
	        System.out.println();
	        
	        model.addObject("message",response);
	        model.setViewName("pylist");
	        return model;
	    }
	  
	  @GetMapping("/check")
	    public ResponseEntity<String> pycsv(@Param("buyer") String buyer, HttpServletResponse http) throws IOException{
//	    	"http://localhost:5000/check/" + buyer
	    	String url ="http://localhost:5000/check/" + buyer;
	    	http.sendRedirect(url);
	    	System.out.println(url);
	    	
	    	RestTemplate restTemplate = new RestTemplate();
			HashMap<String, String> map = new HashMap();
			
			map = restTemplate.getForObject(url, map.getClass());
			
			System.out.println(map);
			
			return new ResponseEntity<String>("엑셀 파일 생성 성공",HttpStatus.OK);
	    }
	  @GetMapping("/test")
	  public ResponseEntity<String> test(HttpServletResponse http) throws IOException{
		  String url = "http://localhost:5000/test";
		  RestTemplate res = new RestTemplate();
		  HashMap<String, String> map = new HashMap<String, String>();
		  http.sendRedirect(url);
		  map = res.getForObject(url, map.getClass());
		  for(String i : map.keySet()) {
			  System.out.println(i);
		  }
		  return new ResponseEntity<String>("성공",HttpStatus.OK);
	  }
}
