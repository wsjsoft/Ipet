package com.suwon.ezen.mapper;

import java.util.List;

import com.suwon.ezen.VO.ProductVO;

import lombok.Data;

public interface ProductMapper {
	public List<ProductVO> getListAll();
	public void insert(ProductVO vo);
}
