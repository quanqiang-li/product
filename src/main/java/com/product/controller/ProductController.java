package com.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 * 
 * @author aisino
 *
 */
@RestController
@RequestMapping("product")
public class ProductController {

	@Value("${server.port}")
	private Integer port;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostMapping("getProduct")
	public String getProduct(String productName) {
		logger.info("请求端口{}的产品{}", port, productName);
		return "请求端口" + port + "的产品" + productName;
	}

}
