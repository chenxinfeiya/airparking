package com.woniu.web.controller;

import java.io.File;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.ServletContextResource;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.model.Files;
import com.woniu.model.Messages;
import com.woniu.model.User;
import com.woniu.service.IUserService;
import com.woniu.tools.CreateUUID;
import com.woniu.tools.MD5;


@RestController
@RequestMapping("/admin/user")
public class UserController {
	
	@Resource
	private IUserService userServiceImpl;
	
	@RequestMapping("findAll")
	public User findAll(String userid) {
		User user = userServiceImpl.findAll(userid);
		return user;
		
	}
	
	@RequestMapping("uploadmany")
	public String uploadmany(@RequestParam MultipartFile[] myfile,HttpServletRequest request,HttpServletResponse response) throws Exception{
		Files files = new Files();
		for (int i = 0; i < myfile.length; i++) {
			System.out.println(myfile[i]);
			String oldname = myfile[i].getOriginalFilename();
			String extname = oldname.substring(oldname.lastIndexOf("."));
			String newname = UUID.randomUUID()+extname;
			System.out.println(oldname+"   "+newname);
			String fileName = request.getServletContext().getRealPath("/")+newname;
			System.out.println(fileName);
			
//			String userid = (String)request.getSession().getAttribute("logined");
//			User user = new User();
//			user.setUserid(userid);
//			user.setUserphoto(newname);
//			
			
			File file = new File(fileName);
			myfile[i].transferTo(file);
			
			Messages msg = new Messages();
			msg.setName(oldname);
			msg.setSize(myfile[i].getSize());
			msg.setUrl(newname);
			files.getFiles().add(msg);
		}
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(files);
		response.getWriter().write(json.toString());
		response.getWriter().close();
		
//		File file=new File(request.getRealPath("/")+"json.txt");
//		FileReader fs=new FileReader(file);
//		BufferedReader br= new BufferedReader(fs);
//		
//		String result="";
//		String line="";
//		
//		while((line=br.readLine())!=null){
//			result+=line;
//		}
//		
//		response.getWriter().write(result);
//		response.getWriter().close();
//		System.out.println("ok==========="+result);
		return null;
	}
	
	
	@RequestMapping("upload")
	public Messages save(@RequestParam MultipartFile myfile,HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println(myfile);
		String oldname = myfile.getOriginalFilename();
		String extname = oldname.substring(oldname.lastIndexOf("."));
		String newname = UUID.randomUUID()+extname;
		System.out.println(oldname+"   "+newname);
		String fileName = request.getRealPath("/")+newname;
		File file = new File(fileName);
		myfile.transferTo(file);
		//response.getWriter().print("{name:\""+oldname+"\",\"size\":"+myfile.getSize()+",\"url\":\""+newname+"\",\"thumbnail\":\"picture.jpg\"}");
		System.out.println("ok");
		Messages msg = new Messages();
		msg.setName("picture.jpg");
		msg.setSize(54655656);
		return msg;
	}
	
	@RequestMapping("getJson")
	public Messages getJson(HttpServletRequest request,HttpServletResponse response) throws Exception{
		Messages msg = new Messages();
		msg.setName("picture.jpg");
		msg.setSize(54655656);
		return msg;
	}
}
