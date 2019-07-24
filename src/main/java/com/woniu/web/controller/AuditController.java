package com.woniu.web.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Audit;
import com.woniu.model.Message;
import com.woniu.service.IAuditService;
import com.woniu.tools.CreateUUID;

@RestController
@RequestMapping("/admin/audit")
public class AuditController {
	@Resource
	private IAuditService auditServiceImpl;
	
	@RequestMapping("addAudit")
	private Message addAudit(Audit audit) {
		Message message = null;
		try {
			String uuid = CreateUUID.getUUID();
			audit.setAuditid(uuid);
			audit.setAplytime(new Date());
			auditServiceImpl.addAudit(audit);
			message = new Message(true,"添加审核成功！");
		} catch (Exception e) {
			message = new Message(false,"添加审核失败"+e);
			throw new RuntimeException(e);
		} finally {
			return message;
		}
	}
	
	@RequestMapping("delAudit")
	private Message delAudit(Audit audit) {
		Message message = null;
		try {
			auditServiceImpl.delAudit(audit);
			message = new Message(true, "完成");
		} catch (Exception e) {
			message = new Message (false, "失败"+e);
			throw new RuntimeException(e);
		} finally {
			return message;
		}
	}
	
	@RequestMapping("updateAudit")
	private Message updateAudit(Audit audit) {
		Message message = null;
		try {
			auditServiceImpl.updateAudit(audit);
			message = new Message(true, "更新成功");
		} catch (Exception e) {
			message = new Message(false, "更新失败"+e);
			throw new RuntimeException(e);
		} finally {
			return message;
		}
	}
	
	@RequestMapping("findOne")
	private Audit findOne(String auditid) {
		return auditServiceImpl.findOne(auditid);
	}
}
