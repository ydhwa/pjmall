package com.example.pjmall.frontend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;

import com.example.pjmall.frontend.dto.Goods;
import com.example.pjmall.frontend.dto.JSONResult;

@Service
public class GoodsService {
	
	@Autowired
	private OAuth2RestTemplate restTemplate;

	
	public String getList(){
		
		String endpoint = "http://localhost:8888/v1/hello";
		JSONResultGoodsList jsonResult = restTemplate.getForObject(endpoint, JSONResultGoodsList.class);
		return jsonResult.getData();
	}
	
	public Goods get(Long no){
		
		String endpoint = "http://localhost:8888/v1/hello";
		JSONResultGoods jsonResult = restTemplate.getForObject(endpoint, JSONResultGoods.class);
		return jsonResult.getData();
	}
	
	
	// DTO Class
	private static class JSONResultGoods extends JSONResult<Goods> {
	}
	private static class JSONResultGoodsList extends JSONResult<String> {
	}
}
