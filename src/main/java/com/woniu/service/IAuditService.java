package com.woniu.service;

import java.util.List;

import com.woniu.model.Audit;

public interface IAuditService {
		void addAudit(Audit audit);
		void delAudit(Audit audit);
		void updateAudit(Audit audit);
		Audit findOne(String auditid);
		List<Audit> findAll();
}
