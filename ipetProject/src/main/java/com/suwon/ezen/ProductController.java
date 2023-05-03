package com.suwon.ezen;

import java.util.List;

import org.python.modules._csv.PyWriter;
import org.python.util.PythonInterpreter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.suwon.ezen.VO.ProductVO;
import com.suwon.ezen.mapper.ProductMapper;

import jep.*;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
@RequestMapping("/")
@RestController
@Log4j
public class ProductController {
	
	@Setter(onMethod_ =@Autowired )
	private ProductMapper mapper;
	
	@GetMapping("/")
	public ModelAndView home() {
		
		ModelAndView mod = new ModelAndView();
		mod.setViewName("index");
		List<ProductVO> voList = mapper.getListAll();

		return mod;
		
	}
	@PutMapping(value = "/insert", consumes="application/json; charset=utf-8", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ProductVO> insert(@RequestBody ProductVO vo ){
		log.info("등록 정보 : "+ vo );
		mapper.insert(vo);
		
		return new ResponseEntity<ProductVO>(vo,HttpStatus.OK);
	}

}
