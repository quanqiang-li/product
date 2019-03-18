package com.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.ProductDTO;

/**
 * 登录
 * 
 * @author aisino
 *
 */
@RestController
public class ProductController {

	@Value("${server.port}")
	private Integer port;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostMapping("getProduct")
	public ProductDTO getProduct(ProductDTO productDTO) {
		logger.info("请求端口{}的产品{}", port, productDTO.toString());
		// 1.从缓存取产品 [稳定数据,使用频繁,放在缓存合适]
		ProductDTO vo = new ProductDTO();
		vo.setId(productDTO.getId());
		vo.setProductName("mate 20 PRO");
		return vo;
	}

}
