package com.sist.web.service;

import java.util.*;

import com.sist.web.mapper.FoodMapper;
import com.sist.web.vo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements FoodService
{
	@Autowired
	private FoodMapper mapper;
	@Override
	public List<FoodVO> foodListData(Map map) {
		// TODO Auto-generated method stub
		return mapper.foodListData(map);
	}

	@Override
	public int foodTotalPage() {
		// TODO Auto-generated method stub
		return mapper.foodTotalPage();
	}

	@Override
	public FoodVO foodDetailData(int fno) {
		// TODO Auto-generated method stub
		return mapper.foodDetailData(fno);
	}

	@Override
	public List<FoodVO> foodTop10() {
		// TODO Auto-generated method stub
		return mapper.foodTop10();
	}
	
	
}
