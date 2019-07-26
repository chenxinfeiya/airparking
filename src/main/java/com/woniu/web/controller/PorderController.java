package com.woniu.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Message;
import com.woniu.model.Porder;
import com.woniu.model.User;
import com.woniu.service.IPorderService;
import com.woniu.tools.CreateUUID;

@RestController
@RequestMapping("/admin/porder")
public class PorderController {
	
	@Resource
	private IPorderService porderServiceImpl;
	
	@RequestMapping("findAll")
	private List<Porder> findAll(Porder porder){
		List<Porder> list = porderServiceImpl.findAll(porder);
		return list;
	}
	

	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));        
	
	}
	
	@RequestMapping("save")
	private Message save(Porder porder,HttpSession session){
		System.out.println("PorderController.save()");
		Message message = null;
		System.out.println(((User)session.getAttribute("loginUser")).getUserid());
		porder.setUserid(((User)session.getAttribute("loginUser")).getUserid());
		porder.setOcreatetime(new Date());
		porder.setOrderid(CreateUUID.getUUID());
		try {
			porderServiceImpl.save(porder);
			message = new Message(true, "订单完成");
		} catch (Exception e) {
			message = new Message(false, "订单失败,请联系程序员小哥哥"+e);
		}  finally {
			return message;
		}
	}
	//分账
	@RequestMapping("settle")
	private Message settle(Porder porder,HttpSession session) {
		Message message = null;
		User user = (User)session.getAttribute("user");
		try {
			porderServiceImpl.settle(porder,user);
			message = new Message(true, "支付完成");
		} catch (Exception e) {
			message = new Message(false, "支付失败,请联系程序员小哥哥"+e);
		}
		return message;
	}
	
}
