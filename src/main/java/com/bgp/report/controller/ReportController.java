package com.bgp.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.bgp.report.entity.DailyReport;
import com.bgp.report.service.DailyReportService;

@Controller
public class ReportController {

	@Autowired
	DailyReportService reportService;
	
	@RequestMapping("/report/create")
	public String createReport(String info) {
		DailyReport report = new DailyReport();
		report = JSONObject.parseObject(info,report.getClass());
		
		return reportService.insert(report).toString();
	}
}
