package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.AuditMapper;
import com.woniu.model.Audit;
import com.woniu.service.IAuditService;

@Service
public class AuditServiceImpl implements IAuditService {
	
	@Resource
	private AuditMapper auditMapper;
	@Override
	public void addAudit(Audit audit) {
		auditMapper.insert(audit);
	}

	@Override
	public void delAudit(Audit audit) {
		audit.setIsfinish(true);
		auditMapper.updateByPrimaryKeySelective(audit);
	}


	@Override
	public void updateAudit(Audit audit) {
		auditMapper.updateByPrimaryKeySelective(audit);
	}

	@Override
	public Audit findOne(String auditid) {
		return auditMapper.selectByPrimaryKey(auditid);
	}

	@Override
	public List<Audit> findAll() {
		return auditMapper.selectByExample(null);
	}

}
