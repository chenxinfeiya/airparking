package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Car;
import com.woniu.model.Message;
import com.woniu.service.ICarService;

@RestController
public class CarController {

	@Resource
	private ICarService carServiceImpl;
	
	@RequestMapping("save")
	private Message save(Car car) {
		Message mes = null;
		car.setUserid("1");
		try {
			carServiceImpl.save(car);
			mes = new Message(true, "上传成功");
		} catch (Exception e) {
			mes = new Message(false, "上传失败。请联系程序员小哥哥"+e);
			throw new RuntimeException(e);
		} finally {
			return mes;
		}
	}
	
	
	@RequestMapping("delete")
	private Message delete(Car car) {
		Message mes = null;
		try {
			carServiceImpl.delete(car);
			mes = new Message(true, "删除成功");
		} catch (Exception e) {
			mes = new Message(false, "删除失败。请联系程序员小哥哥"+e);
			throw new RuntimeException(e);
		} finally {
			return mes;
		}
	}
	
	@RequestMapping("findAll")
	private List finAll() {
		List<Car> list = carServiceImpl.findAll();
		return list;
	}
}
