package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.woniu.mapper.AuditMapper;
import com.woniu.mapper.InvoiceMapper;
import com.woniu.model.Invoice;
import com.woniu.service.IInvoiceService;

public class IInvoiceServiceImpl implements IInvoiceService {
	@Resource
	private InvoiceMapper invoiceMapper;
	@Override
	public void addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		invoiceMapper.insert(invoice);
	}
	@Override
	public void delInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		invoiceMapper.updateByPrimaryKeySelective(invoice);
	}

	@Override
	public void updateInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		invoiceMapper.updateByPrimaryKeySelective(invoice);
	}

	@Override
	public Invoice findOne(String invoiceid) {
		// TODO Auto-generated method stub
		return invoiceMapper.selectByPrimaryKey(invoiceid);
	}

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return invoiceMapper.selectByExample(null);
	}

}
