package com.woniu.service;

import java.util.List;

import com.woniu.model.Invoice;

public interface IInvoiceService {
		void addInvoice(Invoice invoice);
		void delInvoice(Invoice invoice);
		void updateInvoice(Invoice invoice);
		Invoice findOne(String invoiceid);
		List<Invoice> findAll();
}