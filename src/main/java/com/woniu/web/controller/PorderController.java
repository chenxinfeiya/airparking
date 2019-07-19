package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Porder;
import com.woniu.service.IPorderService;

@RestController
@RequestMapping("/admin/porder")
public class PorderController {
	
	@Resource
	private IPorderService porderServiceImpl;
	
	@RequestMapping("findAll")
	private List<Porder> findAll(String userid){
		List<Porder> list = porderServiceImpl.findAll(userid);
		return list;
	}
}
