package com.bgp.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.bgp.report.entity.DailyReport;
import com.bgp.report.entity.DataTable;
import com.bgp.report.service.DailyReportService;

@RestController
public class ReportController {

	@Autowired
	DailyReportService reportService;
	
	@RequestMapping("/report/create")
	public String createReport(String info) {
		DailyReport report = new DailyReport();
		report = JSONObject.parseObject(info,report.getClass());
		reportService.insert(report);
		return "index";
	}
	
	@RequestMapping("/report/getReportListByPage")
	public DataTable getReportListByPage(int page, int limit){
		return reportService.getReportListByPage(page, limit);
	}
}
